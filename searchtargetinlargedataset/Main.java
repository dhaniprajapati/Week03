package com.runtimeanalysisandbigonotation.searchtargetinlargedataset;

import java.util.Arrays;

import static com.runtimeanalysisandbigonotation.searchtargetinlargedataset.SearchTargetInLargeDataset.*;
public class Main {
    public static void main(String[] args) {

        // Generate a random array with 1000 elements
        int[] dataSet = randomArray(1000);
        // Generate a random target between 1 and 100
        int target = (int) ((Math.random() * 100) + 1);

        // Measure the performance of linear search
        double linearSearchTime = linearSearchPerformance(dataSet, target);
        // Sort the array to prepare it for binary search
        Arrays.sort(dataSet);
        // Measure the performance of binary search
        double binarySearchTime = binarySearchPerformance(dataSet, target);

        // Output the target value
        System.out.println("Target: " + target);
        System.out.println("Linear Search Time: " + linearSearchTime + " ms");
        System.out.println("Binary Search Time: " + binarySearchTime + " ms");
    }
}

