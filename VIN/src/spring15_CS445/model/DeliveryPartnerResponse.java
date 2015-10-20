package spring15_CS445.model;

public class DeliveryPartnerResponse {
	private String name,phone,email,dow,tod,type;
	private Address a;
	
	public DeliveryPartnerResponse(String n,String p,String e,Address ad,String d,String t,String typ){
		name = n;
		phone = p;
		email = e;
		a=ad;
		dow = d;
		tod= t;
		type = typ;
	}
}
