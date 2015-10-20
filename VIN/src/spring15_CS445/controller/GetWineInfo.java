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

import spring15_CS445.model.VinClub;
import spring15_CS445.model.Wine;
import spring15_CS445.model.WineResponse;
@RestController
@RequestMapping("/wines")
public class GetWineInfo {
	
	WineResponse response;
	@RequestMapping(value = "/{wid}", method = RequestMethod.GET)
	public ResponseEntity<String> getInfo(@PathVariable int wid) {
		List<Wine> list = new ArrayList<Wine>(VinClub.wines);
		response = new WineResponse();
		//java.util.Iterator<Wine> iterator = list.iterator(); 
		   // check values
		   for(int i=0;i<list.size();i++ ){
		    if(wid == list.get(i).getID()){
		    	//return new GetWineInfoResponse(true,list.get(i));
		    	response.setCountry(list.get(i).getCountry());
		    	response.setGrape(list.get(i).getGrape());
		    	response.setLable(list.get(i).getLabelName());
		    	response.setMaker(list.get(i).getMaker());
		    	response.setRegion(list.get(i).getRegion());
		    	response.setVar(list.get(i).getVariety().toString());
		    	response.setVt(list.get(i).getType().toString());
		    	response.setWid(list.get(i).getID());
		    	response.setYear(list.get(i).getYear());
		    	response.setRating(list.get(i).getRating());
		    	response.setRating_count(list.get(i).getNumberOfRatings());
		    	Gson gson = new GsonBuilder().setPrettyPrinting().create();
				   String json = gson.toJson(response);
		    	return new ResponseEntity<String>(json,HttpStatus.OK);
		    }
		    
		   }
		   return new ResponseEntity<String>(HttpStatus.NOT_FOUND);  
    }
}
