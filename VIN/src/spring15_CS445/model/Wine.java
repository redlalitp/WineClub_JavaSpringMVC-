package spring15_CS445.model;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Wine {
	private WineVariety variety;
	private WineType wine_type;
	private String label_name;
	private String grape;	// e.g. Merlot, Chardonnay, Riesling, etc.
	private String region;	// e.g. Napa, Russian Valley, etc.
	private String country; // e.g. France, USA, Australia, Chile
	private String maker;	// the wine maker, e.g. Sterling, Krupp Brother, etc.
	private String year;		// Vintage year
	private static int numberOfRatings;
	private static float rating = 0;
	private int ID;
	private List<Note> notes = new ArrayList<Note>();
	public Wine() {
		this.variety = WineVariety.RED;
		this.wine_type = WineType.TABLE;
		this.label_name = "The Mission";
		this.grape = "Cabernet Sauvignon";
		this.region = "Napa";
		this.country = "USA";
		this.maker = "Sterling";
		this.year = "2011";
		this.setID(IdGenerator.newID());
	}

	public Wine(WineVariety v, WineType t, String ln, String g, String r, String c, String m, String y) {
		this.variety = v;
		this.wine_type = t;
		this.label_name = ln;
		this.grape = g;
		this.region = r;
		this.country = c;
		this.maker = m;
		this.year = y;
		this.setID(IdGenerator.newID());
	}

	public WineVariety getVariety() {
		return this.variety;
	}
	
	public WineType getType() {
		return this.wine_type;
	}

	public String getLabelName() {
		return this.label_name;
	}

	public String getGrape() {
		return this.grape;
	}

	public String getRegion() {
		return this.region;
	}
	
	public String getCountry() {
		return this.country;
	}

	public String getMaker() {
		return this.maker;
	}
	
	public String getYear() {
		return this.year.toString();
	}

	public int getNumberOfRatings() {
		return this.numberOfRatings;
	}
	
	public float getRating() {
		return this.rating;
	}
	
	public void addRating(int r) {
		numberOfRatings = numberOfRatings + 1;
		rating = rating*((float)(numberOfRatings - 1)/numberOfRatings) + (float)r/numberOfRatings;
	}
	
	public boolean isMatch(String kw) {
        if (isMatchVariety(kw) || isMatchType(kw) || isMatchLabel(kw) || isMatchGrape(kw) || isMatchRegion(kw) || isMatchCountry(kw) || isMatchMaker(kw) || isMatchYear(kw)) {
                return true;
        } else return false;
	}
	    
    private boolean isMatchVariety(String kw) {
    	String regex = "(?i).*" + kw + ".*";
        return this.variety.name().matches(regex);
    }

    private boolean isMatchType(String kw) {
    	String regex = "(?i).*" + kw + ".*";
        return this.wine_type.name().matches(regex);
    }
    
    private boolean isMatchLabel(String kw) {
        String regex = "(?i).*" + kw + ".*";
        return this.label_name.matches(regex);
    }
    
    private boolean isMatchGrape(String kw) {
    	return false;
    }
    
    private boolean isMatchRegion(String kw) {
    	return false;
    }

    private boolean isMatchCountry(String kw) {
    	return false;
    }

    private boolean isMatchMaker(String kw) {
    	return false;
    }

    private boolean isMatchYear(String kw) {
    	return false;
    }

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

}
