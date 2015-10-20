package spring15_CS445.model;

public enum MonthlySelectionType {
	AW ("All whites"),
	AR ("All reds"),
	RW ("Reds and Whites");
	
	private String description;
	private MonthlySelectionType(String ms) {
		this.description = ms;
	}
}
