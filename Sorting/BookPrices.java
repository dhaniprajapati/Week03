package sorting;

import java.util.Arrays;

public class BookPrices {
    //method to perform merge sort on the array of book prices
    public static void mergeSort(int[] prices, int left, int right) {
        //if there is more than one element
        if (left < right) {
            //calculate the middle point
            int mid = left + (right - left) / 2;

            //recursively sort the first half
            mergeSort(prices, left, mid);
            //recursively sort the second half
            mergeSort(prices, mid + 1, right);
            //merge the sorted halves
            mergeShot(prices, left, mid, right);
        }
    }
    //method to merge two sorted subarrays
    private static void mergeShot(int[] prices, int left, int mid, int right) {
        //number of elements in the left subarray
        int n1 = mid - left + 1;
        //number of elements in the right subarray
        int n2 = right - mid;

        //create temporary arrays to hold the two halves
        int[] leftprices = new int[n1];
        int[] rightprices = new int[n2];

        //copy data to temporary arrays
        System.arraycopy(prices, left, leftprices, 0, n1);
        System.arraycopy(prices, mid + 1, rightprices, 0, n2);
        //initialize indexes of the subarrays and the merged array
        int i = 0;
        int j = 0;
        int k = left;

        //merge the two subarrays
        while (i < n1 && j < n2) {
            if (leftprices[i] <= rightprices[j]) {
                //copy the smaller element to the merged array
                prices[k++] = leftprices[i++];
            } else {
                //copy the smaller element to the merged array
                prices[k++] = rightprices[j++];
            }
        }
        //copy remaining elements of leftprices, if any
        while (i < n1) {
            prices[k++] = leftprices[i++];
        }
        //copy remaining elements of rightprices, if any
        while (j < n2) {
            prices[k++] = rightprices[j++];
        }
    }
    public static void main(String[] args) {
        int[] prices = {599, 399, 458, 294, 299};
        System.out.println(Arrays.toString(prices));
    }
}
