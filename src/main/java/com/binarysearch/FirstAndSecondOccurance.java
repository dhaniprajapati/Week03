package com.binarysearch;

public class FirstAndSecondOccurance {
    //method to find the first occurrence of the target element
    public static int findFirstOccurrence(int[] arr, int target) {
        //initialize the left pointer
        int left = 0;
        //initialize the right pointer
        int right = arr.length - 1;
        //initialize the result variable to store the index of the first occurrence
        int result = -1;
        //run loop to search for element
        while (left <= right) {
            //calculate the middle index
            int mid = (left + right) / 2;
            //if the middle element is the target
            if (arr[mid] == target) {
                //update the result to the current middle index
                result = mid;
                right = mid - 1;
            //if the middle element is less than the target
            } else if (arr[mid] < target) {
                //search in the right half
                left = mid + 1;
            //if the middle element is greater than the target
            } else {
                //search in the left half
                right = mid - 1;
            }
        }
        //return the index of the first occurrence
        return result;
    }
    //method to find the last occurrence of the target element
    public static int findLastOccurrence(int[] arr, int target) {
        //initialize the left pointer
        int left = 0;
        //initialize the right pointer
        int right = arr.length - 1;
        //initialize the result variable to store the index of the last occurrence
        int result = -1;
        //run loop to search for element
        while (left <= right) {
            //calculate the middle index
            int mid = (left + right) / 2;
            //if the middle element is the target
            if (arr[mid] == target) {
                //update the result to the current middle index
                result = mid;
                left = mid + 1;
            //if the middle element is less than the target
            } else if (arr[mid] < target) {
                //search in the right half
                left = mid + 1;
                //if the middle element is greater than the target
            } else {
                //search in the left half
                right = mid - 1;
            }
        }
        //return the index of the last occurrence
        return result;
    }
    public static void main(String[] args) {
        int[] sortedArray = {1, 9, 12, 21, 23, 34, 51};
        //target value
        int target = 23;
        //call the method and print result
        int firstOccurrence = findFirstOccurrence(sortedArray, target);
        int lastOccurrence = findLastOccurrence(sortedArray, target);
        System.out.println("First occurrence of target: " + firstOccurrence);
        System.out.println("Last occurrence of target: " + lastOccurrence);
    }
}
