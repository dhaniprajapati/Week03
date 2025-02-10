package com.runtimeanalysisandbigonotation.sortinglargedata;
public class BubbleSort {

    // Method to perform Bubble Sort on the dataset
    public static void bubbleSort(int[] dataSet) {
        int n = dataSet.length;
        // Outer loop for traversing the entire array
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // If the current element is greater than the next element
                if (dataSet[j] > dataSet[j + 1]) {
                    // Swap the elements
                    int temp = dataSet[j];
                    dataSet[j] = dataSet[j + 1];
                    dataSet[j + 1] = temp;
                }
            }
        }
    }
}
