package com.runtimeanalysisandbigonotation.comparedatastructure;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Random;

public class CompareDataStructure {
    //to generate array of random integers with a range
    public static int[] generateArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }

    //convert an array to a HashSet
    public static HashSet<Integer> generateHashSet(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : array) {
            hashSet.add(num);
        }
        return hashSet;
    }

    //convert an array to a TreeSet
    public static TreeSet<Integer> generateTreeSet(int[] array) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : array) {
            treeSet.add(num);
        }
        return treeSet;
    }
    //random element from the array to ensure it's always present
    public static int pickRandomTarget(int[] array) {
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }

    //performs linear search on an array
    public static double searchInArray(int[] array, int target) {
        double startTime = System.nanoTime();
        for (int num : array) {
            if (num == target) {
                break;
            }
        }
        double endTime = System.nanoTime();
        return (endTime - startTime) / 1e6;
    }
    //perform searches for an element in a HashSet
    public static double searchInHashSet(HashSet<Integer> hashSet, int target) {
        double startTime = System.nanoTime();
        boolean found = hashSet.contains(target);
        double endTime = System.nanoTime();
        return (endTime - startTime) / 1e6;
    }

    //perform searches for an element in a TreeSet
    public static double searchInTreeSet(TreeSet<Integer> treeSet, int target) {
        double startTime = System.nanoTime();
        boolean found = treeSet.contains(target);
        double endTime = System.nanoTime();
        return (endTime - startTime) / 1e6; // Convert to milliseconds
    }

    public static void displayResult(double result1, double result2, double result3, int size) {
        System.out.println("Time Taken by linear search: " + result1 + " ms for size " + size);
        System.out.println("Time Taken by HashSet: " + result2 + " ms for size " + size);
        System.out.println("Time Taken by TreeSet: " + result3 + " ms for size " + size);
    }
    public static void main(String[] args) {
        int[] sizes = {1000, 100000, 1000000};

        for (int size : sizes) {
            //generate test data
            int[] array = generateArray(size);
            HashSet<Integer> hashSet = generateHashSet(array);
            TreeSet<Integer> treeSet = generateTreeSet(array);

            //pick a random element that is guaranteed to be in the dataset
            int target = pickRandomTarget(array);

            //measure search time for each data structure
            double arrayTime = searchInArray(array, target);
            double hashSetTime = searchInHashSet(hashSet, target);
            double treeSetTime = searchInTreeSet(treeSet, target);

            displayResult(arrayTime, hashSetTime, treeSetTime, size);
        }
    }

}