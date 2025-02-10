package com.runtimeanalysisandbigonotation.fibonaccicomputation;

import static com.runtimeanalysisandbigonotation.fibonaccicomputation.FibonacciComputation.fibonacciIterative;
import static com.runtimeanalysisandbigonotation.fibonaccicomputation.FibonacciComputation.fibonacciRecursive;

public class Main {
    public static void main(String[] args) {
        int[] testCases = {10, 30, 50};

        for (int n : testCases) {
            //measure time for Recursive Fibonacci
            long start = System.nanoTime();
            fibonacciRecursive(n);
            long end = System.nanoTime();
            System.out.println("Recursive Fibonacci took: " + (end - start) / 1000000 + " ms");

            //measure time for Iterative Fibonacci
            start = System.nanoTime();
            fibonacciIterative(n);
            end = System.nanoTime();
            System.out.println("Iterative Fibonacci took: " + (end - start) / 1000000 + " ms");
            System.out.println();
        }
    }
}
