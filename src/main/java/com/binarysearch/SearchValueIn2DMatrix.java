package com.binarysearch;

public class SearchValueIn2DMatrix {
    //method to search for target value in a 2D matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        //get the number of rows in the matrix
        int rows = matrix.length;
        //get the number of columns in the matrix
        int columns = matrix[0].length;
        //initialize the left pointer
        int left = 0;
        //initialize the right pointer
        int right = rows * columns - 1;
        //run loop until right is greater than left
        while (left <= right) {
            //calculate the middle index
            int mid = (left + right) / 2;
            //find value at the middle index
            int midValue = matrix[mid / columns][mid % columns];
            //if the middle value is the target return true
            if (midValue == target) {
                return true;
                //if the middle value is less than the target search in the right half
            } else if (midValue < target) {
                left = mid + 1;
                //if the middle value is greater than the target, search in the left half
            } else {
                right = mid - 1;
            }
        }
        //if the target is not found, return false
        return false;
    }
    public static void main(String[] args) {
        //create 2D sorted matrix
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {21, 31, 41, 51}
        };
        //target value
        int target = 3;
        //call the method and print the result
        boolean result = searchMatrix(matrix, target);
        System.out.println("Target found: " + result);
    }
}

