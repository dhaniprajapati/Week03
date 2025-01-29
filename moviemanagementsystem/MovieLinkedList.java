package linkedlist.moviemanagementsystem;

class MovieLinkedList {
    MovieNode head;
    MovieNode tail;

    public MovieLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Add a movie record at the beginning of the list
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;  // point newNode's next to current head
            head.prev = newNode;  // point current head's prev to newNode
            head = newNode;  // update head to newNode
        }
    }

    // Add a movie record at the end of the list
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;  // point tail's next to newNode
            newNode.prev = tail;  // point newNode's prev to current tail
            tail = newNode;  // update tail to newNode
        }
    }

    // Add a movie record at a specific position in the list
    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position == 0) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        MovieNode newNode = new MovieNode(title, director, year, rating);
        MovieNode current = head;

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

    // Remove a movie record by title
    public void removeByTitle(String title) {
        MovieNode current = head;

        // Traverse until the movie is found
        while (current != null && !current.title.equals(title)) {
            current = current.next;
        }

        // If movie is not found, return
        if (current == null) {
            System.out.println("Movie not found");
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

    // Search for a movie by director
    public MovieNode searchByDirector(String director) {
        MovieNode current = head;
        while (current != null) {
            if (current.director.equals(director)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Search for a movie by rating
    public MovieNode searchByRating(double rating) {
        MovieNode current = head;
        while (current != null) {
            if (current.rating == rating) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Display all movie records in forward order
    public void displayForward() {
        MovieNode current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.next;
        }
    }

    // Display all movie records in reverse order
    public void displayReverse() {
        MovieNode current = tail;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.prev;
        }
    }

    // Update a movie's rating by its title
    public void updateRatingByTitle(String title, double newRating) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                current.rating = newRating;
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found");
    }
}

