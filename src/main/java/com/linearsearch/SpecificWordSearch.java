package com.linearsearch;

public class SpecificWordSearch {
    public static String findSentenceWithWord(String[] sentences, String word) {
        //run loop through the sentence to check if it contains the word
        for (String s : sentences) {
            if (s.contains(word)) {
                //return the first matching sentence
                return s;
            }
        }
        //return if no sentence found with that word
        return "Not Found";
    }
    public static void main(String[] args) {
        //input sentence
        String[] sentences = {
                "A cow is a domestic animal.",
                "Cows are one of the most innocent animals who are very harmless.",
                "People keep cows at their homes for various benefits.",
                "Cows are four-footed and have a large body.",
               };
        //create variable and store target word
        String wordToFind = "cow";
        //call the method and print result
        String result = findSentenceWithWord(sentences, wordToFind);
        System.out.println("Output: " + result);
    }
}
