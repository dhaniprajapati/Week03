package hashing;


import java.util.HashSet;
import java.util.Set;

public class LongestConservativeSequence {
    public static int findlongestConservativeSequence(int[] arr) {
        //create a hashset to store all the elements in the array
        Set<Integer> set = new HashSet<>();
        //loop to add the elements
        for (int i : arr) {
            set.add(i);
        }
        //create a variable to store the maximum value
        int max = 0;
        //loop to find the longest conservative sequence
        for (int i : arr) {
            //check if the element is the first element of the sequence
            if (!set.contains(i - 1)) {
                //create j to store the next element
                int j = i;
                //loop while the next element is in the set
                while (set.contains(j)) {
                    j++;
                }
                //update max if necessary 1-based index is used in the array
                max = Math.max(max, j - i);
            }
        }
        //return the maximum value
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 4, 5, 7, 8, 9};
        int result = findlongestConservativeSequence(arr);
        System.out.println("The longest conservative sequence length is: " + result);


    }
}

