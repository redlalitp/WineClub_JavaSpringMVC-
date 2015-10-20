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

import spring15_CS445.model.MonthlySelection;
import spring15_CS445.model.ViewMonthlySelectionResponse;
import spring15_CS445.model.VinClub;

@RestController
@RequestMapping("/admin/monthly_selection")
public class ViewMonthlySelection {
	private ViewMonthlySelectionResponse response;	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<String>getInfo(@PathVariable int id) {
		List<MonthlySelection> list = new ArrayList<MonthlySelection>(VinClub.MS);
		
		   for(int i=0;i<list.size();i++ ){
			   if(id == list.get(i).getId()){
				   
				 response =  new ViewMonthlySelectionResponse(
						   list.get(i).getId(),
						   list.get(i).getYm().toString(),
						   list.get(i).getMst().toString(),
						   "",0,
						   list.get(i).getMs());
				   
			   Gson gson = new GsonBuilder().setPrettyPrinting().create();
			   String json = gson.toJson(response);
			   return new ResponseEntity<String>(json,HttpStatus.OK);
		    	
		    }
		    
		   
		   }   
		   return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
    }
}
