package linkedlist.inventorymanagementsystem;

class Node {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Node next;

    // Constructor to create a new node
    public Node(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;  // next pointer is initialised to null
    }
}

