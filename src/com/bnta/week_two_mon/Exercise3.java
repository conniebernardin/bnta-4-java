package com.bnta.week_two_mon;

/*
  Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
  You might compile and run the program via command line or by editing configuration and pass program arguments
*/
public class Exercise3 {
    public static void main(String[] args) {
    int [] numbers = {4, 5, 6, 7, 8}; //stating integer arrays
    oddOrEven(numbers); //invoking method argument and passing int array numbers
    }

    static void oddOrEven(int[] input) { //new method with integer arrays as parameters to check if number is odd or even
        for (int i =0; i <input.length; i++){ //looping through array

            if (i % 2 == 0){ //checking if statement for each loop through array (each number)
                System.out.println("Even");
            } else{ //if number is not divisible by 2 with no remainder than it prints as odd.
                System.out.println("Odd");
            }

        }
    }
}
