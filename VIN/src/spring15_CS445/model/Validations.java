package spring15_CS445.model;

import java.util.Collection;
import java.util.Iterator;

public class Validations {
	public boolean userHasAccount(Collection<Subscriber> subs, Subscriber s) {
		String userPhone = s.getPhone();
		for(Iterator<Subscriber> iterator = subs.iterator(); iterator.hasNext();) {
	        if(userPhone == iterator.next().getPhone())
                return true;
	    }
		return false;
	}
	
	public boolean addressInBannedState(Address a) {
		BannedState BS = new BannedState();
		return BS.isMatch(a);
	}
	
	public boolean isInvalidName(String s) {
		String regex = "^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$";
    	return !s.matches(regex);
	}
	
	public boolean isInvalidEmail(String s) {
		String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    	return !s.matches(regex);
	}
	
	public boolean isInvalidStreet(Address a) {
		String regex = "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)";
    	return !a.getStreet().matches(regex);
	}
	
	public boolean isInvalidCity(Address a) {
		String regex = "^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$";
    	return !a.getCity().matches(regex);
	}
	
	public boolean isInvalidZipCode(Address a) {
		String regex = "^\\d{5}(?:[-\\s]\\d{4})?$";
    	return !a.getZip().matches(regex);
	}
	
	public boolean isInvalidPhone(String s) {
		String regex = "^(?:(?:\\+?1\\s*(?:[.-]\\s*)?)?(?:\\(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\s*\\)|([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)?([2-9]1[02-9]|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?([0-9]{4})(?:\\s*(?:#|x\\.?|ext\\.?|extension)\\s*(\\d+))?$";
    	return !s.matches(regex);
	}
	
	public boolean isblank(String str) {
		if(str == ""){
			return true;
		}
		return false;
	}
	public boolean isASubscriber(int sid,Collection<Subscriber> subs){
		for(Iterator<Subscriber> iterator = subs.iterator(); iterator.hasNext();) {
	        if(sid == iterator.next().getID())
                return true;
	    }
		return false;
	}
}
