package com.bnta.week_two_thur;
/*Write a method which takes two numbers as arguments and prints their sum to the terminal.*/
public class MethodsExercise1 {
    public static void main(String[] args) {
        sumOfNumbers(1,3);
    }

    //write new method
    public static void sumOfNumbers(int numberOne, int numberTwo){
        int onePlusTwo = numberOne + numberTwo;
        System.out.println("Sum of Numbers = " + onePlusTwo);
    }
}
