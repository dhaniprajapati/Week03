package linkedlist.undoredofunctionality;

class LinkedList {
    Node head;
    Node tail;
    Node current;
    int maxSize;
    int currentSize;

    // Constructor to initialize the text editor with a fixed history size
    public LinkedList(int maxSize) {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.maxSize = maxSize;
        this.currentSize = 0;
    }

    // Add a new text state at the end
    public void addState(String text) {
        Node newState = new Node(text);

        if (head == null) {
            head = tail = current = newState;
        } else {
            // Remove forward history if any
            if (current.next != null) {
                tail = current;
                current.next = null;
            }

            tail.next = newState;
            newState.prev = tail;
            tail = newState;
            current = newState;

            // Maintain the maximum size of history
            if (currentSize == maxSize) {
                head = head.next;
                head.prev = null;
            } else {
                currentSize++;
            }
        }
    }

    // Undo functionality
    public String undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            return current.text;
        }
        return "No more undo steps available.";
    }

    // Redo functionality
    public String redo() {
        if (current != null && current.next != null) {
            current = current.next;
            return current.text;
        }
        return "No more redo steps available.";
    }

    // Display the current state of text
    public String displayCurrentState() {
        if (current != null) {
            return current.text;
        }
        return "No text available.";
    }
}
