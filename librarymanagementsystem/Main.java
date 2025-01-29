package linkedlist.librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        BookLinkedList library = new BookLinkedList();

        // Adding books by Premchand and Chetan Bhagat
        library.addAtEnd("Godaan", "Premchand", "Fiction", 1, true);
        library.addAtBeginning("Half Girlfriend", "Chetan Bhagat", "Romance", 2, true);
        library.addAtPosition(1, "Gaban", "Premchand", "Drama", 3, false);
        library.addAtEnd("2 States", "Chetan Bhagat", "Romance", 4, true);
        library.addAtBeginning("Nirmala", "Premchand", "Literary", 5, true);

        // Display all book records in forward and reverse order
        System.out.println("Library Books in forward order:");
        library.displayForward();

        System.out.println("Library Books in reverse order:");
        library.displayReverse();

        // Update a book's availability status
        library.updateAvailabilityByBookId(2, false);

        // Searching for a book by title
        BookNode book = library.searchByTitle("2 States");
        if (book != null) {
            System.out.println("Found book by title: " + book.title);
        } else {
            System.out.println("Book not found");
        }

        // Searching for a book by author
        book = library.searchByAuthor("Premchand");
        if (book != null) {
            System.out.println("Found book by author: " + book.title);
        } else {
            System.out.println("Book not found");
        }

        // Remove a book by book ID
        library.removeByBookId(3);

        // Display all book records in forward and reverse order after removal
        System.out.println("Library Books in forward order after removal:");
        library.displayForward();

        System.out.println("Library Books in reverse order after removal:");
        library.displayReverse();

        // Count the total number of books in the library
        int totalBooks = library.countTotalBooks();
        System.out.println("Total number of books in the library: " + totalBooks);
    }
}
