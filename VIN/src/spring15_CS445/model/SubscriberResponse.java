package spring15_CS445.model;

import java.util.Collection;
import java.util.HashSet;

public class SubscriberResponse {
	private int id;
	public Collection<Errors> errors = new HashSet<Errors>();

	public SubscriberResponse(){
		id = -1;
	}
	
	public int getID() {
		return id;
	}

	public void setID(int iD) {
		id = iD;
	}
    
	public Collection<Errors> getErrors() {
		return errors;
	}

	
}
