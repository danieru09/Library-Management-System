package LibrarySystem;

import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    registerUser();
                    break;
                case 4:
                    borrowBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    searchBooks();
                    break;
                case 7:
                    library.listAllBooks();
                    break;
                case 8:
                    library.listAllUsers();
                    break;
                case 9:
                    System.out.println("Thank you for using the Library Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n--- Library Management System ---");
        System.out.println("1. Add a book");
        System.out.println("2. Remove a book");
        System.out.println("3. Register a user");
        System.out.println("4. Borrow a book");
        System.out.println("5. Return a book");
        System.out.println("6. Search for books");
        System.out.println("7. List all books");
        System.out.println("8. List all users");
        System.out.println("9. Exit");
        System.out.println("----------------------------------");
        System.out.print("Enter your choice: ");
    }

    private static void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        library.addBook(title, author);
    }

    private static void removeBook() {
        System.out.print("Enter book ID to remove: ");
        int id = scanner.nextInt();
        library.removeBook(id);
    }

    private static void registerUser() {
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        System.out.print("Enter user email: ");
        String email = scanner.nextLine();
        library.registerUser(name, email);
    }

    private static void borrowBook() {
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();
        System.out.print("Enter book ID to borrow: ");
        int bookId = scanner.nextInt();
        library.borrowBook(userId, bookId);
    }

    private static void returnBook() {
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();
        System.out.print("Enter book ID to return: ");
        int bookId = scanner.nextInt();
        library.returnBook(userId, bookId);
    }

    private static void searchBooks() {
        System.out.print("Enter search query: ");
        String query = scanner.nextLine();
        List<Book> results = library.searchBooks(query);
        System.out.println("Search results:");
        for (Book book : results) {
            System.out.println(book);
        }
    }
}

