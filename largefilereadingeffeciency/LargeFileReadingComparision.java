package com.runtimeanalysisandbigonotation.largefilereadingeffeciency;

import java.io.*;

public class LargeFileReadingComparision {
    //method to read the text file using FileReader
    public static void fileReader(String filePath) {
        long start = System.nanoTime();
        //read the file using FileReader and BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                //splitting it into words
                String[] words = line.split(" ");
            }
        } catch (IOException e) {
            System.out.println("Error reading file with FileReader: " + e.getMessage());
        }
        long end = System.nanoTime();
        System.out.println("FileReader Time: " + (end - start) / 1000000 + " ms");
    }
    //method to read the text file using InputStreamReader (Byte Stream)
    public static void inputStreamReader(String filePath, String charsetName) {
        long start = System.nanoTime();
        //read the file using FileInputStream and InputStreamReader
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath), charsetName);
             BufferedReader br = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = br.readLine()) != null) {
                //splitting it into words
                String[] words = line.split(" ");
            }
        } catch (IOException e) {
            System.out.println("Error reading file with InputStreamReader: " + e.getMessage());
        }
        long end = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (end - start) / 1000000 + " ms");
    }
}
