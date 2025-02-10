package com.runtimeanalysisandbigonotation.sortinglargedata;

import static com.runtimeanalysisandbigonotation.sortinglargedata.BubbleSort.bubbleSort;
import static com.runtimeanalysisandbigonotation.sortinglargedata.MergeSort.mergeSort;
import static com.runtimeanalysisandbigonotation.sortinglargedata.QuickSort.quickSort;

import java.util.Random;
public class ComparingLargeDataSorting {
    //method to test performance of all sorting algorithms
    private static void testSortingAlgorithms(int[] data) {
        //to test performance of bubble Sort
        int[] bubbleSortData = data.clone();
        long start = System.nanoTime();
        bubbleSort(bubbleSortData);
        long end = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (end - start) / 1000000 + " ms");

        //to test performance of merge Sort
        int[] mergeSortData = data.clone();
        start = System.nanoTime();
        mergeSort(mergeSortData, 0, mergeSortData.length - 1);
        end = System.nanoTime();
        System.out.println("Merge Sort Time: " + (end - start) / 1000000 + " ms");

        //to test performance og quick Sort
        int[] quickSortData = data.clone();
        start = System.nanoTime();
        quickSort(quickSortData, 0, quickSortData.length - 1);
        end = System.nanoTime();
        System.out.println("Quick Sort Time: " + (end - start) / 1000000 + " ms");
    }
    //method to generate random array
    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10000);
        }
        return array;
    }
    //main method
    public static void main(String[] args) {
        int[] dataset1000 = generateRandomArray(1000);
        int[] dataset10000 = generateRandomArray(10000);
        int[] dataset100000 = generateRandomArray(1000000);

        System.out.println("Sorting 1,000 elements:");
        testSortingAlgorithms(dataset1000);

        System.out.println("Sorting 10,000 elements:");
        testSortingAlgorithms(dataset10000);

        System.out.println("Sorting 1,000,000 elements:");
        testSortingAlgorithms(dataset100000);
    }
}