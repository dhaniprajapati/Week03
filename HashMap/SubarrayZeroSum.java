package hashing;

import java.util.*;
public class SubarrayZeroSum{
    //method to find all subarrays with zero sum
    public static List<String> findSubarraysWithZeroSum(int[] array) {
        //initialize a list to store the result
        List<String> result = new ArrayList<>();
        //initialize a map to store the sum and the index of the sum
        HashMap<Integer, Integer> map = new HashMap<>();
        //initialize cummulative sum
        int cummulativeSum = 0;
        //iterate through the array
        for (int i = 0; i < array.length; i++) {
            //add the current element to the cummulative sum
            cummulativeSum += array[i];
            //if the cummulative sum is zero, add the subarray to the result
            if (cummulativeSum == 0) {
                result.add("0 to " + i);
            }
            //if the cummulative sum is already in the map, add the subarray from the index after the previous occurrence to the result
            if (map.containsKey(cummulativeSum)) {
                result.add((map.get(cummulativeSum) + 1) + " to " + i);
            }
            //add the cummulative sum and the index to the map
            map.put(cummulativeSum, i);
        }
        //return the result
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 0, 7, 0, 9};
        List<String> result = findSubarraysWithZeroSum(array);
        //run loop to find the cummulative sum
        for (String subarray : result) {
            System.out.println(subarray);
        }
    }
}
