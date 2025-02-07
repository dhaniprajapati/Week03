package com.stringbuilder;

import java.lang.String;
import java.lang.StringBuilder;
public class ReverseString {
    //create a method to reverse the string
    public static String reverseString(String str) {
        //create a StringBuilder
        StringBuilder sb = new StringBuilder(str);
        //to reverse the string
        sb.reverse();
        //return the string back
        return sb.toString();
    }

    public static void main(String[] args) {
        //Create a string variable and initialize it.
        String str = "hello";
        //call the method to reverse the string
        String reverse = reverseString(str);
        System.out.println("Reversed String: "+reverse);
        //to get the Original String
        String input = str.toString();
        System.out.println("Original String: " +input);
    }
}


