package com.binarysearch;

import java.util.Arrays;
public class FirstMissingPositiveInteger {

    //method to find the first missing positive integer using Linear Search
    public static int findFirstMissingPositive(int[] nums) {
        int n = nums.length;
        //run loop
        for (int i = 0; i < n; i++) {
            //if the element is less than or equal to 0 or greater than n
            if (nums[i] <= 0 || nums[i] > n) {
                //set the element to n + 1
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            //find the absolute value of the current element
            int num = Math.abs(nums[i]);
            //if the number is within the range
            if (num <= n) {
                //set the index to negetive
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        //loop to find the first missing positive integer
        for (int i = 0; i < n; i++) {
            // If the element at index i is positive
            if (nums[i] > 0) {
                // Return the first missing positive integer
                return i + 1;
            }
        }
        //if all positive integers from 1 to n are present return n + 1
        return n + 1;
    }
    //method to find the index of the target value using Binary Search
    public static int binarySearch(int[] arr, int target) {
        //initialize the left pointer
        int left = 0;
        //initialize the right pointer
        int right = arr.length - 1;
        //loop to perform binary search
        while (left <= right) {
            //calculate the middle index
            int mid = (left + right) / 2;
            //if the middle element is the target
            if (arr[mid] == target) {
                //return the index of the target element
                return mid;
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
        //return -1 if the target is not found
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 3, 4, 5, 6};
        //target value
        int target = 2;
        //call the method and print the result
        int firstMissingPositive = findFirstMissingPositive(nums);
        System.out.println("First missing positive integer: " + firstMissingPositive);
        //sort the array
        Arrays.sort(nums);
        //call the method and print the result
        int targetIndex = binarySearch(nums, target);
        System.out.println("Index of target: " + targetIndex);
    }
}

