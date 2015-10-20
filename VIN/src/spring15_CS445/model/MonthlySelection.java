package spring15_CS445.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public abstract class MonthlySelection {
	private int id;
	private MonthlySelectionType mst;
	private String ym;
	private List<Wine> ms = new ArrayList<Wine>();
	
	abstract void addWine(Wine w);
	
	public boolean isMatch(String kw) {
		Iterator<Wine> it = this.getMs().iterator();
		while (it.hasNext()) {
			Wine w = it.next();
			if (w.isMatch(kw)) return true;
		}
		return false;
	}
	
	public MonthlySelection() {
		SimpleDateFormat fmt = new SimpleDateFormat("YYYY-MM");
		String dateString = fmt.format(new java.util.Date());
		this.setYm(dateString);	// next month's selection
	}
	
	public MonthlySelection(String ym) {	// Must be in the yyyy-mm format
		this.setYm(ym);
	}

	public MonthlySelectionType getMst() {
		return mst;
	}

	public void setMst(MonthlySelectionType mst) {
		this.mst = mst;
	}

	public String getYm() {
		return ym;
	}

	public void setYm(String ym) {
		this.ym = ym;
	}

	public List<Wine> getMs() {
		return ms;
	}

	public void setMs(List<Wine> ms) {
		this.ms = ms;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
