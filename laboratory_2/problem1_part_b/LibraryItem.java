package problem1_part_b;

public abstract class LibraryItem {
	private String title;
    private String author;
    private int publicationYear;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.publicationYear = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int year) {
        this.publicationYear = year;
    }

    public abstract String toString();
    
}
