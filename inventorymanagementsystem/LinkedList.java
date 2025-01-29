package linkedlist.inventorymanagementsystem;

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Add an item at the beginning of the list
    public void addAtBeginning(String itemName, int itemId, int quantity, double price) {
        Node newNode = new Node(itemName, itemId, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    // Add an item at the end of the list
    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        Node newNode = new Node(itemName, itemId, quantity, price);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Add an item at a specific position
    public void addAtPosition(int position, String itemName, int itemId, int quantity, double price) {
        if (position == 0) {
            addAtBeginning(itemName, itemId, quantity, price);
            return;
        }
        Node newNode = new Node(itemName, itemId, quantity, price);
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bounds");
                return;
            }
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Remove an item based on Item ID
    public void removeByItemId(int itemId) {
        Node current = head;
        Node prev = null;

        if (current != null && current.itemId == itemId) {
            head = current.next;
            return;
        }

        while (current != null && current.itemId != itemId) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        prev.next = current.next;
    }

    // Update the quantity of an item by Item ID
    public void updateQuantityByItemId(int itemId, int newQuantity) {
        Node current = head;
        while (current != null) {
            if (current.itemId == itemId) {
                current.quantity = newQuantity;
                return;
            }
            current = current.next;
        }
    }

    // Search for an item based on Item ID or Item Name
    public Node searchByItemIdOrName(int itemId) {
        Node current = head;
        while (current != null) {
            if (current.itemId == itemId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Node searchByItemName(String itemName) {
        Node current = head;
        while (current != null) {
            if (current.itemName.equals(itemName)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Calculate and display the total value of inventory (Sum of Price * Quantity for each item)
    public double calculateTotalValue() {
        double totalValue = 0;
        Node current = head;
        while (current != null) {
            totalValue += current.price * current.quantity;
            current = current.next;
        }
        return totalValue;
    }

    // Sort the inventory based on Item Name or Price in ascending order (implemented using Bubble Sort)
    public void sortInventoryByItemName() {
        if (head == null) {
            return;
        }
        Node current;
        Node index;
        String tempName;
        int tempId;
        int tempQuantity;
        double tempPrice;
        for (current = head; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.itemName.compareTo(index.itemName) > 0) {
                    // Swap the data between the nodes
                    tempName = current.itemName;
                    tempId = current.itemId;
                    tempQuantity = current.quantity;
                    tempPrice = current.price;

                    current.itemName = index.itemName;
                    current.itemId = index.itemId;
                    current.quantity = index.quantity;
                    current.price = index.price;

                    index.itemName = tempName;
                    index.itemId = tempId;
                    index.quantity = tempQuantity;
                    index.price = tempPrice;
                }
            }
        }
    }

    public void sortInventoryByPrice() {
        if (head == null) {
            return;
        }
        Node current;
        Node index;
        String tempName;
        int tempId;
        int tempQuantity;
        double tempPrice;
        for (current = head; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.price > index.price) {
                    // Swap the data between the nodes
                    tempName = current.itemName;
                    tempId = current.itemId;
                    tempQuantity = current.quantity;
                    tempPrice = current.price;

                    current.itemName = index.itemName;
                    current.itemId = index.itemId;
                    current.quantity = index.quantity;
                    current.price = index.price;

                    index.itemName = tempName;
                    index.itemId = tempId;
                    index.quantity = tempQuantity;
                    index.price = tempPrice;
                }
            }
        }
    }

    // Display all items in the inventory
    public void displayInventory() {
        Node current = head;
        while (current != null) {
            System.out.println("Item Name: " + current.itemName + ", Item ID: " + current.itemId + ", Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }
    }
}
