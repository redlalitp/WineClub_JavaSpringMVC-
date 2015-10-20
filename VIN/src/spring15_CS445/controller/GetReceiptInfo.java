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

import spring15_CS445.model.Receipt;
import spring15_CS445.model.ReceiptArray;
import spring15_CS445.model.VinClub;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
@RestController
@RequestMapping("/receipt")
public class GetReceiptInfo {
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<String> getDetailedInfo(@PathVariable int id) {
		List<Receipt> list = new ArrayList<Receipt>(VinClub.receipts);
		   for(int i=0;i<list.size();i++ ){
		    if(id == list.get(i).getID()){
		    	 Gson gson = new GsonBuilder().setPrettyPrinting().create();
				   String json = gson.toJson(list.get(i));
		    	return new ResponseEntity<String>(json,HttpStatus.OK);
		    }
		    
		   }
		   return new ResponseEntity<String>(HttpStatus.NOT_FOUND);   
    }
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String> getInfo() {
		List<Receipt> list = new ArrayList<Receipt>(VinClub.receipts);
		List<ReceiptArray> receiptArray = new ArrayList<ReceiptArray>();
		if(list.size()>0){
		   for(int i=0;i<list.size();i++ ){
			   receiptArray.add(new ReceiptArray(list.get(i).getID(),list.get(i).getDt().toString(),list.get(i).getSubID(),list.get(i).getSubName()));
			  
		   }
		}else
			receiptArray = null;
		
	   Gson gson = new GsonBuilder().setPrettyPrinting().create();
	   String json = gson.toJson(receiptArray);
	   return new ResponseEntity<String>(json,HttpStatus.OK);
		      
    }
}
