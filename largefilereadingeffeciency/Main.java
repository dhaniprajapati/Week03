package com.runtimeanalysisandbigonotation.largefilereadingeffeciency;

import static com.runtimeanalysisandbigonotation.largefilereadingeffeciency.LargeFileReadingComparision.fileReader;
import static com.runtimeanalysisandbigonotation.largefilereadingeffeciency.LargeFileReadingComparision.inputStreamReader;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\praja\\OneDrive\\Desktop\\Week03\\Day06\\src\\main\\java\\com\\runtimeanalysisandbigonotation\\largefilereadingeffeciency\\Education";
        System.out.println("Reading file:");
        fileReader(filePath);
        inputStreamReader(filePath, "UTF-8");
    }
}

