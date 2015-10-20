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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import spring15_CS445.model.Subscriber;
import spring15_CS445.model.VinClub;

@RestController
@RequestMapping("/sub")
public class GetSubscriberInfo {
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<String> getInfo(@PathVariable int id) {
		List<Subscriber> list = new ArrayList<Subscriber>(VinClub.subs);
		   for(int i=0;i<list.size();i++ ){
		    if(id == list.get(i).getID()){
		    	Gson gson = new GsonBuilder().setPrettyPrinting().create();
				   String json = gson.toJson(list.get(i));
		    	return new ResponseEntity<String>(json,HttpStatus.OK);
		    }
		    
		   }
		   return new ResponseEntity<String>(HttpStatus.NOT_FOUND);   
    }
}
