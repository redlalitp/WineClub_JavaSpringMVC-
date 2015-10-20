package spring15_CS445.model;

public class RevenueResponse {
	private int units_delivered;
	private int units_returned;
	private double wine_revenue;
	private double delivery_revenue;
	
	public RevenueResponse(int units, int retUnits,double wr,double dr){
		setUnits_delivered(units);
		setUnits_returned(retUnits);
		setWine_revenue(wr);
		setDelivery_revenue(dr);
	}
	
	public int getUnits_delivered() {
		return units_delivered;
	}
	public void setUnits_delivered(int units_delivered) {
		this.units_delivered = units_delivered;
	}
	public int getUnits_returned() {
		return units_returned;
	}
	public void setUnits_returned(int units_returned) {
		this.units_returned = units_returned;
	}
	public double getWine_revenue() {
		return wine_revenue;
	}
	public void setWine_revenue(double wine_revenue) {
		this.wine_revenue = wine_revenue;
	}
	public double getDelivery_revenue() {
		return delivery_revenue;
	}
	public void setDelivery_revenue(double delivery_revenue) {
		this.delivery_revenue = delivery_revenue;
	}
}
