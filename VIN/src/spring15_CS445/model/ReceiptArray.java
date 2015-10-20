package spring15_CS445.model;

public class ReceiptArray {
	private int id;
	private String date;
	private int subscriber;
	private String name;
	
	public ReceiptArray(int id,String dt, int sid, String name){
		setRid(id);
		setDt(dt);
		setSubID(sid);
		setName(name);
	}
	
	public int getRid() {
		return id;
	}
	public void setRid(int rid) {
		this.id = rid;
	}
	public String getDt() {
		return date;
	}
	public void setDt(String dt) {
		this.date = dt;
	}
	public int getSubID() {
		return subscriber;
	}
	public void setSubID(int subID) {
		this.subscriber = subID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
