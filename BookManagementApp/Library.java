package BookManagementApp;

public class Library {
	private Book[] books;

	public Library(int capacity) {
		this.books = new Book[capacity];
	}

	public void addBook(Book book) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				System.out.println("Book added to the library.");
				return;
			}
		}
		System.out.println("Library is full. Cannot add more books.");
	}

	public void removeBook(int bookID) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null && books[i].getBookID() == bookID) {
				books[i] = null;
				System.out.println("Book removed from the library.");
				return;
			}
		}
		System.out.println("Book with ID " + bookID + " not found in the library.");
	}

	public void replaceBook(int bookID, String newTitle, String newAuthor) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null && books[i].getBookID() == bookID) {
				books[i].setTitle(newTitle);
				books[i].setAuthor(newAuthor);
				System.out.println("Book replaced in the library.");
				return;
			}
		}
		System.out.println("Book with ID " + bookID + " not found in the library.");
	}

	public Book searchBook(int bookID) {
		for (Book book : books) {
			if (book != null && book.getBookID() == bookID) {
				return book;
			}
		}
		return null;
	}

	public void displayBooks() {
		System.out.println("Books in the library:");
		for (Book book : books) {
			if (book != null) {
				System.out.println(book.toString());
			}
		}
	}
}
