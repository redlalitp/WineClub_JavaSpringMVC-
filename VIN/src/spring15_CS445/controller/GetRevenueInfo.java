package spring15_CS445.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import spring15_CS445.model.Receipt;
import spring15_CS445.model.RevenueResponse;
import spring15_CS445.model.VinClub;

@RestController
@RequestMapping("/admin")
public class GetRevenueInfo {
	private int startDate;
	private int endDate;
	public GetRevenueInfo(int sDate,int eDate){
		this.startDate = sDate;
		this.endDate = eDate;
	}
	public GetRevenueInfo() {
		this.startDate = 0;
		this.endDate = 0;
	}
	
	@RequestMapping(value = "/revenue", method = RequestMethod.GET)
	public ResponseEntity<String> getInfo() {
		int Date;
		int count =0;
		double wineR =0;
		double DeliveryR =0;
		List<Receipt> list = new ArrayList<Receipt>(VinClub.receipts);
		  if(this.startDate != 0 && this.endDate != 0){
			for(int i=0;i<list.size();i++ ){
				Date = Integer.parseInt(new SimpleDateFormat("YYYYMMDD").format(list.get(i).getDt()).toString());
				if(Date >= this.startDate && Date <= this.endDate)
					count ++;
		    }
		  }else
			  count = list.size();
          	
		   wineR = count * 49.5;
		   DeliveryR = count * 6.5;
		   
		  		   
		   	   
		   Gson gson = new GsonBuilder().setPrettyPrinting().create();
		   String json = gson.toJson(new RevenueResponse(count,0,wineR,DeliveryR));
    	   return new ResponseEntity<String>(json,HttpStatus.OK);   
    }
	
}

