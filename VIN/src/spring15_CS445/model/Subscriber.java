package spring15_CS445.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Subscriber {
    private String name, email, phone, twitter, facebook;
    private Address address;
    private MonthlySelectionType mst;
    private int ID;
    private Date dt;
    private String tod;
    private String dow;
    private List<Shipment> shipmentList = new ArrayList<Shipment>();
   // private List<Note> notes = new ArrayList<Note>();
    public Subscriber() {
    	this.setName("Jane Doe");
    	this.setEmail("jane.doe@example.com");
    	this.setPhone("1234567890");
    	this.setAddress(new Address());
    	this.mst = MonthlySelectionType.RW;
    	this.ID = IdGenerator.newID();
    	this.tod = "Fri";
    	this.dow = "PM";
    }
    public Subscriber (String name, String email, String phone, Address address) {
    	this.setName(name);
    	this.setEmail(email);
    	this.setPhone(phone.replaceAll("[\\s\\-()]", "")); // drop all non-digit characters
    	this.setAddress(address);
    	this.mst = MonthlySelectionType.RW;
    	this.ID = IdGenerator.newID();
    	this.tod = "Fri";
    	this.dow = "PM";
    }
    public Subscriber (String name, String email, String phone, Address address, String fb, String tw) {
    	this.setName(name);
    	this.setEmail(email);
    	this.setPhone(phone.replaceAll("[\\s\\-()]", "")); // drop all non-digit characters
    	this.setAddress(address);
    	this.twitter = tw;
    	this.facebook = fb;
    	this.mst = MonthlySelectionType.RW;
    	this.ID = IdGenerator.newID();
    	this.tod = "Fri";
    	this.dow = "PM";
    }
    public Subscriber (String name, String email, String phone) {
    	this.setName(name);
    	this.setEmail(email);
    	this.setPhone(phone.replaceAll("[\\s\\-()]", "")); // drop all non-digit characters
    	this.mst = MonthlySelectionType.RW;
    	this.ID = IdGenerator.newID();
    	this.tod = "Fri";
    	this.dow = "PM";
    }

    private boolean isMatchName(String kw) {
    	String regex = "(?i).*" + kw + ".*";
    	return this.getName().matches(regex);
    }

    private boolean isMatchEmail(String kw) {
    	String regex = "(?i).*" + kw + ".*";
    	return this.getEmail().matches(regex);
    }

    private boolean isMatchPhone(String kw) {
    	String s = kw.replaceAll("[\\s\\-()]", ""); // drop all non-digit characters from search string
    	String regex = "(?i).*" + s + ".*";
    	return this.getPhone().matches(regex);
    }
    public boolean isMatch(String kw) {
    	if (isMatchName(kw) || isMatchEmail(kw) || isMatchPhone(kw)) {
    		return true;
    	} else return false;
    }

    public int getID() {
    	return this.ID;
    }

    public void updateInfo(String name, String email, String phone) {
    	this.setName(name);
    	this.setEmail(email);
    	this.setPhone(phone);
    }
    
    public MonthlySelectionType getPreference() {
    	return mst;
    }
    
    public void setPreference(MonthlySelectionType t) {
    	this.mst = t;
    }
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Shipment> getShipmentList() {
		return shipmentList;
	}
	public void setShipmentList(List<Shipment> shipmentList) {
		this.shipmentList = shipmentList;
	}
	public String getTod() {
		return tod;
	}
	public void setTod(String tod) {
		this.tod = tod;
	}
	public String getDow() {
		return dow;
	}
	public void setDow(String dow) {
		this.dow = dow;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
