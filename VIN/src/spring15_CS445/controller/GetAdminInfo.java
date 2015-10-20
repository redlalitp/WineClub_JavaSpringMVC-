package spring15_CS445.controller;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring15_CS445.model.Admin;
import spring15_CS445.model.AdminArray;
import spring15_CS445.model.VinClub;

@RestController
@RequestMapping("/admin")
public class GetAdminInfo{
	private int ID; 
	public GetAdminInfo(int id){
		this.ID=id;
	}
	public GetAdminInfo(){
		VinClub.admins.add(new Admin());
	}
	 @RequestMapping(method = RequestMethod.GET)
	public String getInfo() {
		
		List<Admin> list = new ArrayList<Admin>(VinClub.admins);
		List<AdminArray> adminArray = new ArrayList<AdminArray>();
		   for(int i=0;i<list.size();i++ ){
		    	adminArray.add(new AdminArray(list.get(i).getID(),list.get(i).getName()));
				
		    }
		    
		   Gson gson = new Gson();
		   String json = gson.toJson(adminArray);
		   
		   return json;   
    }
	 @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getDetailedInfo(@PathVariable int id) {
		List<Admin> list = new ArrayList<Admin>(VinClub.admins);
		   for(int i=0;i<list.size();i++ ){
		    if(id == list.get(i).getID()){
		    	 Gson gson = new Gson();
				   String json = gson.toJson(list.get(i));
		    	return json;
		    }
		    
		   }
		   return "Not found";   
    }
}
