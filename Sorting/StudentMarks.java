package sorting;

import java.util.Arrays;

public class StudentMarks {
    public static void bubbleSort(int[] marks){
        //create n variable and initialize it as length of marks of student
        int n= marks.length;
        //check if swaps were made
        boolean swapped;
        //run loop n-1 times
        for(int i=0;i<n-1;i++){
            //reset swap before each pass
            swapped=false;
            //loop to compare adjacent elements
            for(int j=0; j<n-1-1;j++){
                //if left element is greater than the right one, swap them
                if(marks[j]>marks[j+1])
                {
                    //store left element in a temp variable
                    int temp= marks[j];
                    //store left element to right position
                    marks[j]=marks[j+1];
                    //store right element back to temp
                    marks[j+1]=temp;
                    //if swap occured
                    swapped=true;
                }
            }
            //if array is already sorted, no swap will occur
            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] marks={20,34,56,48,87,68,59,60,90,83,31,52,99};
        bubbleSort(marks);
        System.out.println("Sorted marks of students: "+ Arrays.toString(marks));
    }
}
