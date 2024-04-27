package Assignment5;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

enum MaterialType {
    BOOK,
    MAGAZINE,
    DVD
}

enum MembershipType {
    ADULT,
    CHILD
}

public class Material {
	    private String itemReference;
	    private String title;
	    private boolean suitableForChildren;
	    private double replacementValue;
	    private String location;

	    public Material(String itemReference, String title, boolean suitableForChildren, double replacementValue, String location) {
	        this.itemReference = itemReference;
	        this.title = title;
	        this.suitableForChildren = suitableForChildren;
	        this.replacementValue = replacementValue;
	        this.location = location;
	    }

	    public String getItemReference() {
	        return itemReference;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public boolean isSuitableForChildren() {
	        return suitableForChildren;
	    }

	    public double getReplacementValue() {
	        return replacementValue;
	    }

	    public String getLocation() {
	        return location;
	    }
	}

