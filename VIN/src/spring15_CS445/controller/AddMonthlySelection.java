package spring15_CS445.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import spring15_CS445.model.AR;
import spring15_CS445.model.AW;
import spring15_CS445.model.IdGenerator;
import spring15_CS445.model.MonthlySelection;
import spring15_CS445.model.MonthlySelectionType;
import spring15_CS445.model.RW;
import spring15_CS445.model.Shipment;
import spring15_CS445.model.Subscriber;
import spring15_CS445.model.SubscriberResponse;
import spring15_CS445.model.VinClub;
import spring15_CS445.model.Wine;
import spring15_CS445.model.WineType;
import spring15_CS445.model.WineVariety;

@RestController
@RequestMapping(value = "/admin/monthly_selection") 
public class AddMonthlySelection {
	private RW redWs = new RW();
	private AR allRs = new AR();
	private AW allWs = new AW();
	List<Wine> wineList = new ArrayList<Wine>();
	SubscriberResponse response = new SubscriberResponse(); 
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> AddMS(@RequestBody String json) {
		JSONObject obj = new JSONObject(json);
		String variety = obj.getString("type");
		String sel_month = obj.getString("selection_month");
		JSONArray wine_arr = obj.getJSONArray("wines");
		WineType wineType;
		WineVariety wineVariety;
		String tmp;
		for (int i = 0; i < wine_arr.length(); i++){
			tmp = wine_arr.getJSONObject(i).getString("variety");
			if( tmp.equals( "RED")){
				wineVariety = WineVariety.RED;
			}else if(tmp.equals("WHITE")){
				wineVariety = WineVariety.WHITE;
			}else
				wineVariety = WineVariety.ROSE;
			
			if(wine_arr.getJSONObject(i).getString("wine_type").equals("TABLE")){
				wineType = WineType.TABLE;
			}else if(wine_arr.getJSONObject(i).getString("wine_type").equals("SWEET")){
				wineType = WineType.SWEET;
			}else
				wineType = WineType.SPARKLING;
			System.out.println(wineVariety);
			this.wineList.add(new Wine(wineVariety,
									wineType,
									wine_arr.getJSONObject(i).getString("label_name"),
									wine_arr.getJSONObject(i).getString("grape"),
									wine_arr.getJSONObject(i).getString("region"),
									wine_arr.getJSONObject(i).getString("country"),
									wine_arr.getJSONObject(i).getString("maker"),
									wine_arr.getJSONObject(i).getString("year")
									)
						);
			
		//	wineList.add(new Wine(WineVariety.RED,WineType.SWEET,"a","b","c","d","e","f"));
		}
		List<Subscriber> list = new ArrayList<Subscriber>(VinClub.subs);
		for(int i=0;i<wineList.size();i++){
			VinClub.wines.add(wineList.get(i));
			if(variety.equals("AR")){
				allRs.addWine(wineList.get(i));
			}else if(variety.equals("AW")){
				allWs.addWine(wineList.get(i));
			}else 
				redWs.addWine(wineList.get(i));
		}
		for(int i=0;i<list.size();i++){
			if(list.get(i).getPreference().name().equals(MonthlySelectionType.AR.name()))
				list.get(i).getShipmentList().add(new Shipment(WineVariety.RED,sel_month,allRs.getMs()));
			else if(list.get(i).getPreference() == MonthlySelectionType.AW)
				list.get(i).getShipmentList().add(new Shipment(WineVariety.WHITE,sel_month,allWs.getMs()));
			else list.get(i).getShipmentList().add(new Shipment(WineVariety.ROSE,sel_month,redWs.getMs()));
		}
		int id = IdGenerator.newID();
		if(variety.equals("AR")){
			allRs.setId(id);
			VinClub.MS.add(allRs);
		}else if(variety.equals("AW")){
			allWs.setId(id);
			VinClub.MS.add(allWs);
		}else{
			redWs.setId(id);
			VinClub.MS.add(redWs);
		}
			
		Set<Subscriber> set = new HashSet<Subscriber>(list);
		VinClub.subs = (HashSet<Subscriber>) set;
		String res = "{\"id\":"+id+"}";
		return new ResponseEntity<String>(res,HttpStatus.OK);
		
	}
		
	
}
