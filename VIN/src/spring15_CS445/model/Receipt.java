package spring15_CS445.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Receipt {
	private int id;
	private Date date;
	private String time;
	private int subscriber;
	private String name;
	private String recieved_by;
	
	public Receipt(){
		setID(IdGenerator.newID());
		setDt(new Date());
		setTOD(new Date().toString().split(" ")[3]);
	}
	
	public Receipt(String name, int sid){
		List<Subscriber> list = new ArrayList<Subscriber>(VinClub.subs);
		 for(int i=0;i<list.size();i++ ){
			    if(sid == list.get(i).getID()){
			    	setSubName(list.get(i).getName());
			    }
		  }
		setID(IdGenerator.newID());
		setDt(new Date());
		setTOD(new Date().toString().split(" ")[3]);
		setRecieverName(name);
		setSubID(sid);
	}

	public int getID() {
		return id;
	}

	public void setID(int iD) {
		id = iD;
	}

	public Date getDt() {
		return date;
	}

	public void setDt(Date dt) {
		this.date = dt;
	}

	public String getTOD() {
		return time;
	}

	public void setTOD(String tOD) {
		time = tOD;
	}

	public int getSubID() {
		return subscriber;
	}

	public void setSubID(int subID) {
		this.subscriber = subID;
	}

	public String getSubName() {
		return name;
	}

	public void setSubName(String subName) {
		this.name = subName;
	}

	public String getRecieverName() {
		return recieved_by;
	}

	public void setRecieverName(String recieverName) {
		this.recieved_by = recieverName;
	}
}
