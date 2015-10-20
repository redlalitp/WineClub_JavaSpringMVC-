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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import spring15_CS445.model.Address;
import spring15_CS445.model.Errors;
import spring15_CS445.model.Subscriber;
import spring15_CS445.model.SubscriberResponse;
import spring15_CS445.model.Validations;
import spring15_CS445.model.VinClub;

@RestController
@RequestMapping(value = "/sub") 
public class ModifySubscriber {
	private String name,email, phone, twitter, facebook;
	SubscriberResponse response = new SubscriberResponse(); 
	
	@RequestMapping(value = "/{id}",method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<String> ModifyAccount(@PathVariable int id,@RequestBody String json) {
		
		List<Subscriber> list = new ArrayList<Subscriber>(VinClub.subs);
		Validations v = new Validations();
		Subscriber s1 = new Subscriber();
		JSONObject obj = new JSONObject(json);
		
		this.name = obj.getString("name");
		this.email = obj.getString("email");
		this.phone = obj.getString("phone");
		this.facebook = obj.getString("facebook");
		this.twitter = obj.getString("twitter");
		
		   // check values
		   for(int i=0;i<list.size();i++ ){
		    if(id == list.get(i).getID()){
		    	s1 = list.get(i);
		    	if(v.isblank(this.name)){
					response.errors.add(new Errors(1000,"Name must be provided"));
				}
				if(v.isblank(this.email)){
					response.errors.add(new Errors(1002,"Email must be provided"));
				}
				if(v.isblank(this.phone)){
					response.errors.add(new Errors(1012,"Phone number must be provided"));
				}
				if(v.isInvalidName(this.name)) {
					response.errors.add(new Errors(1001,"Invalid name"));
				}
				if(v.isInvalidEmail(this.email)) {
					response.errors.add(new Errors(1003,"Invalid email address"));
				}
				/*if(v.isInvalidPhone(this.phone)) {
					response.errors.add(new Errors(1017,"Invalid phone number"));
				}*/
				
				if(response.getErrors().isEmpty()){
					s1.updateInfo(this.name, this.email, this.phone);
					list.remove(i);
					list.add(s1);
					Set<Subscriber> set = new HashSet<Subscriber>(list);
					VinClub.subs = (HashSet<Subscriber>) set;
					return new ResponseEntity<String>(HttpStatus.OK);
				}else{
					response.setID(-1);
					Gson gson = new Gson();
					   String res = gson.toJson(response);
					return new ResponseEntity<String>(res,HttpStatus.BAD_REQUEST);
					
				}
		    	
		    }
		    	
		   }
		   return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		  }
		
		
		
	}
	

