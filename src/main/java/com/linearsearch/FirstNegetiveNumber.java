package com.linearsearch;

public class FirstNegetiveNumber {
    public static int findFirstNegative(int[] arr) {
        //run loop through the array to check if any number is negetive or not
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                //return the index of negetive number
                return i;
            }
        }
        //return -1 if no negative number is found
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0, 5, 8, 1, -2, 4, -9};
        //call the method
        int index = findFirstNegative(arr);
        //if index value is not equal to -1 print result
        if (index != -1) {
            System.out.println("Found first negative number at index: " + index);
        } else {
            System.out.println("Negetive number not found");
        }
    }
}
