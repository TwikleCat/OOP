package practice3;

import java.util.Scanner;
import java.util.Vector;

public class LibrarySystem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Library lib = new Library();
		Vector<User> users = new Vector<>();

		System.out.println("Welcome to the LMS!");
		System.out.println("Available commands:");
		System.out.println(" - create book");
		System.out.println(" - display books");
		System.out.println(" - assign book");
		System.out.println(" - display assigned");
		System.out.println(" - check overdue");
		System.out.println(" - quit");

		boolean running = true;
		while (running) {
			System.out.print("\nEnter command: ");
			String cmd = s.nextLine().trim().toLowerCase();

			switch (cmd) {
				case "create book":
					System.out.print("Enter book name: ");
					String bookName = s.nextLine();
					lib.addBook(new Book(bookName));
					System.out.println("Book created.");
					break;

				case "display books":
					lib.displayBooks();
					break;

				case "assign book":
					System.out.print("Enter username: ");
					String username = s.nextLine();
					User user = null;
					for (User u : users) {
						if (u.getName().equalsIgnoreCase(username)) {
							user = u;
							break;
						}
					}
					if (user == null) {
						user = new User(username);
						users.add(user);
					}

					lib.displayBooks();
					System.out.print("Enter book name to assign: ");
					String bookToAssign = s.nextLine();

					Book selectedBook = null;
					for (Book b : lib.getBooks()) {
						if (b.getName().equalsIgnoreCase(bookToAssign)) {
							selectedBook = b;
							break;
						}
					}

					if (selectedBook == null) {
						System.out.println("Book not found.");
					} else {
						System.out.print("Enter number of days until due: ");
						int days = Integer.parseInt(s.nextLine());
						lib.assign(selectedBook, user, days);
					}
					break;

				case "display assigned":
					lib.displayAssignedUsers();
					break;

				case "check overdue":
					lib.checkOverdueBooks();
					break;

				case "quit":
					running = false;
					break;

				default:
					System.out.println("Unknown command.");
					break;
			}
		}

		s.close();
	}
}
