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
        FileWriter fileWriter = new FileWriter(fileExample); //creating file writer using FileWriter class
        PrintWriter printWriter = new PrintWriter(fileExample); //creating print writer using FileWriter class
        printWriter.print("This is a new file.");  //printing string into file

        printWriter.flush();
        printWriter.close();

        Scanner scanner = new Scanner(fileExample);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }



}
