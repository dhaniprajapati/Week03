package com.stringbuffer;

public class CompareConcatenatedStrings {
    //method to calculate performance of StringBuilder
    public static long measureStringBuilderPerformance(int n, String str) {
        //initialize starttime and endtime
        long startTime, endTime;
        //testing stringbuilder performance
        startTime = System.nanoTime();
        //create StringBuilder object
        StringBuilder builder = new StringBuilder(str);
        //run loop to concatenate the string n times and append it to stringbuilder
        for (int i = 0; i < n; i++) {
            builder.append(str);
        }
        endTime = System.nanoTime();
        //calculate the total duration
        return endTime - startTime;
    }
    //method to calculate performance of StringBuffer
    public static long measureStringBufferPerformance(int n, String str) {
        //initialize starttime and endtime
        long startTime, endTime;
        //testing stringbuffer performance
        startTime= System.nanoTime();
        //create StringBuffer object
        StringBuffer buffer = new StringBuffer();
        //run loop to concatenate the string n times and append it to stringbuffer
        for(int i=0;i<n;i++){
            buffer.append(str);
        }
        endTime= System.nanoTime();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        //number of times the string will be concatenated
        int n= 1000000;
        //string to be concatenated
        String str= "hello";

        long stringBuilderDuration = measureStringBuilderPerformance(n, str);
        long stringBufferDuration = measureStringBufferPerformance(n, str);

        System.out.println("Time taken by StringBuilder: " + stringBuilderDuration + " nanoseconds");
        System.out.println("Time taken by StringBuffer: " + stringBufferDuration + " nanoseconds");
    }
}
