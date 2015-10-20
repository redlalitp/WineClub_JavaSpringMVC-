package spring15_CS445.model;

public class AR extends MonthlySelection {
	public AR() {
		super.setMst(MonthlySelectionType.AR);
	}
	
	@Override
	public
	void addWine(Wine w) {
		// Make sure only Red wines are added
		super.getMs().add(w);
	}

	
}
