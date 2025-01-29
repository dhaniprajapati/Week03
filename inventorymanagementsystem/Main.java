package linkedlist.inventorymanagementsystem;

public class Main {
    public static void main(String[] args) {
        LinkedList inventory = new LinkedList();

        // Adding items to the inventory
        inventory.addAtEnd("Apples", 1, 100, 0.50);
        inventory.addAtEnd("Bananas", 2, 150, 0.20);
        inventory.addAtBeginning("Oranges", 3, 200, 0.70);
        inventory.addAtPosition(1, "Grapes", 4, 80, 1.00);

        // Display all items
        inventory.displayInventory();

        // Update the quantity of an item
        inventory.updateQuantityByItemId(2, 120);

        // Remove an item based on Item ID
        inventory.removeByItemId(3);

        // Search for an item by Item ID
        Node item = inventory.searchByItemIdOrName(1);
        if (item != null) {
            System.out.println("Found item: " + item.itemName);
        } else {
            System.out.println("Item not found");
        }

        // Search for an item by Item Name
        item = inventory.searchByItemName("Bananas");
        if (item != null) {
            System.out.println("Found item: " + item.itemName);
        } else {
            System.out.println("Item not found");
        }

        // Calculate and display the total value of inventory
        double totalValue = inventory.calculateTotalValue();
        System.out.println("Total value of inventory: " + totalValue);

        // Sort the inventory by item name
        inventory.sortInventoryByItemName();
        System.out.println("Inventory sorted by item name:");
        inventory.displayInventory();

        // Sort the inventory by price
        inventory.sortInventoryByPrice();
        System.out.println("Inventory sorted by price:");
        inventory.displayInventory();
    }
}

