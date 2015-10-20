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
public class GetNoteInfo{
	
	@RequestMapping(value = "/{id}/shipments/{sid}/notes", method = RequestMethod.GET)
	public ResponseEntity<String> getShipmentInfo(@PathVariable("id") int id,@PathVariable("sid") int sid) {
		List<Subscriber> list = new ArrayList<Subscriber>(VinClub.subs);
		Validations v = new Validations();
		List<Shipment> shipments = new ArrayList<Shipment>();
		
		   // check value
		   for(int i=0;i<list.size();i++ ){
		    if(id == list.get(i).getID()){
		    	shipments = list.get(i).getShipmentList();
		        break;
		    }
		   }
		
		   for(int i=0;i<shipments.size();i++ ){
		    if(sid == shipments.get(i).getSid()){
		    	Gson gson = new GsonBuilder().setPrettyPrinting().create();
				   String json = gson.toJson(shipments.get(i).getNotes());
		    	return new ResponseEntity<String>(json,HttpStatus.OK);
		    }
		    
		   }
		   return new ResponseEntity<String>(HttpStatus.NOT_FOUND);     
    }
	
	@RequestMapping(value = "/{id}/shipments/{sid}/notes/{nid}", method = RequestMethod.GET)
	public ResponseEntity<String> getShipmentInfo(@PathVariable("id") int id,
			                                      @PathVariable("sid") int sid,
			                                      @PathVariable("nid") int nid) {
		
		List<Subscriber> list = new ArrayList<Subscriber>(VinClub.subs);
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
		    	for(int j=0;j<shipments.get(i).getNotes().size();j++ ){
		    		if(sid == shipments.get(i).getSid()){
		    			Gson gson = new GsonBuilder().setPrettyPrinting().create();
						   String json = gson.toJson(shipments.get(i).getNotes().get(j));
				    	return new ResponseEntity<String>(json,HttpStatus.OK);
		    		}
		    	}
		    }
		   }
		   return new ResponseEntity<String>(HttpStatus.NOT_FOUND);     
    }
	
	@RequestMapping(value = "/{id}/wines/{wid}/notes", method = RequestMethod.GET)
	public ResponseEntity<String> getWineInfo(@PathVariable("id") int id,@PathVariable("wid") int wid) {
		List<Subscriber> list = new ArrayList<Subscriber>(VinClub.subs);
		Validations v = new Validations();
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
				   String json = gson.toJson(shipments.get(i).getWines().get(j).getNotes());
		    	return new ResponseEntity<String>(json,HttpStatus.OK);
		      }
			}      
		return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
    }
	
	@RequestMapping(value = "/{id}/wines/{wid}/notes/{nid}", method = RequestMethod.GET)
	public ResponseEntity<String> getWineInfo(@PathVariable("id") int id,
											  @PathVariable("wid") int wid,
											  @PathVariable("nid") int nid) {
		
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
		    	  for(int k=0;k<shipments.get(i).getWines().get(j).getNotes().size();k++ ){
				      if(nid == shipments.get(i).getWines().get(j).getNotes().get(k).getId()){
				    	  Gson gson = new GsonBuilder().setPrettyPrinting().create();
						   String json = gson.toJson(shipments.get(i).getWines().get(j).getNotes().get(k));
				    	    return new ResponseEntity<String>(json,HttpStatus.OK);
				      }
		    	  }
		      }
			}      
		return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
    }
}
