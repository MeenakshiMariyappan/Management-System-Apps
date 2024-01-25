package BookManagementApp;

public class Book {
	private int bookID;
	private String title;
	private String author;
	private boolean isAvailable;

	public Book(int bookID, String title, String author) {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}

	// Getter and setter methods...
	public int getBookID() {
		return bookID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean available) {
		isAvailable = available;
	}

	public String toString() {
		return "Book ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: "
				+ (isAvailable ? "Yes" : "No");
	}
}
