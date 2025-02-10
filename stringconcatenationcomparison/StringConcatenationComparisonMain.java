package com.runtimeanalysisandbigonotation.stringconcatenationcomparison;

import static com.runtimeanalysisandbigonotation.stringconcatenationcomparison.StringConcatenationComparison.*;
public class StringConcatenationComparisonMain {

    // Method to generate an array of strings
    static String[] generateStringArray(int size) {
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            // Assign "String" followed by the index number to each element of the array
            array[i] = "String" + i;
        }
        return array;
    }

    // Main method
    public static void main(String[] args) {

        // Generate an array of 1,000 strings
        String[] data1000 = generateStringArray(1000);
        System.out.println("Concatenating 1,000 strings:");
        // Measure and display the performance of different concatenation methods
        stringConcatenation(data1000);
        stringBuilderConcatenation(data1000);
        stringBufferConcatenation(data1000);

        // Generate an array of 10,000 strings
        String[] data10000 = generateStringArray(10000);
        System.out.println("Concatenating 10,000 strings:");
        // Measure and display the performance of different concatenation methods
        stringConcatenation(data10000);
        stringBuilderConcatenation(data10000);
        stringBufferConcatenation(data10000);

        // Generate an array of 1,000,000 strings
        String[] data1000000 = generateStringArray(1000000);
        System.out.println("Concatenating 1,000,000 strings:");
        // Measure and display the performance of different concatenation methods
        stringConcatenation(data1000000);
        stringBuilderConcatenation(data1000000);
        stringBufferConcatenation(data1000000);
    }
}
