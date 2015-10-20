package spring15_CS445.model;

import java.util.ArrayList;
import java.util.List;

public class Shipment {
	private int sid;
	private String status;
	private String dt;
	private WineVariety wt;
	private List<Wine> wines = new ArrayList<Wine>();
	private List<Note> notes = new ArrayList<Note>();
	
	public Shipment(WineVariety wt,String ym,List<Wine> wn){
		this.sid = IdGenerator.newID();
		this.setDt(ym);
		this.status = "TBD";
		this.wt = wt;
		this.wines = wn;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public WineVariety getWt() {
		return wt;
	}
	public void setWt(WineVariety wt) {
		this.wt = wt;
	}
	public List<Wine> getWines() {
		return wines;
	}
	public void setWines(List<Wine> wines) {
		this.wines = wines;
	}
	public List<Note> getNotes() {
		return notes;
	}
	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}
}
