package lab1;
import java.util.*;

public class LibraryBook {
	
    public enum BookGenre {
        FICTION, NONFICTION, SCIENCE, HISTORY, FANTASY
    }

    
    private static int totalBooks = 0;

    public static final int MAX_BORROW_DAYS = 30;

    private final String isbn;

    private String title;
    private String author;
    private BookGenre genre;
    private boolean isBorrowed;

    {
        this.isBorrowed = false;
        System.out.println("Initialization: Book is marked as not borrowed.");
    }


    public LibraryBook(String isbn, String title, String author, BookGenre genre) {
        this.isbn = isbn;             
        this.title = title;
        this.author = author;
        this.genre = genre;
        totalBooks++;
    }

    public void borrow() {
        borrow(MAX_BORROW_DAYS);
    }

    public void borrow(int days) {
        if (isBorrowed) {
            System.out.println("This book is already borrowed.");
        } else if (days > MAX_BORROW_DAYS) {
            System.out.println("Cannot borrow for more than " + MAX_BORROW_DAYS + " days.");
        } else {
            this.isBorrowed = true;  
            System.out.println("You borrowed \"" + this.title + "\" for " + days + " days.");
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }
    
    
    
    
    
   //Main//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        System.out.print("Choose genre (FICTION, NONFICTION, SCIENCE, HISTORY, FANTASY): ");
        String genreInput = sc.nextLine().toUpperCase();
        LibraryBook.BookGenre genre = LibraryBook.BookGenre.valueOf(genreInput);


        LibraryBook book = new LibraryBook(isbn, title, author, genre);

        System.out.print("Do you want to borrow the book? (yes/no): ");
        String borrowAnswer = sc.nextLine();

        if (borrowAnswer.equalsIgnoreCase("yes")) {
            System.out.print("Enter number of days to borrow (or press Enter for default): ");
            String daysInput = sc.nextLine();
            if (daysInput.isEmpty()) {
                book.borrow();
            } else {
                int days = Integer.parseInt(daysInput);
                book.borrow(days);
            }
        }

        System.out.println("Total books created: " + LibraryBook.getTotalBooks());
        System.out.println("Book ISBN (read-only): " + book.getIsbn());

        sc.close();
    }

}
