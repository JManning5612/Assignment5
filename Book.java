package Assignment5;

public class Book extends Material 
{
	private String author;
    private String isbn;
    private int numberOfPages;

    public Book(String itemReference, String title, boolean suitableForChildren, double replacementValue, String location,
                String author, String isbn, int numberOfPages) {
        super(itemReference, title, suitableForChildren, replacementValue, location);
        this.author = author;
        this.isbn = isbn;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}


