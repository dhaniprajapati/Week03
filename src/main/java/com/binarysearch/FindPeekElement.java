package com.binarysearch;

public class FindPeekElement {
    public static int findPeakElement(int[] arr) {
        //Initialize left as 0 and right as array length-1
        int left = 0;
        int right = arr.length - 1;
        // loop from left to right index
        while (left < right) {
            //to find the mid point
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //if mid is greater than the next element the peak is on the left side
                right = mid;
            } else {
                //if mid is less than the next element the peak is on the right side
                left = mid + 1;
            }
        }
        //return the peak element
        return left;
    }
    public static void main(String[] args) {
        int[] array = {11, 13, 29, 34, 77, 52};
        //call the method
        int peakIndex = findPeakElement(array);
        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element: " + array[peakIndex]);
    }
}
