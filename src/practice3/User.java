package practice3;

import java.util.Vector;

public class User {
	private String name;
	private Vector<Book> books;

	public User(String name) {
		this.name = name;
		this.books = new Vector<>();
	}

	public String getName() {
		return this.name;
	}

	public Vector<Book> getBooks() {
		return this.books;
	}
}