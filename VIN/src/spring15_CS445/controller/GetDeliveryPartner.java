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

import spring15_CS445.model.Address;
import spring15_CS445.model.DeliveryPartnerResponse;
import spring15_CS445.model.Subscriber;
import spring15_CS445.model.VinClub;

@RestController
@RequestMapping("/partner")
public class GetDeliveryPartner {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String> getInfo() {
		List<Subscriber> list = new ArrayList<Subscriber>(VinClub.subs);
		List<DeliveryPartnerResponse> deliver_to = new ArrayList<DeliveryPartnerResponse>();
		
		   for(int i=0;i<list.size();i++ ){
			   for(int j=0;j<list.get(i).getShipmentList().size();j++ ){
				   if("TBD" == list.get(i).getShipmentList().get(j).getStatus()){
					   
				       
					   deliver_to.add(new DeliveryPartnerResponse(list.get(i).getName(),
							   										list.get(i).getPhone(),
							   										list.get(i).getEmail(),
							   										list.get(i).getAddress(),
							   										list.get(i).getDow(),
							   										list.get(i).getTod(),
							   										list.get(i).getPreference().toString()));
					   
				   }
		    
		       }
			   
          }
		   Gson gson = new GsonBuilder().setPrettyPrinting().create();
		   String json = gson.toJson(deliver_to);
	       return new ResponseEntity<String>(json,HttpStatus.OK);
	      
}
}
