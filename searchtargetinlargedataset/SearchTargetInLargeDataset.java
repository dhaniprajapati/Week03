package com.runtimeanalysisandbigonotation.searchtargetinlargedataset;

public class SearchTargetInLargeDataset {

    // Linear search method to find the target in the dataset
    public static int linearSearch(int[] dataSet, int target) {
        int n = dataSet.length;
        for (int i = 0; i < n; i++) {
            // If the target is found, return its index
            if (dataSet[i] == target) {
                return i;
            }
        }
        // If the target is not found, return -1
        return -1;
    }

    // Binary search method to find the target in the dataset
    public static int binarySearch(int[] dataSet, int target) {
        int n = dataSet.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // If the target is found, return its index
            if (dataSet[mid] == target) {
                return mid;
            }
            // If the target is greater than mid, ignore the left half
            if (dataSet[mid] < target) {
                left = mid + 1;
            } else {
                // If the target is smaller than mid, ignore the right half
                left = mid - 1;
            }
        }
        // If the target is not found, return -1
        return -1;
    }

    // Measure the performance of linear search method
    public static double linearSearchPerformance(int[] dataSet, int target) {
        long startTime = System.nanoTime();
        linearSearch(dataSet, target);
        long endTime = System.nanoTime();
        // Return the elapsed time in milliseconds
        return (endTime - startTime)/1e6;
    }

    // Measure the performance of binary search method
    public static double binarySearchPerformance(int[] dataSet, int target) {
        long startTime = System.nanoTime();
        binarySearch(dataSet, target);
        long endTime = System.nanoTime();
        // Return the elapsed time in milliseconds
        return (endTime - startTime)/1e6;
    }

    // Generate an array with random integers
    public static int[] randomArray(int size) {
        int[] dataSet = new int[size];
        for (int i = 0; i < size; i++) {
            // Assign random integers between 1 and 100 to the array
            dataSet[i] = (int) ((Math.random() * 100) + 1);
        }
        return dataSet;
    }
}
