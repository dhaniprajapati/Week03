package com.binarysearch;

public class FindRotationPoint {
    public static int findRotationPoint(int[] arr) {
        //Initialize left as 0 and right as n - 1
        int left = 0;
        int right = arr.length - 1;
        //loop from left to right
        while (left < right) {
            //find the middle element
            int mid = (left + right) / 2;
            if (arr[mid] > arr[right]) {
                //if the smallest element is in the right half
                left = mid + 1;
            } else {
                //if the smallest element is in the left half
                right = mid;
            }
        }
        //return index of the smallest element
        return left;
    }
    public static void main(String[] args) {
        int[] rotatedArray = {6, 7, 8, 9, 0, 1, 2, 3, 4};
        //call the method
        int rotationPoint = findRotationPoint(rotatedArray);
        System.out.println("Rotation point index: " + rotationPoint);
        System.out.println("Rotation point element: " + rotatedArray[rotationPoint]);
    }
}
