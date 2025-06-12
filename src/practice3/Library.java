package practice3;

import java.time.LocalDate;
import java.util.Vector;

public class Library {
	private Vector<Book> books;

	public Library() {
		this.books = new Vector<>();
	}

	public void addBook(Book b) {
		books.add(b);
	}

	public Vector<Book> getBooks() {
		return books;
	}

	public void assign(Book book, User user, int daysUntilDue) {
		if (book.getUser() != null) {
			System.out.println("Book is already assigned to " + book.getUser().getName());
			return;
		}
		LocalDate dueDate = LocalDate.now().plusDays(daysUntilDue);
		book.assignToUser(user, dueDate);
		user.getBooks().add(book);
		System.out.println("Book assigned to " + user.getName() + ". Due date: " + dueDate);
	}

	public void checkOverdueBooks() {
		LocalDate today = LocalDate.now();
		for (Book b : books) {
			if (b.getUser() != null && b.getDueDate().isBefore(today)) {
				System.out.println("Book '" + b.getName() + "' overdue! Removing from user " + b.getUser().getName());
				b.getUser().getBooks().remove(b);
				b.removeFromUser();
			}
		}
	}

	public void displayBooks() {
		System.out.println("\nList of Books:");
		for (Book b : books) {
			System.out.println(" - " + b);
		}
	}

	public void displayAssignedUsers() {
		System.out.println("\nUsers with assigned books:");
		for (Book b : books) {
			if (b.getUser() != null) {
				System.out.println(" - " + b.getUser().getName() + " has '" + b.getName() + "' until " + b.getDueDate());
			}
		}
	}
}
