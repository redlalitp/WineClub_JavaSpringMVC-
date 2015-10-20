package spring15_CS445.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring15_CS445.model.Shipment;
import spring15_CS445.model.ShipmentResponse;
import spring15_CS445.model.Subscriber;
import spring15_CS445.model.UserShipmentResponse;
import spring15_CS445.model.Validations;
import spring15_CS445.model.VinClub;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController
@RequestMapping("/sub")
public class UpdateSubsccriberDelivery {
	
	@RequestMapping(value = "/{id}/delivery", method = RequestMethod.PUT)
	public ResponseEntity<String> getInfo(@PathVariable int id,@RequestBody String json) {
		
		JSONObject obj = new JSONObject(json);
		String dow = obj.getString("dow");
		String tod = obj.getString("tod");
		
		List<Subscriber> list = new ArrayList<Subscriber>(VinClub.subs);
		Validations v = new Validations();
		
		   // check values
		   for(int i=0;i<list.size();i++ ){
		    if(id == list.get(i).getID()){
		    	list.get(i).setDow(dow);
		    	list.get(i).setTod(tod);
		    	Set<Subscriber> set = new HashSet<Subscriber>(list);
				VinClub.subs = (HashSet<Subscriber>) set;
		        break;
		    }
		   }
		
		   
		
		   
    	return new ResponseEntity<String>(HttpStatus.OK);
		      
    }
	
	@RequestMapping(value = "/{id}/delivery", method = RequestMethod.GET)	
	public ResponseEntity<String> getDetailedInfo(@PathVariable int id) {
		List<Subscriber> list = new ArrayList<Subscriber>(VinClub.subs);
		
		   // check values
		   for(int i=0;i<list.size();i++ ){
		    if(id == list.get(i).getID()){
		    	String response = "{\"dow\":\""+list.get(i).getDow()+"\",\"tod\":\""+list.get(i).getTod()+"\"}";
		    	Gson gson = new GsonBuilder().setPrettyPrinting().create();
		    		response.replace("\\", "");
				   String json = gson.toJson(response);
		    	return new ResponseEntity<String>(json,HttpStatus.OK);
		    	
		    }
		   }
		
		    	
		   
		   return new ResponseEntity<String>(HttpStatus.NOT_FOUND);    
    }
	
}
