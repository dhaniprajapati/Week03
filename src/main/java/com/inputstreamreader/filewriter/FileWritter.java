package com.inputstreamreader.filewriter;

import java.io.*;

public class FileWritter {
    //method to write the file taking user input
    public static void writeFile(String outputFile) {
        //try and catch block
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter fr = new FileWriter(outputFile);
             BufferedWriter bw = new BufferedWriter(fr)) {
            String line;
            System.out.println("Enter text (type 'exit' to finish):");
            //loop throught each input line to read it until the user inputs exit
            while (!(line = br.readLine()).equals("exit")) {
                //to write the line
                bw.write(line);
                //switch to new line
                bw.newLine();
            }
        //IO exception if there is error
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        //input file path to write the text
        String outputFile = "C:\\Users\\praja\\OneDrive\\Desktop\\DSA\\Day04\\src\\main\\java\\com\\inputstreamreader\\filewriter\\outputFile";
        writeFile(outputFile);
    }
}
