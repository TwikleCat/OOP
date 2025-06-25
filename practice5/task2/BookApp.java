package task2;
import java.io.*;
import java.util.*;

public class BookApp {
	 private static final String DATA_FILE = "book_input";
	    private static final String TEXT_FILE = "books.txt";

	    public static void main(String[] args) {
	        ArrayList<Book> books = loadBooks();
	        Scanner scanner = new Scanner(System.in);
	        String choice;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("(A)dd new book");
	            System.out.println("(L)ist all books");
	            System.out.println("(Q)uit");
	            System.out.print("Your choice: ");
	            choice = scanner.nextLine().trim().toUpperCase();

	            switch (choice) {
	                case "A":
	                    System.out.print("Enter book title: ");
	                    String title = scanner.nextLine();
	                    System.out.print("Enter author: ");
	                    String author = scanner.nextLine();
	                    System.out.print("Enter publication year: ");
	                    int year = Integer.parseInt(scanner.nextLine());
	                    books.add(new Book(title, author, year));
	                    System.out.println("Book added.");
	                    break;

	                case "L":
	                    if (books.isEmpty()) {
	                        System.out.println("No books available.");
	                    } else {
	                        for (int i = 0; i < books.size(); i++) {
	                            Book b = books.get(i);
	                            b.incrementVisit();
	                            System.out.printf("%d. %s%n", i + 1, b);
	                        }
	                    }
	                    break;

	                case "Q":
	                    saveBooks(books);
	                    System.out.println("Books saved to file. Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid option.");
	            }

	        } while (!choice.equals("Q"));

	        scanner.close();
	    }

	    private static ArrayList<Book> loadBooks() {
	        File dataFile = new File(DATA_FILE);
	        if (dataFile.exists()) {
	            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(dataFile))) {
	                @SuppressWarnings("unchecked")
	                ArrayList<Book> books = (ArrayList<Book>) in.readObject();
	                System.out.println("Loaded " + books.size() + " book(s) from binary file.");
	                return books;
	            } catch (IOException | ClassNotFoundException e) {
	                System.err.println("Error loading binary file: " + e.getMessage());
	            }
	        }

	        File txtFile = new File(TEXT_FILE);
	        if (txtFile.exists()) {
	            ArrayList<Book> books = new ArrayList<>();
	            try (BufferedReader reader = new BufferedReader(new FileReader(txtFile))) {
	                String line;
	                while ((line = reader.readLine()) != null) {
	                    String[] parts = line.split("\\|");
	                    if (parts.length == 3) {
	                        String title = parts[0].trim();
	                        String author = parts[1].trim();
	                        int year = Integer.parseInt(parts[2].trim());
	                        books.add(new Book(title, author, year));
	                    }
	                }
	                System.out.println("Imported " + books.size() + " book(s) from books.txt.");
	            } catch (IOException | NumberFormatException e) {
	                System.err.println("Error reading books.txt: " + e.getMessage());
	            }
	            return books;
	        }

	        return new ArrayList<>();
	    }

	    private static void saveBooks(ArrayList<Book> books) {
	        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
	            out.writeObject(books);
	        } catch (IOException e) {
	            System.err.println("Error saving to binary file: " + e.getMessage());
	        }
	    }
}
