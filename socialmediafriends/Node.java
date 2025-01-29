package linkedlist.socialmediafriends;
import java.util.*;
class Node {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friendIds; // List of Friend IDs
    Node next;

    // Constructor to create a new node
    public Node(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;  // next pointer is initialised to null
    }
}
