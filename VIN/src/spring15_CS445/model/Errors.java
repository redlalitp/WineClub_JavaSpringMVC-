package spring15_CS445.model;

public class Errors {
	private int code;
	private String message;
	
	public Errors(int err,String desc){
		code = err;
		message = desc;
	}
	
	public int getErrorID() {
		return code;
	}
	public void setErrorID(int errorID) {
		this.code = errorID;
	}
	public String getDescription() {
		return message;
	}
	public void setDescription(String description) {
		this.message = description;
	}	
}


