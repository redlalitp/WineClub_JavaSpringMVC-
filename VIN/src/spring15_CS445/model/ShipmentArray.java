package spring15_CS445.model;

public class ShipmentArray{
	private int id;
	private String selection_month;
	public ShipmentArray(int ID,String SM){
		setId(ID);
		setSelection_month(SM);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSelection_month() {
		return selection_month;
	}
	public void setSelection_month(String selection_month) {
		this.selection_month = selection_month;
	}
	
}
