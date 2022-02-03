package com.bnta.week_two_wed;
import java.util.Arrays;

public class LoopsExercises {
    public static void main(String[] args) {
        simpleLoop();
        reverseSimpleLoop();
        evenNumbers1();
        evenNumbers2();
        int[] numbers = getArray();
        printgetArray(numbers);
        converttoInteger(numbers);

        /*Using your answer from the question two above, use a for loop to add each number to a sum value. Print the sum value.*/
    }
    private static void simpleLoop() {/* Within your Main class, create some functionality which uses a for loop to print the numbers from 0 to 10.*/
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private static void reverseSimpleLoop() { /*Within your Main class, create some functionality which uses a for loop to print the numbers from 10 to 0 (inclusive).*/
        System.out.println("now backwards");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    private static void evenNumbers1() {
        /*Within your Main class, create some functionality which uses a for loop to print the even numbers from 0 to 20 (inclusive).*/
        System.out.println("Even numbers only!");
        for (int i = 0; i <= 20; i += 2) { //using the += function to only print every 2nd index
            System.out.println(i);
        }
    }

    private static void evenNumbers2() {
        System.out.println("Even numbers using if else statements!"); //with extra task to make it exclude 0
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static int[] getArray() { /*Within your Main class, create some functionality which uses a for loop which adds all numbers from 0 to 10 (inclusive) to an array. Print this array in the console.*/
        System.out.println("--------------------");
        System.out.println("Lets make an array!");

        int [] numbers = new int[11]; //creating new array of integers with index 11, called numbers
        for(int i=0; i<=10; i++){
            numbers[i]=i;
    }
        return numbers;
    }

    private static void printgetArray(int[] numbers) {
        String output = Arrays.toString(numbers); //convert output of loop into a string array using array.tosrting function and creating new variable called output
        System.out.println(output);
    }

    private static void converttoInteger(int[] numbers) { /*Using your answer to the previous question, use a second for loop which prints each item in your array to the terminal individually.*/
        System.out.println("----------------------------------");
        System.out.println("Now print array items individually");
        for (int i = 0; i <= 10; i++) {
            numbers[i] = i; //states that the value of integer in array at point i is equal to the index number of point i.
        }
        for (int item : numbers) { //enhanced loop stating that for each item in the array "numbers", index value is assigned and labelled as integer item
            System.out.println(item); //print integers from loop
        }
    }
}