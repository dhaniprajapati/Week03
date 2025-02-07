package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordOccuranceCount {
    //create method to count word occurance
    public static int countWordOccurrences(String filePath, String targetWord) {
        //create int variable to store count of word occurance
        int count = 0;
        //try and catch method
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                //split the line into words
                String[] words = line.split(" ");
                //run loop for each word
                for (String word : words) {
                    //to match the words ignoring upper and lower cases
                    if (word.equalsIgnoreCase(targetWord)) {
                        //increment the counter if the word matches the target word
                        count++;
                    }
                }
            }
        // IO exception if there is error in reading file
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        //return the final count
        return count;
    }
    public static void main(String[] args) {
        String filePath = "C:\\Users\\praja\\OneDrive\\Desktop\\DSA\\Day04\\src\\main\\java\\com\\filereader\\Cow.txt";
        String targetWord = "cows";
        //call the method and print result
        int count = countWordOccurrences(filePath, targetWord);
        System.out.println("Word: " + targetWord);
        System.out.println("Occurance: " +count+ " times");
    }
}

