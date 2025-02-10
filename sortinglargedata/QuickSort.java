package com.runtimeanalysisandbigonotation.sortinglargedata;
public class QuickSort {

    // Method to perform Quick Sort on the dataset
    public static void quickSort(int[] dataSet, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(dataSet, low, high);

            // Recursively sort the subarrays
            quickSort(dataSet, low, pivotIndex - 1);
            quickSort(dataSet, pivotIndex + 1, high);
        }
    }

    // Method to partition the array and return the pivot index
    private static int partition(int[] dataSet, int low, int high) {
        // Select the pivot element
        int pivot = dataSet[high];
        int i = low - 1;

        // Rearrange the array elements based on the pivot
        for (int j = low; j < high; j++) {
            if (dataSet[j] <= pivot) {
                i++;
                // Swap elements at positions i and j
                int temp = dataSet[i];
                dataSet[i] = dataSet[j];
                dataSet[j] = temp;
            }
        }
        // Swap the pivot element to its correct position
        int temp = dataSet[i + 1];
        dataSet[i + 1] = dataSet[high];
        dataSet[high] = temp;
        return i + 1;
    }
}
