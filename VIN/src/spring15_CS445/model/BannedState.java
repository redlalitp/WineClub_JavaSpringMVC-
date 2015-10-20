package spring15_CS445.model;
import java.util.ArrayList;;

public class BannedState {
	private ArrayList<String> bannedStateList = new ArrayList<String>();
	
	public BannedState(){
		bannedStateList.add("Alabama"); 
		bannedStateList.add("Arkansas");
		bannedStateList.add("Delaware");
		bannedStateList.add("Kentuky");
		bannedStateList.add("Massachusetts");
		bannedStateList.add("Mississippi");
		bannedStateList.add("Oklahoma");
		bannedStateList.add("Pensilvania");
		bannedStateList.add("South Dakota");
		bannedStateList.add("Utah");
	}
	
	public boolean isMatch(Address a){
		if(bannedStateList.contains(a.getState()))
			return true;
		else
			return false;
	}
}
