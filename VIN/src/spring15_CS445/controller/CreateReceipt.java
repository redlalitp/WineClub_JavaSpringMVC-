package spring15_CS445.controller;

import java.util.Collection;

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
import spring15_CS445.model.Receipt;
import spring15_CS445.model.SubscriberResponse;
import spring15_CS445.model.Validations;
import spring15_CS445.model.VinClub;


@RestController
@RequestMapping(value = "/receipt")
public class CreateReceipt {
	private Receipt r;
	SubscriberResponse response = new SubscriberResponse(); 
	
	@RequestMapping(/*value="/{sid}",*/method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> AddReceipt(/*@PathVariable int sid,*/
														   @RequestBody String json) {
		JSONObject obj = new JSONObject(json);
		String Name = obj.getString("name");
		int sid = obj.getInt("subscriber");
		r = new Receipt(Name,sid);
		Validations v = new Validations();
	
		if(v.isblank(Name)){
			response.errors.add(new Errors(1004,"Name must be provided"));
		}else
		if(v.isInvalidName(Name)){
			response.errors.add(new Errors(1000,"Invalid name"));
		}
		if(!v.isASubscriber(sid,VinClub.subs)){
			response.errors.add(new Errors(1018,"No Subscriber with id"+sid));
		}
		if(response.getErrors().isEmpty()){
			for(int i=0;i<VinClub.subs.size();i++ )
				   for(int j=0;j<VinClub.subs.iterator().next().getShipmentList().size();j++ ){
			            if(VinClub.subs.iterator().next().getShipmentList().get(j).getSid() == sid){
			            	VinClub.subs.iterator().next().getShipmentList().get(j).setStatus("DELIVERED");
			            }
				   }
			VinClub.receipts.add(r);
			response.setID(r.getID());
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			  String res = gson.toJson(response);
	    	  return new ResponseEntity<String>(res,HttpStatus.OK);
		}else{
			response.setID(-1);
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
			
		}
	}
		
	
}
