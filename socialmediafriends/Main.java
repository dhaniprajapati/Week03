package linkedlist.socialmediafriends;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList socialMedia = new LinkedList();

        // Adding users to the list
        socialMedia.addNode(1, "Anshu", 22);
        socialMedia.addNode(2, "Rishav", 20);
        socialMedia.addNode(3, "Chinci", 20);
        socialMedia.addNode(4, "Vagisha", 25);

        // Adding friend connections
        socialMedia.addFriendConnection(1, 2);
        socialMedia.addFriendConnection(1, 3);
        socialMedia.addFriendConnection(2, 4);

        // Display friends of a specific user
        socialMedia.displayFriends(1);
        socialMedia.displayFriends(2);

        // Find mutual friends
        ArrayList<Integer> mutualFriends = socialMedia.findMutualFriends(1, 2);
        System.out.println("Mutual friends :");
        for (int friendId : mutualFriends) {
            Node mutualFriend = socialMedia.searchByUserId(friendId);
            if (mutualFriend != null) {
                System.out.println(mutualFriend.name);
            }
        }

        // Count the number of friends for each user
        socialMedia.countFriends();

        // Searching users
        Node user = socialMedia.searchByName("Anshu");
        if (user != null) {
            System.out.println("User found: " + user.name);
        } else {
            System.out.println("User not found");
        }

        user = socialMedia.searchByUserId(3);
        if (user != null) {
            System.out.println("User found: " + user.name);
        } else {
            System.out.println("User not found");
        }

        // Removing a friend connection
        socialMedia.removeFriendConnection(1, 2);
        System.out.println("After removing friend connection between Anshu and Rishav:");
        socialMedia.displayFriends(1);
        socialMedia.displayFriends(2);
    }
}
