package sorting;

import java.util.Arrays;
public class ProductPrices
{
    //method to perform Quick Sort on an array
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            //partition the array around the pivot and get the pivot index
            int pivotIndex = partition(prices, low, high);

            //recursively sort the elements before and after the partition
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }
    //method to partition the array around the pivot
    private static int partition(int[] prices, int low, int high) {
        //choosing the last element as the pivot
        int pivot = prices[high];
        //index of the smaller element
        int i = low - 1;

        for (int j = low; j < high; j++) {
            //if the current element is smaller than or equal to the pivot
            if (prices[j] <= pivot) {
                i++;
                //swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        //swap prices[i+1] and prices[high] (pivot)
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;
        //return the pivot index
        return i + 1;
    }

    public static void main(String[] args) {
        int[] prices = {599, 399, 458, 294, 299};
        quickSort(prices, 0, prices.length - 1);
        System.out.println("Sorted product prices: " + Arrays.toString(prices));
    }
}

