package spring15_CS445.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import spring15_CS445.model.Errors;
import spring15_CS445.model.Note;
import spring15_CS445.model.Shipment;
import spring15_CS445.model.Subscriber;
import spring15_CS445.model.SubscriberResponse;
import spring15_CS445.model.Validations;
import spring15_CS445.model.VinClub;
@RestController
@RequestMapping(value = "/sub")
public class CreateNote {
	private Note n;
	SubscriberResponse response = new SubscriberResponse(); 
	
	@RequestMapping(value = "/{id}/wines/{wid}/notes",method = RequestMethod.POST)
	public  @ResponseBody ResponseEntity<String> AddWineNote(@PathVariable("id") int id,
															 @PathVariable("wid") Long wid,
															 @RequestBody String json) {
		JSONObject obj = new JSONObject(json);
		String content = obj.getString("content");
		int flag =0;
		List<Subscriber> list = new ArrayList<Subscriber>(VinClub.subs);
		List<Shipment> shipments = new ArrayList<Shipment>();
		
		n = new Note(content);
		for(int i=0;i<list.size();i++ ){
		    if(id == list.get(i).getID()){
		    	shipments = list.get(i).getShipmentList();
		        flag = 1;
		    	break;
		    }
		   }
		if(flag == 0){
			response.errors.add(new Errors(1021,"No subscriber with id"+id));
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			   String res = gson.toJson(response);
			return new ResponseEntity<String>(res,HttpStatus.NOT_FOUND);
		}
		flag  = 0;	
		for(int i=0;i<shipments.size();i++ )
			for(int j=0;j<shipments.get(i).getWines().size();j++ ){
		      if(wid == shipments.get(i).getWines().get(j).getID()){
		    	  shipments.get(i).getWines().get(j).getNotes().add(n);
		    	  response.setID(n.getId());
		    	  Gson gson = new GsonBuilder().setPrettyPrinting().create();
				  String res = gson.toJson(response);
		    	  return new ResponseEntity<String>(res,HttpStatus.OK);
					
		      }
			}
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
			
		}
	
	@RequestMapping(value = "/{id}/shipments/{sid}/notes",method = RequestMethod.POST)
	public  @ResponseBody ResponseEntity<String> AddNote(@PathVariable("id") int id,
															 @PathVariable("sid") Long sid,
															 @RequestBody String json) {
		JSONObject obj = new JSONObject(json);
		String content = obj.getString("content");
		int flag =0;
		List<Subscriber> list = new ArrayList<Subscriber>(VinClub.subs);
		List<Shipment> shipments = new ArrayList<Shipment>();
		
		n = new Note(content);
		for(int i=0;i<list.size();i++ ){
		    if(id == list.get(i).getID()){
		    	shipments = list.get(i).getShipmentList();
		        flag = 1;
		    	break;
		    }
		   }
		if(flag == 0){
			response.errors.add(new Errors(1021,"No subscriber with id"+id));
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			   String res = gson.toJson(response);
			return new ResponseEntity<String>(res,HttpStatus.NOT_FOUND);
		}
		flag  = 0;	
		for(int i=0;i<shipments.size();i++ )
			  if(sid == shipments.get(i).getSid()){
		    	  shipments.get(i).getNotes().add(n);
		    	  response.setID(n.getId());
		    	  Gson gson = new GsonBuilder().setPrettyPrinting().create();
				  String res = gson.toJson(response);
		    	  return new ResponseEntity<String>(res,HttpStatus.OK);
					
		      }
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
			
		}
	}
		


