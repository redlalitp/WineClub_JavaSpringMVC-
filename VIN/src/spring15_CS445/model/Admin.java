package spring15_CS445.model;

import java.util.Date;

public class Admin {
	private String name;
	private int ID;
	private String DOJ;
	private String creator;
    
	public Admin(String n){
		this.setName(n);
		this.ID = IdGenerator.newID();
		this.DOJ = new Date().toString();
	}
	
	public Admin(){
		this.setName("Alice");
		this.ID = IdGenerator.newID();
		this.setDOJ(new Date().toString());
		this.setCreator("");
	}

	public String getName() {
		return name;
	}
	
	public int getID() {
		return ID;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void updateInfo(String name){
		this.name = name;
	}

	public String getDOJ() {
		return DOJ;
	}

	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
}
