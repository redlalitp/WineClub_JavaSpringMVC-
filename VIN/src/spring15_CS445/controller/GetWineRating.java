package spring15_CS445.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring15_CS445.model.Shipment;
import spring15_CS445.model.Subscriber;
import spring15_CS445.model.Validations;
import spring15_CS445.model.VinClub;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
@RestController
@RequestMapping("/sub")
public class GetWineRating{
	
	
	
	@RequestMapping(value = "/{id}/wines/{wid}/rating", method = RequestMethod.GET)
	public ResponseEntity<String> getWineInfo(@PathVariable("id") int id,@PathVariable("wid") int wid) {
		List<Subscriber> list = new ArrayList<Subscriber>(VinClub.subs);
		List<Shipment> shipments = new ArrayList<Shipment>();
		
		for(int i=0;i<list.size();i++ ){
		    if(id == list.get(i).getID()){
		    	shipments = list.get(i).getShipmentList();
		        break;
		    }
		   }
		for(int i=0;i<shipments.size();i++ )
			for(int j=0;j<shipments.get(i).getWines().size();j++ ){
		      if(wid == shipments.get(i).getWines().get(j).getID()){
		    	  Gson gson = new GsonBuilder().setPrettyPrinting().create();
				   String json = gson.toJson(shipments.get(i).getWines().get(j).getRating());
		    	return new ResponseEntity<String>(json,HttpStatus.OK);
		      }
			}      
		return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
    }
	
	
}
