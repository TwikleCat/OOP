package problem1_part_b;
import java.util.*;

public class LibraryTest {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        System.out.println("Enter book information:");

        System.out.print("Title: ");
        String title = input.nextLine();

        System.out.print("Author: ");
        String author = input.nextLine();

        System.out.print("Publication Year: ");
        int year = input.nextInt();

        System.out.print("Number of Pages: ");
        int pages = input.nextInt();

        
        Book book = new Book(title, author, year, pages);
        System.out.println("\nBook added to the library:");
        System.out.println(book);

        input.nextLine();  
        System.out.println("\nWould you like to update the book details? (yes/no)");
        String response = input.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.print("New Title: ");
            book.setTitle(input.nextLine());

            System.out.print("New Author: ");
            book.setAuthor(input.nextLine());

            System.out.print("New Publication Year: ");
            book.setPublicationYear(input.nextInt());

            System.out.print("New Number of Pages: ");
            book.setNumberOfPages(input.nextInt());

            System.out.println("\nUpdated Book:");
            System.out.println(book);
        } else {
            System.out.println("\nNo changes made.");
        }

        input.close();
    }

}
