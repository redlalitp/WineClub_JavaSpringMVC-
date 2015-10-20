package spring15_CS445.model;

public class RW extends MonthlySelection {
	public RW() {
		super.setMst(MonthlySelectionType.RW); 
	}
	
	@Override
	public
	void addWine(Wine w) {
		// Red white wines are added
		super.getMs().add(w);
	}

	
}
