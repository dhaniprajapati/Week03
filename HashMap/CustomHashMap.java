package hashing;

import java.util.LinkedList;

class CustomHashMap {

    // Initial size of the array
    private static final int INITIAL_CAPACITY = 16;
    // Array of linked lists (buckets)
    private LinkedList<Entry>[] table;

    // Constructor to initialize the table
    public CustomHashMap() {
        table = new LinkedList[INITIAL_CAPACITY];
        for (int i = 0; i < table.length; i++) {
            // Initialize each bucket as an empty linked list
            table[i] = new LinkedList<>();
        }
    }

    // Hash function to calculate the index for a key
    private int hash(String key) {
        return key.hashCode() % table.length;
    }

    // Inner class to represent a key-value pair
    private static class Entry {
        String key;
        String value;

        // Constructor for Entry
        public Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // Put method to insert key-value pair into the map
    public void put(String key, String value) {
        int index = hash(key);
        LinkedList<Entry> bucket = table[index];

        // Check if key already exists, if so update the value
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                // Update value if key is found
                entry.value = value;
                return;
            }
        }

        // If key doesn't exist, add a new entry
        bucket.add(new Entry(key, value));
    }

    // Get method to retrieve the value for a given key
    public String get(String key) {
        int index = hash(key);
        LinkedList<Entry> bucket = table[index];

        // Search for the key in the corresponding bucket
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        // Return null if the key is not found
        return null;
    }

    // Remove method to delete the key-value pair from the map
    public void remove(String key) {
        int index = hash(key);
        LinkedList<Entry> bucket = table[index];

        // Iterate through the linked list to find and remove the entry
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                // Remove the entry from the list
                bucket.remove(entry);
                return;
            }
        }
    }

    // Method to display the contents of the map for testing
    public void display() {
        for (int i = 0; i < table.length; i++) {
            LinkedList<Entry> bucket = table[i];
            if (!bucket.isEmpty()) {
                System.out.print("Bucket " + i + ": ");
                for (Entry entry : bucket) {
                    System.out.print("[" + entry.key + " = " + entry.value + "] ");
                }
                System.out.println();
            }
        }
    }

    // Main method for testing the custom HashMap implementation
    public static void main(String[] args) {
        // Create an instance of CustomHashMap
        CustomHashMap map = new CustomHashMap();

        // Insert some key-value pairs
        map.put("name", "Anshu");
        map.put("age", "22");
        map.put("city", "Bhopal");

        // Retrieve values
        System.out.println("Name: " + map.get("name")); // Output: Alice
        System.out.println("Age: " + map.get("age"));   // Output: 25

        // Display all elements in the map
        map.display();

        // Remove an entry
        map.remove("age");

        // Display all elements after removal
        map.display();
    }
}
