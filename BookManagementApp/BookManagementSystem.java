package BookManagementApp;

import java.util.Scanner;

public class BookManagementSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the capacity of the library: ");
		int capacity = scanner.nextInt();
		Library library = new Library(capacity);

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Add Book");
			System.out.println("2. Remove Book");
			System.out.println("3. Replace Book");
			System.out.println("4. Search Book");
			System.out.println("5. Display Books");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); 

			switch (choice) {
			case 1:
				System.out.print("Enter Book ID: ");
				int bookID = scanner.nextInt();
				scanner.nextLine(); 
				System.out.print("Enter Title: ");
				String title = scanner.nextLine();
				System.out.print("Enter Author: ");
				String author = scanner.nextLine();

				Book newBook = new Book(bookID, title, author);
				library.addBook(newBook);
				break;

			case 2:
				System.out.print("Enter Book ID to remove: ");
				int removeID = scanner.nextInt();
				library.removeBook(removeID);
				break;

			case 3:
				System.out.print("Enter Book ID to replace: ");
				int replaceID = scanner.nextInt();
				scanner.nextLine(); 
				System.out.print("Enter new Title: ");
				String newTitle = scanner.nextLine();
				System.out.print("Enter new Author: ");
				String newAuthor = scanner.nextLine();

				library.replaceBook(replaceID, newTitle, newAuthor);
				break;

			case 4:
				System.out.print("Enter Book ID to search: ");
				int searchID = scanner.nextInt();
				Book searchedBook = library.searchBook(searchID);
				if (searchedBook != null) {
					System.out.println("Book found: " + searchedBook.toString());
				} else {
					System.out.println("Book not found.");
				}
				break;

			case 5:
				library.displayBooks();
				break;

			case 6:
				System.out.println("Exiting the program. Goodbye!");
				scanner.close();
				System.exit(0);

			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 6.");
			}
		}
	}
}
