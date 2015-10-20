package spring15_CS445.model;

public class UserShipmentResponse {
	private int id;
	private String selection_month;
	private String status;
	
	public UserShipmentResponse(int id,String mon_sel, String stat){
		setSid(id);
		setSm(mon_sel);
		setStatus(stat);
	}
	public int getSid() {
		return id;
	}
	public void setSid(int sid) {
		this.id = sid;
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
}
