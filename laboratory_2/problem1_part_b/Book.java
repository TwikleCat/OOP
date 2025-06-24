package problem1_part_b;

public class Book extends LibraryItem{
	private int numberOfPages;
	public Book(String title, String author, int year, int pages) {
		super(title, author, year);
		this.numberOfPages = pages;
	}
	
	public int getNumberOfPages() {
        return numberOfPages;
    }
    
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String toString() {
        return "Book [Title: " + getTitle() +
                ", Author: " + getAuthor() +
                ", Year: " + getPublicationYear() +
                ", Number of pages: " + getNumberOfPages()
                + "]";
     }
}
