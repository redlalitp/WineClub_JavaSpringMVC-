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
import spring15_CS445.model.ShipmentResponse;
import spring15_CS445.model.Subscriber;
import spring15_CS445.model.UserShipmentResponse;
import spring15_CS445.model.Validations;
import spring15_CS445.model.VinClub;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController
@RequestMapping("/sub")
public class GetShipmentInfo {
	
	@RequestMapping(value = "/{id}/shipments", method = RequestMethod.GET)
	public ResponseEntity<String> getInfo(@PathVariable int id) {
		List<Subscriber> list = new ArrayList<Subscriber>(VinClub.subs);
		Validations v = new Validations();
		List<Shipment> shipments = new ArrayList<Shipment>();
		List<UserShipmentResponse> shipmentArray = new ArrayList<UserShipmentResponse>();
		
		   // check values
		   for(int i=0;i<list.size();i++ ){
		    if(id == list.get(i).getID()){
		    	shipments = list.get(i).getShipmentList();
		        break;
		    }
		   }
		
		   for(int i=0;i<shipments.size();i++ ){
			   shipmentArray.add(new UserShipmentResponse(shipments.get(i).getSid(),shipments.get(i).getDt().toString(),shipments.get(i).getStatus()));
			  
		   }
		
		
		   Gson gson = new GsonBuilder().setPrettyPrinting().create();
		   String json = gson.toJson(shipmentArray);
    	return new ResponseEntity<String>(json,HttpStatus.OK);
		      
    }
	
	@RequestMapping(value = "/{id}/shipments/{sid}", method = RequestMethod.GET)	
	public ResponseEntity<String> getDetailedInfo(@PathVariable("id") int id,@PathVariable("sid") Long sid) {
		List<Subscriber> list = new ArrayList<Subscriber>(VinClub.subs);
		Validations v = new Validations();
		List<Shipment> shipments = new ArrayList<Shipment>();
		
		   // check values
		   for(int i=0;i<list.size();i++ ){
		    if(id == list.get(i).getID()){
		    	shipments = list.get(i).getShipmentList();
		        break;
		    }
		   }
		
		   for(int i=0;i<shipments.size();i++ ){
		    if(sid == shipments.get(i).getSid()){
		    	ShipmentResponse res = new ShipmentResponse(shipments.get(i).getDt().toString(),shipments.get(i).getStatus(),shipments.get(i).getDt().toString(),shipments.get(i).getWt().toString(),shipments.get(i).getWines());
		    	Gson gson = new GsonBuilder().setPrettyPrinting().create();
				   String json = gson.toJson(res);
		    	return new ResponseEntity<String>(json,HttpStatus.OK);
		    }
		    
		   }
		   return new ResponseEntity<String>(HttpStatus.NOT_FOUND);    
    }
	
}
