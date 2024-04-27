package Assignment5;

public class DVD extends Material
{
	private String releaseDate;
    private int durationMinutes;

    public DVD(String itemReference, String title, boolean suitableForChildren, double replacementValue, String location,
               String releaseDate, int durationMinutes) {
        super(itemReference, title, suitableForChildren, replacementValue, location);
        this.releaseDate = releaseDate;
        this.durationMinutes = durationMinutes;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }
}
