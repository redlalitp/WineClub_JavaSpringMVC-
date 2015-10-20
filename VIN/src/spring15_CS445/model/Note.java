package spring15_CS445.model;

import java.util.Date;

public class Note {
	private int id;
	private Date date;
	private String content;
	
	public Note(String content){
		this.id = IdGenerator.newID();
		this.content = content;
		this.date = new Date();
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDt() {
		return date;
	}
	public void setDt(Date dt) {
		this.date = dt;
	}
	
}
