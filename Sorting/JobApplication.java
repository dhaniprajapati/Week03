package sorting;

import java.util.Arrays;
public class JobApplication {

    //method to perform Heap Sort on an array
    public static void heapSort(int[] salaries) {
        int n = salaries.length;
        //build a Max Heap from the array
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }
        //extract elements from the heap one by one
        for (int i = n - 1; i >= 0; i--) {
            //move the current root (largest element) to the end of the array
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            //call heapify on the reduced heap
            heapify(salaries, i, 0);
        }
    }
    //method to heapify a subtree rooted with node i
    private static void heapify(int[] salaries, int n, int i) {
        //initialize largest as root
        int largest = i;
        //left child index
        int left = 2 * i + 1;
        //right child index
        int right = 2 * i + 2;
        //if left child is larger than root
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }
        //if right child is larger than the largest so far
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }
        //if largest is not root
        if (largest != i) {
            int temp = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = temp;
            //recursively heapify the affected subtree
            heapify(salaries, n, largest);
        }
    }
    public static void main(String[] args) {
        int[] salaries = {35000, 55000, 45000, 30000, 50000};
        heapSort(salaries);
        System.out.println("Sorted salaries: " + Arrays.toString(salaries));
    }
}
