package com.runtimeanalysisandbigonotation.sortinglargedata;
public class MergeSort {

    // Method to perform Merge Sort on the dataset
    public static void mergeSort(int[] dataSet, int left, int right) {
        if (left < right) {
            // Calculate the middle point of the current subarray
            int mid = left + (right - left) / 2;

            // Recursively sort the left and right subarrays
            mergeSort(dataSet, left, mid);
            mergeSort(dataSet, mid + 1, right);

            // Merge the sorted subarrays
            merge(dataSet, left, mid, right);
        }
    }

    // Method to merge two sorted subarrays
    static void merge(int[] dataSet, int left, int mid, int right) {
        // Calculate the sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays to hold the data
        int[] leftDataSet = new int[n1];
        int[] rightDataSet = new int[n2];

        // Copy the data into the temporary arrays
        for (int i = 0; i < n1; i++) {
            leftDataSet[i] = dataSet[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightDataSet[j] = dataSet[mid + 1 + j];
        }

        // Merge the temporary arrays back into the original dataset
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftDataSet[i] <= rightDataSet[j]) {
                dataSet[k++] = leftDataSet[i++];
            } else {
                dataSet[k++] = rightDataSet[j++];
            }
        }

        // Copy any remaining elements from the leftDataSet
        while (i < n1) {
            dataSet[k++] = leftDataSet[i++];
        }

        // Copy any remaining elements from the rightDataSet
        while (j < n2) {
            dataSet[k++] = rightDataSet[j++];
        }
    }
}
