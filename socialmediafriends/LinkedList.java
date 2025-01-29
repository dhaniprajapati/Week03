package linkedlist.socialmediafriends;
import java.util.*;
class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Add a new user to the list (at the end)
    public void addNode(int userId, String name, int age) {
        Node newNode = new Node(userId, name, age);
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

    // Search for a user by User ID
    public Node searchByUserId(int userId) {
        Node current = head;
        while (current != null) {
            if (current.userId == userId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Search for a user by Name
    public Node searchByName(String name) {
        Node current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Add a friend connection between two users
    public void addFriendConnection(int userId1, int userId2) {
        Node user1 = searchByUserId(userId1);
        Node user2 = searchByUserId(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.add(userId2);
            user2.friendIds.add(userId1);
        }
    }

    // Remove a friend connection
    public void removeFriendConnection(int userId1, int userId2) {
        Node user1 = searchByUserId(userId1);
        Node user2 = searchByUserId(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(userId2));
            user2.friendIds.remove(Integer.valueOf(userId1));
        }
    }

    // Find mutual friends between two users
    public ArrayList<Integer> findMutualFriends(int userId1, int userId2) {
        Node user1 = searchByUserId(userId1);
        Node user2 = searchByUserId(userId2);
        ArrayList<Integer> mutualFriends = new ArrayList<>();
        if (user1 != null && user2 != null) {
            for (int friendId1 : user1.friendIds) {
                if (user2.friendIds.contains(friendId1)) {
                    mutualFriends.add(friendId1);
                }
            }
        }
        return mutualFriends;
    }

    // Display all friends of a specific user
    public void displayFriends(int userId) {
        Node user = searchByUserId(userId);
        if (user != null) {
            System.out.println("Friends of " + user.name + ":");
            for (int friendId : user.friendIds) {
                Node friend = searchByUserId(friendId);
                if (friend != null) {
                    System.out.println(friend.name);
                }
            }
        } else {
            System.out.println("User not found");
        }
    }

    // Count the number of friends for each user
    public void countFriends() {
        Node current = head;
        while (current != null) {
            System.out.println(current.name + " has " + current.friendIds.size() + " friends.");
            current = current.next;
        }
    }
}
