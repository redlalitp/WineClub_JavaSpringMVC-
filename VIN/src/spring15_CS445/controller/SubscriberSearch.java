package spring15_CS445.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring15_CS445.model.Note;
import spring15_CS445.model.NoteArray;
import spring15_CS445.model.Shipment;
import spring15_CS445.model.ShipmentArray;
import spring15_CS445.model.Subscriber;
import spring15_CS445.model.SubscriberSearchResponse;
import spring15_CS445.model.Validations;
import spring15_CS445.model.VinClub;
import spring15_CS445.model.Wine;
import spring15_CS445.model.WineArray;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
@RestController
@RequestMapping("/sub")
public class SubscriberSearch{
	
	@RequestMapping(value = "/{id}/search", method = RequestMethod.GET)
	public ResponseEntity<String> subscriberSearch(@PathVariable("id") int id,@RequestParam(value="q", required=false) String q) {
		if(q==null){
			q="";
		}else{
			q=q.replace("\"", "");
		}
		List<Subscriber> list = new ArrayList<Subscriber>(VinClub.subs);
		Validations v = new Validations();
		List<ShipmentArray> shipments = new ArrayList<ShipmentArray>();
		List<Shipment> shpmnts = new ArrayList<Shipment>();
		List<NoteArray> notes = new ArrayList<NoteArray>();
		List<WineArray> wines = new ArrayList<WineArray>();
		SubscriberSearchResponse response;
		   // check values
		int flag = 0;
		   for(int i=0;i<list.size();i++ ){
		    if(id == list.get(i).getID()){
		    	shpmnts = list.get(i).getShipmentList();
		        flag = 1;
		    	break;
		    }
		   }
		   
		   
		   
		   for(int i=0;i<shpmnts.size();i++){
			   if(shpmnts.get(i).getDt().contains(q)|| q=="")
				    shipments.add(new ShipmentArray(shpmnts.get(i).getSid(),shpmnts.get(i).getDt()));   
		   }
		   
		   for(int i=0;i<shpmnts.size();i++ ){
			    for(int k=0;k<shpmnts.get(i).getNotes().size();k++ ){
			    	if(shpmnts.get(i).getNotes().get(k).getContent().contains(q) || q==""){
			    		notes.add(new NoteArray(shpmnts.get(i).getNotes().get(k).getId(),
			    								shpmnts.get(i).getNotes().get(k).getContent()));
			    	}
			    }
			    for(int k=0;k<shpmnts.get(i).getWines().size();k++ ){
			    	if(shpmnts.get(i).getWines().get(k).getLabelName().contains(q) || q==""){
			    		wines.add(new WineArray(shpmnts.get(i).getWines().get(k).getID(),
			    							shpmnts.get(i).getWines().get(k).getLabelName()));
			    	}
			    }
			    for(int j=0;j<shpmnts.get(i).getWines().size();j++ ){
			    	for(int k=0;k<shpmnts.get(i).getWines().get(j).getNotes().size();k++ ){
				    	if(shpmnts.get(i).getWines().get(j).getNotes().get(k).getContent().contains(q) || q==""){
				    		notes.add(new NoteArray(shpmnts.get(i).getWines().get(j).getNotes().get(k).getId(),
				    								shpmnts.get(i).getWines().get(j).getNotes().get(k).getContent()));
				    	}
			    	}
		   	}
		   }
		   if(flag == 1){
			   response = new SubscriberSearchResponse(wines,notes,shipments);
			   Gson gson = new GsonBuilder().setPrettyPrinting().create();
			   String json = gson.toJson(response);
			   return new ResponseEntity<String>(json,HttpStatus.OK);
		   }else{
		       return new ResponseEntity<String>(HttpStatus.NOT_FOUND);    
		   }
    }
	
	
}
