package linkedlist.librarymanagementsystem;

class BookLinkedList {
    BookNode head;
    BookNode tail;

    public BookLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Add a book record at the beginning
    public void addAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;  // point newNode's next to current head
            head.prev = newNode;  // point current head's prev to newNode
            head = newNode;  // update head to newNode
        }
    }

    // Add a book record at the end
    public void addAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;  // point tail's next to newNode
            newNode.prev = tail;  // point newNode's prev to current tail
            tail = newNode;  // update tail to newNode
        }
    }

    // Add a book record at a specific position
    public void addAtPosition(int position, String title, String author, String genre, int bookId, boolean isAvailable) {
        if (position == 0) {
            addAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }
        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
        BookNode current = head;

        // Traverse to the position index
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bounds");
                return;
            }
            current = current.next;
        }

        // Adjust pointers to insert newNode at the position
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;

        // If newNode was added at the end, update the tail
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // Remove a book record by Book ID
    public void removeByBookId(int bookId) {
        BookNode current = head;

        // Traverse until the book is found
        while (current != null && current.bookId != bookId) {
            current = current.next;
        }

        // If book is not found, return
        if (current == null) {
            System.out.println("Book not found");
            return;
        }

        // Adjust pointers to remove current node
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
    }

    // Search for a book by Book Title
    public BookNode searchByTitle(String title) {
        BookNode current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Search for a book by Author
    public BookNode searchByAuthor(String author) {
        BookNode current = head;
        while (current != null) {
            if (current.author.equals(author)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Update a book's Availability Status by Book ID
    public void updateAvailabilityByBookId(int bookId, boolean isAvailable) {
        BookNode current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                current.isAvailable = isAvailable;
                return;
            }
            current = current.next;
        }
        System.out.println("Book not found");
    }

    // Display all book records in forward order
    public void displayForward() {
        BookNode current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", Book ID: " + current.bookId + ", Availability: " + (current.isAvailable ? "Available" : "Not Available"));
            current = current.next;
        }
    }

    // Display all book records in reverse order
    public void displayReverse() {
        BookNode current = tail;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", Book ID: " + current.bookId + ", Availability: " + (current.isAvailable ? "Available" : "Not Available"));
            current = current.prev;
        }
    }

    // Count the total number of books in the library
    public int countTotalBooks() {
        int count = 0;
        BookNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
