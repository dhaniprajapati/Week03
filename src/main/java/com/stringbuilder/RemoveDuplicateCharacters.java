package com.stringbuilder;

import java.util.HashSet;

public class RemoveDuplicateCharacters {
    //create a method to remove duplicate characters from a string
    public static String removeDuplicates(String str){
        //create a StringBuilder
        StringBuilder sb = new StringBuilder();
        //create a hashset to keep track of the characters
        HashSet <Character> set = new HashSet<>();
        //run loop through the string
        for(int i = 0; i<str.length(); i++) {
            //create char to store current character
            char currCharacter = str.charAt(i);
            //if set does not contain current character, append it to string builder and add it to hashset
            if(!set.contains(currCharacter)){
                sb.append(currCharacter);
                set.add(currCharacter);
            }
        }
        //return the string
        return sb.toString();
    }

    public static void main(String[] args) {
        //input string value
        String str= "Congratulations";
        //call the method and display result
        String output= removeDuplicates(str);
        System.out.println("Output: "+output);
    }
}
