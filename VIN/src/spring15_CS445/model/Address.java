package spring15_CS445.model;

public class Address {
    private String street, city, state, zip;
    
    public Address() {
        this.setStreet("123 Main ST, Apt 2F");
        this.setCity("Anytown");
        this.setState("Anystate");
        this.setZip("12345");
    }
    
    public Address(String street, String city, String state, String zip) {
    	this.setStreet(street);
    	this.setCity(city);
    	this.setState(state);
    	this.setZip(zip);
    }

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
}
