package spring15_CS445.controller;

import java.util.Collection;

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
import com.google.gson.GsonBuilder;

import spring15_CS445.model.Address;
import spring15_CS445.model.Errors;
import spring15_CS445.model.Subscriber;
import spring15_CS445.model.SubscriberResponse;
import spring15_CS445.model.Validations;
import spring15_CS445.model.VinClub;

@RestController
@RequestMapping(value = "/sub") 
public class AddSubscriber{
	private Address a;
	private Subscriber s;
	private String name,email, phone, twitter, facebook;
	private String street, city, state, zip;
	private SubscriberResponse response = new SubscriberResponse();
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> addAccount(@RequestBody String json) {
		JSONObject obj = new JSONObject(json);
		this.name = obj.getString("name");
		this.email = obj.getString("email");
		this.phone = obj.getString("phone");
		this.facebook = obj.getString("facebook");
		this.twitter = obj.getString("twitter");
		JSONObject addr = obj.getJSONObject("address");
		this.street = addr.getString("street");
		this.city = addr.getString("city");
		this.state = addr.getString("state");
		this.zip = addr.getString("zip");
		a = new Address(this.street, this.city, this.state, this.zip);
		s = new Subscriber (this.name, this.email, this.phone, a, this.facebook, this.twitter);
		Validations v = new Validations();
	
		if(v.isblank(this.street)){
			//return new AddSubscriberResponse(0, false, "No Street address specified");
		    response.errors.add(new Errors(1004,"Address must be provided"));
		}
		if(v.isblank(this.city)){
			//return new AddSubscriberResponse(0, false, "No city specified");
			response.errors.add(new Errors(1006,"City must be provided"));
		}
		if(v.isblank(this.state)){
			//return new AddSubscriberResponse(0, false, "No state specified");
			response.errors.add(new Errors(1008,"State must be provided"));
		}
		if(v.isblank(this.zip)){
			//return new AddSubscriberResponse(0, false, "No zip code specified");
			response.errors.add(new Errors(1010,"Zip code must be provided"));
		}
		if(v.isblank(this.name)){
			//return new AddSubscriberResponse(0, false, "No subscriber name specified");
			response.errors.add(new Errors(1000,"Name must be provided"));
		}
		if(v.isblank(this.email)){
			//return new AddSubscriberResponse(0, false, "No email specified");
			response.errors.add(new Errors(1002,"Email must be provided"));
		}
		if(v.isblank(this.phone)){
			//return new AddSubscriberResponse(0, false, "No phone number specified");
			response.errors.add(new Errors(1012,"Phone number must be provided"));
		}
		if (v.addressInBannedState(a)) {
			//return new AddSubscriberResponse(0, false, "Cannot ship to this state");
			response.errors.add(new Errors(1009,"Cannot ship to this state"));
		}
		if (v.userHasAccount(VinClub.subs, s)) {
			//return new AddSubscriberResponse(0, false, "User already has an account");
			response.errors.add(new Errors(1014,"User with this email address already has an account"));
		}
		if(v.isInvalidName(s.getName())) {
			//return new AddSubscriberResponse(0, false, "Invalid or no name provided");
			response.errors.add(new Errors(1001,"Invalid name"));
		}
		if(v.isInvalidEmail(s.getEmail())) {
			//return new AddSubscriberResponse(0, false, "Invalid or no email address provided");
			response.errors.add(new Errors(1003,"Invalid email address"));
		}
		/*if(v.isInvalidStreet(a)) {
			//return new AddSubscriberResponse(1005, false, "Invalid street");
			response.errors.add(new Errors(1005,"Invalid address"));
		}*/
		if(v.isInvalidCity(a)) {
			//return new AddSubscriberResponse(0, false, "Invalid city name");
			response.errors.add(new Errors(1007,"Invalid city"));
		}
		if(v.isInvalidZipCode(a)) {
			//return new AddSubscriberResponse(0, false, "Invalid zip code");
			response.errors.add(new Errors(1011,"Invalid zip code"));
		}
		/*if(v.isInvalidPhone(s.getPhone())) {
			//return new AddSubscriberResponse(0, false, "Invalid phone number");
			response.errors.add(new Errors(1017,"Invalid phone number"));
		}*/
		if(response.getErrors().isEmpty()){
			VinClub.subs.add(s);
			response.setID(s.getID());
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			   String res = gson.toJson(response);
			   return new ResponseEntity<String>(res,HttpStatus.OK);
		}else{
			response.setID(-1);
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			   String res = gson.toJson(response);
			   return new ResponseEntity<String>(res,HttpStatus.BAD_REQUEST);
			
		}
	}
	
	
}
