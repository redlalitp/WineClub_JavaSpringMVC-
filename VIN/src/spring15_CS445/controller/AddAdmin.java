package spring15_CS445.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import spring15_CS445.model.Admin;
import spring15_CS445.model.Errors;
import spring15_CS445.model.SubscriberResponse;
import spring15_CS445.model.Validations;
import spring15_CS445.model.VinClub;

@RestController
@RequestMapping(value = "/admin") 
public class AddAdmin {
	private Admin a;
	SubscriberResponse response = new SubscriberResponse(); 
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> AddAccount(@RequestBody String json) {
		
		JSONObject obj = new JSONObject(json);
		String Name = obj.getString("name");
		
		a = new Admin(Name);
		Validations v = new Validations();
	
		if(v.isblank(Name)){
			response.errors.add(new Errors(1004,"Name must be provided"));
		}else
		if(v.isInvalidName(Name)){
			response.errors.add(new Errors(1000,"Invalid name"));
		}
		
		if(response.getErrors().isEmpty()){
			List<Admin> list = new ArrayList<Admin>(VinClub.admins);
			a.setCreator(list.get(0).getName());
			VinClub.admins.add(a);
			response.setID(a.getID());
			 Gson gson = new Gson();
			   String res = gson.toJson(response);
			   return new ResponseEntity<String>(res,HttpStatus.OK);
		}else{
			response.setID(-1);
			Gson gson = new Gson();
			   String res = gson.toJson(response);
			   return new ResponseEntity<String>(res,HttpStatus.BAD_REQUEST);
			
		}
	}
		
	
}
