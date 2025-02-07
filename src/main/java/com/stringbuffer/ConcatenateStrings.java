package com.stringbuffer;

public class ConcatenateStrings {
    //method to concatenate strings
    public static String concatenateStrings(String[] str){
        //create a stringbuffer object
        StringBuffer sb = new StringBuffer();
        //run loop and append each string to stringbuffer
        for(int i=0;i<str.length;i++){
            sb.append(str[i]);
        }
        //return the string
        return sb.toString();
    }
    public static void main(String[] args) {
        //create string array and initialize the value
        String[] str= {"Welcome ","to ","the ","hub ","of ","innovation."};
        //call the method and display details
        String output= concatenateStrings(str);
        System.out.println("Concatenate Output: "+output);
    }
}
