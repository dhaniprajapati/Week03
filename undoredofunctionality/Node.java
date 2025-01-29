package linkedlist.undoredofunctionality;

class Node {
    String text;
    Node next;
    Node prev;

    // Constructor to create a new node for a state
    public Node(String text) {
        this.text = text;
        this.next = null;
        this.prev = null;
    }
}

