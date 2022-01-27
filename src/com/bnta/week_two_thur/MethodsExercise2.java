package com.bnta.week_two_thur;
/*Write a method which takes a number as an argument and returns that number negated, e.g. passing 5 as an argument should return -5; passing -10 should return 10.*/
public class MethodsExercise2 {
    public static void main(String[] args) {
        negateNumber(-30); //invoke method
    }
    //write new method here
    public static void negateNumber(int input){
        int output = input * -1; //multiply input by -1 to negate
        System.out.println(output); //print output
    }
}

