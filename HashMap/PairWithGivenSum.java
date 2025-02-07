package hashing;


import java.util.HashSet;

public class PairWithGivenSum {

    // Method to check if there is a pair with given sum
    public static boolean hasPairWithSum(int[] arr, int targetSum) {
        // Check for edge cases
        if (arr == null || arr.length == 0) {
            return false;
        }

        // Create a hash set to store the numbers
        HashSet<Integer> set = new HashSet<>();

        // Iterate through the array
        for (int num : arr) {
            // Check if the difference between the target sum and the current element is present in the set
            if (set.contains(targetSum - num)) {
                return true;
            }
            // Add the current element to the set
            set.add(num);
        }
        // If no pair is found, return false
        return false;
    }

    public static void main(String args[]) {
        int[] arr = {10, 1, 3, 7, 3};
        int targetSum = 16;

        boolean result = hasPairWithSum(arr, targetSum);
        System.out.println("Does the array have a pair with sum " + targetSum + "? " + result);
    }
}

