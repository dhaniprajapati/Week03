package sorting;

import java.util.Arrays;
public class ExamScores
{
    //method to perform Selection Sort on an array
    public static void selectionSort(int[] scores) {
        int n = scores.length;
        //loop through each element of the array
        for (int i = 0; i < n - 1; i++) {
            //index of the minimum element
            int minIndex = i;
            //find the minimum element in the remaining unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    //update the index of the minimum element
                    minIndex = j;
                }
            }
            //swap the found minimum element with the first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] scores = {85, 70, 95, 60, 90};
        selectionSort(scores);
        System.out.println("Sorted exam scores: " + Arrays.toString(scores));
    }
}
