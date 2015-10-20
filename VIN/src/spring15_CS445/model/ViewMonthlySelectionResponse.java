package spring15_CS445.model;

import java.util.ArrayList;
import java.util.List;

public class ViewMonthlySelectionResponse {
	private int id;
	private String selection_month;
	private String type;
	private String create_date;
	private int created_by;
	private List<WineArray> wines = new ArrayList<WineArray>();
	
	public ViewMonthlySelectionResponse(int vmsid,String ym,String tp,String cdate,int cb,List<Wine> w){
		setId(vmsid);
		setSm(ym);
		setType(tp);
		setCd(cdate);
		setCreatedBy(cb);
		for(int i=0;i<w.size();i++){
			wines.add(new WineArray(w.get(i).getID(),w.get(i).getLabelName()));
		}
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getSm() {
		return selection_month;
	}
	public void setSm(String sm) {
		this.selection_month = sm;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCd() {
		return create_date;
	}
	public void setCd(String cd) {
		this.create_date = cd;
	}
	public int getCreatedBy() {
		return created_by;
	}
	public void setCreatedBy(int createdBy) {
		this.created_by = createdBy;
	}
	public List<WineArray> getWa() {
		return wines;
	}
	public void setWa(List<WineArray> wa) {
		this.wines = wa;
	}
}
