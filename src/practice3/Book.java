package practice3;
import java.time.LocalDate;

public class Book {
	private String name;
	private User user;
	private LocalDate dueDate;

	
	public Book(String name) {
		this.name = name;
		this.user = null;
		this.dueDate = null;
	}

	public String getName() {
		return this.name;
	}

	public User getUser() {
		return this.user;
	}

	public LocalDate getDueDate() {
		return this.dueDate;
	}

	public void assignToUser(User user, LocalDate dueDate) {
		this.user = user;
		this.dueDate = dueDate;
	}

	public void removeFromUser() {
		this.user = null;
		this.dueDate = null;
	}

	public String toString() {
		String status = (user == null) ? "Available" : "Assigned to " + user.getName() + " (Due: " + dueDate + ")";
		return name + " [" + status + "]";
	}
}
