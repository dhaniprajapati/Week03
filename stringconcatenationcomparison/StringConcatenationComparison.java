package com.runtimeanalysisandbigonotation.stringconcatenationcomparison;
public class StringConcatenationComparison {

    // Method to concatenate strings using the '+' operator
    static void stringConcatenation(String[] data) {
        long start = System.nanoTime();
        String result = "";
        for (String s : data) {
            // Concatenate each string to the result
            result += s;
        }
        long end = System.nanoTime();
        // Output the time taken for string concatenation
        System.out.println("String Concatenation Time: " + (end - start)/1000000 + " ms");
    }

    // Method to concatenate strings using StringBuilder
    static void stringBuilderConcatenation(String[] data) {
        long start = System.nanoTime();
        StringBuilder result = new StringBuilder();
        for (String s : data) {
            // Append each string to the result
            result.append(s);
        }
        long end = System.nanoTime();
        // Output the time taken for StringBuilder concatenation
        System.out.println("StringBuilder Concatenation Time: " + (end - start)/1000000 + " ms");
    }

    // Method to concatenate strings using StringBuffer
    static void stringBufferConcatenation(String[] data) {
        long start = System.nanoTime();
        StringBuffer result = new StringBuffer();
        for (String s : data) {
            // Append each string to the result
            result.append(s);
        }
        long end = System.nanoTime();
        // Output the time taken for StringBuffer concatenation
        System.out.println("StringBuffer Concatenation Time: " + (end - start)/1000000 + " ms");
    }
}
