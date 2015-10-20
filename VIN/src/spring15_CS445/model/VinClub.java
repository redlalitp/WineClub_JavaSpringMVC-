package spring15_CS445.model;
import java.util.Collection;
import java.util.HashSet;

public class VinClub implements java.io.Serializable{

	public static HashSet<Subscriber> subs = new HashSet<Subscriber>();
	public static HashSet<Admin> admins = new HashSet<Admin>();
	public static HashSet<Wine> wines = new HashSet<Wine>();
	public static HashSet<Receipt> receipts = new HashSet<Receipt>();
	public static HashSet<MonthlySelection> MS = new HashSet<MonthlySelection>();

}
