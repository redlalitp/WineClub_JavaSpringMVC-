package spring15_CS445.controller;
import java.util.ArrayList;
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

import spring15_CS445.model.Admin;
import spring15_CS445.model.Errors;
import spring15_CS445.model.SubscriberResponse;
import spring15_CS445.model.Validations;
import spring15_CS445.model.VinClub;

@RestController
@RequestMapping(value = "/admin") 
public class ModifyAdmin{
	SubscriberResponse response = new SubscriberResponse(); 
	
	@RequestMapping(value = "/{id}",method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<String> ModifyAccount(@PathVariable int id,@RequestBody String json) {
		
		JSONObject obj = new JSONObject(json);
		String name = obj.getString("name");
		
		List<Admin> list = new ArrayList<Admin>(VinClub.admins);
		Validations v = new Validations();
		Admin a1 = new Admin();
		   // check values
		   for(int i=0;i<list.size();i++ ){
		    if(id == list.get(i).getID()){
		    	a1 = list.get(i);
		    	if(v.isblank(name)){
					response.errors.add(new Errors(1000,"Name must be provided"));
				}else
				if(v.isInvalidName(name)) {
					response.errors.add(new Errors(1001,"Invalid name"));
				}
				if(response.getErrors().isEmpty()){
					a1.updateInfo(name);
					list.remove(i);
					list.add(a1);
					Set<Admin> set = new HashSet<Admin>(list);
					VinClub.admins = (HashSet<Admin>) set;
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
	

