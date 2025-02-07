package stackandqueue;

import java.util.*;
public class SlidingWindow {
    public static void main(String[] args) {
        //initialising an array
        int[] arr= {1,2,3,5,7,9,19,20,15,13,48};
        //create a variable max and assign it the value at arr index 0
        int max= arr[0];
        //take arr length as n
        int n= arr.length;
        //take window value
        int k= 4;
        //initialize an array to store the maximum value of the sliding window
        int[] maxArr= new int[n-k+1];
        //create deque
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        //run loop for each element
        for(int i=0;i<n;i++)
        {
            //if i is smaller than window value
            if(i<k)
            {
                //add next element at index i of arr
                deque.add(arr[i]);
                //perform operation to get the maximum number
                max= Math.max(max,arr[i]);
                //store the max value at index 0 of maxArr
                maxArr[0] =max;
            }
            else {
                //remove first element
                int removing= deque.removeFirst();
                //add element of next index
                int adding = arr[i];
                deque.add(arr[i]);
                //initialising the max value with the current index value
                max=arr[i];
                //iterating over the elements in the deque and updating the max value
                for(int j: deque)
                {
                    max= Math.max(max,j);
                }
                //storing the maximum value of the current window in the maxArr
                maxArr[i-k+1]=max;
            }
        }
        //print each value
        for(int i: maxArr){
            System.out.print(i+" ");
        }
    }
}
