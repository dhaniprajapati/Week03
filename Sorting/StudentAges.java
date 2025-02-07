package sorting;

import java.util.Arrays;
public class StudentAges {

    //method to perform Counting Sort on an array
    public static void countingSort(int[] ages) {
        int n = ages.length;
        //range of ages
        int range = 9;
        //create a count array to store the frequency of each age
        int[] count = new int[range];
        //initialize the count array with zeros
        for (int i = 0; i < range; i++) {
            count[i] = 0;
        }
        //store the frequency of each age in the count array
        for (int i = 0; i < n; i++) {
            count[ages[i] - 10]++;
        }
        //compute the cumulative frequencies
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        //create an output array to store the sorted ages
        int[] output = new int[n];
        //run loop to place the elements in the correct positions in the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[ages[i] - 10] - 1] = ages[i];
            count[ages[i] - 10]--;
        }
        //copy the sorted elements from the output array to the original array
        for (int i = 0; i < n; i++) {
            ages[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] ages = {12, 14, 10, 17, 18, 13, 15, 12, 16, 11, 16};
        countingSort(ages);
        System.out.println("Sorted student ages: " + Arrays.toString(ages));
    }
}
