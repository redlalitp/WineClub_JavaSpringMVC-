package spring15_CS445.model;

public class AW extends MonthlySelection {
   public AW() {
		super.setMst(MonthlySelectionType.AW);
	}
	
	@Override
	public
	void addWine(Wine w) {
		// Make sure only white wines are added
		super.getMs().add(w);
	}

	
}
