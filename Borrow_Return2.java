package library_Management;


	import java.util.NoSuchElementException;
	import java.util.Scanner;

	public class Borrow_Return2 {

		Scanner sc = new Scanner(System.in);
		Book2[] books;

		// Create a few books for Library
		public Borrow_Return2() {
			books = new Book2[3];
			books[0] = new Book2("The Power of Now", "by Eckhart Tolle");
			books[1] = new Book2("Atomic Habits", " by James Clear");
			books[2] = new Book2("The 7 Habits of Highly Effective People", "by Stephen R. Covey");
		}

		public void menu() {
			while (true) {
				System.out.println("Library's Menu");
				System.out.println("1. Borrow book");
				System.out.println("2. Return book");
				System.out.println("3. Exit");
				System.out.println("Enter the number");

				try {
					int choice = sc.nextInt();
					sc.nextLine(); // Clear the buffer

					if (choice == 1) {
						System.out.println("Available books in the Library for borrow");

						for (int i = 0; i < books.length; i++) {
							if (!books[i].isBorrowed()) {
								System.out.println((i + 1) + ". " + books[i].title + " by " + books[i].author);
							}
						}

						System.out.println("Enter the book number you want to borrow");
						int borrowBook = sc.nextInt();

						if (borrowBook >= 1 && borrowBook <= books.length) {
							if (!books[borrowBook - 1].isBorrowed()) {
								books[borrowBook - 1].borrowBooks();
								System.out.println("You have borrowed: " + books[borrowBook - 1].title);
							} else {
								System.out.println("This book is already borrowed.");
							}
						} else {
							System.out.println("Invalid Choice.");
						}

					} else if (choice == 2) {
						System.out.println("Books you have borrowed");
						for (int i = 0; i < books.length; i++) {
							if (books[i].isBorrowed()) {
								System.out.println((i + 1) + ". " + books[i].title + " by " + books[i].author);
							}
						}

						System.out.println("Enter the book number you want to return");
						int returnBook = sc.nextInt();

						if (returnBook >= 1 && returnBook <= books.length) {
							if (books[returnBook - 1].isBorrowed()) {
								books[returnBook - 1].returnBook();
								System.out.println("You have returned: " + books[returnBook - 1].title);
							} else {
								System.out.println("This book is Return.");
							}
						} else {
							System.out.println("Invalid Choice");
						}

					} else if (choice == 3) {
						System.out.println("Exit the system");
						// Don't close the scanner here to avoid NoSuchElementException
						return; // Simply return to exit
					} else {
						System.out.println("Invalid choice, please try again...");
					}
				} catch (NoSuchElementException e) {
					System.out.println("Input stream has been closed. Exiting.");
					break; // Exit the loop if Scanner is closed
				} catch (Exception e) {
					System.out.println("Invalid input, please enter a number.");
					sc.nextLine(); // Clear the invalid input
				}
			}
			sc.close(); // Close the scanner after exiting the loop
		}
	}


