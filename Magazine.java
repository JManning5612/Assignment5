package Assignment5;

public class Magazine extends Material 
{
	private String publicationDate;
    private int issueNumber;

    public Magazine(String itemReference, String title, boolean suitableForChildren, double replacementValue, String location,
                    String publicationDate, int issueNumber) {
        super(itemReference, title, suitableForChildren, replacementValue, location);
        this.publicationDate = publicationDate;
        this.issueNumber = issueNumber;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}


