package com.bnta.week_two_mon;

import javax.crypto.spec.PSource;
import java.util.Scanner;
/*
     Write a program that takes an input number from the console and prints if number is prime
     Create a method to check if number is prime then use against the input
   */
public class Exercise4 {
    public static void main(String[] args) {

        System.out.println("Prime number scanner");
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(); //takes input number from console
        checkForPrime(num1);
    }
    static int checkForPrime(int num1) { //new method to check whether user input number is prime
        boolean isPrime = true;
        for (int i = 2; i <num1; i++){ //starts from 2 as number has to be positive and not 1; increments
            if (num1 % i == 0) { //if number is exactly divisible by i then it cannot be prime
                System.out.println(num1 + " is not a prime!");
                isPrime = false;
               break;
            }
            if (isPrime){
                printIsPrime(num1);
            }
            else
                System.out.println("I'm confused");
            break;
        }
        return num1;
    }
    public static void printIsPrime(int num1){
        System.out.println(num1 + " is a prime!");
    }

}
