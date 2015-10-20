package spring15_CS445.model;

public class WineArray {
	private int id;
	private String label_name;
	
	public WineArray(int wid,String lbl){
		setId(wid);
		setLabel_name(lbl);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabel_name() {
		return label_name;
	}
	public void setLabel_name(String label_name) {
		this.label_name = label_name;
	}
}
