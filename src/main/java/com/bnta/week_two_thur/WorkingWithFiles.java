package com.bnta.week_two_thur;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WorkingWithFiles {
    public static void main(String[] args) throws IOException{ //why throws IOException...
        File fileExample = new File("src/files.txt"); //creating file variable with class File
        if(!fileExample.exists()){ // if file doesn't exist
            try {
                fileExample.createNewFile(); //create new file under path under file1 variable
            } catch (IOException e) {
                System.out.println("File does not exist");
            }
        }
        FileWriter fileWriter = new FileWriter(fileExample, true); //creating file writer using FileWriter class. to append type true!
        PrintWriter printWriter = new PrintWriter(fileWriter); //creating print writer using FileWriter class
        printWriter.println("This is a file created using java.");  //printing string into file
        printWriter.println("I can write lines and append them using the printWriter tool.");  //printing string into file

        printWriter.flush();
        printWriter.close();
        System.out.println("Contents added successfully to file.");

        Scanner scanner = new Scanner(fileExample); //create new scanner
        while (scanner.hasNext()){ //while file being scanned has a next line, scanner continues to scan
            System.out.println(scanner.nextLine()); //scanner reads each line from file (called fileExample) and prints in console
        }
    } }

