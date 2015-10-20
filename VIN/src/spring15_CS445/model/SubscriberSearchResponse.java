package spring15_CS445.model;

import java.util.List;

public class SubscriberSearchResponse {
	private List<WineArray> wines;
	private List<NoteArray> notes;
	private List<ShipmentArray> shipments;
	
	public SubscriberSearchResponse(List<WineArray> w,List<NoteArray> n,List<ShipmentArray> s){
		wines = w;
		notes = n;
		shipments = s;
	}
	
	
}
