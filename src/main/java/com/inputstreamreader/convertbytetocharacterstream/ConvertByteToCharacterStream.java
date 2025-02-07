package com.inputstreamreader.convertbytetocharacterstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertByteToCharacterStream {
    //method to read binary file
    public static void readBinaryFile(String filePath, String charsetName) {
        //try and catch method
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, charsetName);) {
            //create a variable to store the value
            int i;
            //loop to read each value
            while ((i = inputStreamReader.read()) != -1) {
                System.out.print(i);
            }
        //exception if there is error in reading the file
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        //input file path to read the text
        String filePath = "C:\\Users\\praja\\OneDrive\\Desktop\\DSA\\Day04\\src\\main\\java\\com\\inputstreamreader\\@miaayule.jpeg";
        //character set
        String charsetName = "UTF-8";
        readBinaryFile(filePath, charsetName);
    }
}

