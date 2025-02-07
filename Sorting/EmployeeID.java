package sorting;

import java.util.Arrays;

public class EmployeeID {
    public static void insertionSort(int[] employeeIds){
        int n= employeeIds.length;
        //loop through each element in the array starting from the second element
        for(int i=1;i<n;i++){
            //the current element to be inserted in the sorted portion
            int key= employeeIds[i];
            //index of the last element in the sorted portion
            int j= i-1;
            //move element which are greater than key to one position ahead
            while(j>=0 && employeeIds[j]>key)
            {
                //move element one position ahead
                employeeIds[j+1]=employeeIds[j];
                //move to the previous element in the sorted portion
                j--;
            }
            //place the key at its correct position
            employeeIds[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int[] employeeIds= {234,981,456,863,210};
        insertionSort(employeeIds);
        System.out.println("Employee's ID in sorted way: " + Arrays.toString(employeeIds));
    }
}
