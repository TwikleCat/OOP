package task2;
import java.io.*;

public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

    private String title;
    private String author;
    private int year;

    // Stretch: transient field
    transient int visitCount = 0;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void incrementVisit() {
        visitCount++;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" by %s (%d) — visitCount = %d", title, author, year, visitCount);
    }

}
