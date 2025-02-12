package LibrarySystem;

import java.util.*;

public class Library {
    private List<Book> books;
    private Map<Integer, User> users;
    private Queue<Integer> borrowRequests;
    private int lastBookId;
    private int lastUserId;

    public Library() {
        books = new ArrayList<>();
        users = new HashMap<>();
        borrowRequests = new LinkedList<>();
        lastBookId = 0;
        lastUserId = 0;
    }

    public void addBook(String title, String author) {
        int id = ++lastBookId;
        books.add(0, new Book(id, title, author));  // Adds the book at the beginning of the list
        System.out.println("Added book: " + title + " by " + author + " with ID " + id);
    }

    public void removeBook(int id) {
        books.removeIf(book -> book.getId() == id);
        System.out.println("Removed book with ID " + id);
    }

    public void registerUser(String name, String email) {
        int id = ++lastUserId;
        users.put(id, new User(id, name, email));
        System.out.println("Registered user: " + name + " with ID " + id);
    }

    public void borrowBook(int userId, int bookId) {
        User user = users.get(userId);
        Book book = findBookById(bookId);

        if (user == null) {
            System.out.println("User with ID " + userId + " not found");
            return;
        }

        if (book == null) {
            System.out.println("Book with ID " + bookId + " not found");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book " + book.getTitle() + " is not available. Adding to borrow requests.");
            borrowRequests.offer(bookId);
            return;
        }

        book.setAvailable(false);
        user.borrowBook(bookId);
        System.out.println("User " + user.getName() + " borrowed book: " + book.getTitle());
    }

    public void returnBook(int userId, int bookId) {
        User user = users.get(userId);
        Book book = findBookById(bookId);

        if (user == null) {
            System.out.println("User with ID " + userId + " not found");
            return;
        }

        if (book == null) {
            System.out.println("Book with ID " + bookId + " not found");
            return;
        }

        if (!user.getBorrowedBooks().contains(bookId)) {
            System.out.println("User " + user.getName() + " did not borrow book: " + book.getTitle());
            return;
        }

        user.returnBook(bookId);
        book.setAvailable(true);
        System.out.println("User " + user.getName() + " returned book: " + book.getTitle());

        if (borrowRequests.contains(bookId)) {
            borrowRequests.remove(bookId);
            System.out.println("Fulfilled borrow request for book: " + book.getTitle());
        }
    }

    public List<Book> searchBooks(String query) {
        List<Book> results = new ArrayList<>();
        String lowercaseQuery = query.toLowerCase();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(lowercaseQuery) ||
                    book.getAuthor().toLowerCase().contains(lowercaseQuery)) {
                results.add(book);
            }
        }
        return results;
    }

    private Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public void listAllBooks() {
        System.out.println("All books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void listAllUsers() {
        System.out.println("All registered users:");
        for (User user : users.values()) {
            System.out.println(user);
        }
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public User getUserById(int id) {
        return users.get(id);
    }

    public Book getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}
