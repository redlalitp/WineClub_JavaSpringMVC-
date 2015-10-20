package spring15_CS445.model;

import java.util.ArrayList;
import java.util.List;

public class ShipmentResponse {
	private String selection_month;
	private String status;
	private String date;
	private String type;
	private List<Wine> wines = new ArrayList<Wine>();
	
	public ShipmentResponse(String sm,String status,String dt, String wt,List<Wine> ls){
		setSm(sm);
		setStatus(status);
		setDt(dt);
		setWt(wt);
		setWines(ls);
	}
	
	public String getSm() {
		return selection_month;
	}
	public void setSm(String sm) {
		this.selection_month = sm;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDt() {
		return date;
	}
	public void setDt(String dt) {
		this.date = dt;
	}
	public String getWt() {
		return type;
	}
	public void setWt(String wt) {
		this.type = wt;
	}
	public List<Wine> getWines() {
		return wines;
	}
	public void setWines(List<Wine> wines) {
		this.wines = wines;
	}
}
