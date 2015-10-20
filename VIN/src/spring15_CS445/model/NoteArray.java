package spring15_CS445.model;

public class NoteArray{
	private int id;
	private String content;
	public NoteArray(int ID,String C){
		setId(ID);
		setContent(C);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
