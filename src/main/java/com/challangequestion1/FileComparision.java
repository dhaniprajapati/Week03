package com.challangequestion1;
import java.io.*;

public class FileComparision{
    //method to concatenate strings using StringBuilder
    public static void testStringBuilder(String str, int n) {
        //create a StringBuilder object
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        //run loop to concatenate the string
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        long endTime = System.currentTimeMillis();
        //calculate and print the time taken
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ms");
    }
    //method to concatenate strings using StringBuffer
    public static void testStringBuffer(String str, int n) {
        //create a StringBuffer object
        StringBuffer sb = new StringBuffer();
        long startTime = System.currentTimeMillis();
        //method to concatenate the string
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        long endTime = System.currentTimeMillis();
        //calculate and print the time taken
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ms");
    }

    //method to count words in a file using FileReader
    public static void countWordsWithFileReader(String filePath) {
        //initialize word count
        int wordCount = 0;
        long startTime = System.currentTimeMillis();
        try {
            //create a FileReader object and wrap it in a BufferedReader
            FileReader fileReader = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            //loop to read each line from the file
            while ((line = br.readLine()) != null) {
                //split the line into words and count them
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            br.close();
        }
        //catch exception and print message
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        long endTime = System.currentTimeMillis();
        //print the word count and time taken
        System.out.println("FileReader word count: " + wordCount);
        System.out.println("FileReader time: " + (endTime - startTime) + " ms");
    }

    //method to count words in a file using InputStreamReader
    public static void countWordsWithInputStreamReader(String filePath) {
        //initialize word count
        int wordCount = 0;
        long startTime = System.currentTimeMillis();
        try {
            //create a FileInputStream object and wrap it in an InputStreamReader and BufferedReader
            FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader br = new BufferedReader(inputStreamReader);
            String line;
            //run loop to read each line from the file
            while ((line = br.readLine()) != null) {
                //split the line into words and count them
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            br.close();
        //catch exception and print message if error reading file
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        long endTime = System.currentTimeMillis();
        //print the word count and time taken
        System.out.println("InputStreamReader word count: " + wordCount);
        System.out.println("InputStreamReader time: " + (endTime - startTime) + " ms");
    }

    public static void main(String[] args) {
        String str = "hello";
        int n = 1000000;
        String filePath = "C:\\Users\\praja\\OneDrive\\Desktop\\DSA\\Day04\\src\\main\\java\\com\\challangequestion1\\coww";
        //call the methods
        testStringBuilder(str, n);
        testStringBuffer(str, n);
        countWordsWithFileReader(filePath);
        countWordsWithInputStreamReader(filePath);
    }
}
