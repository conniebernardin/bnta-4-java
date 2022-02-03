package com.bnta.week_two_thur;
/*Write a method which takes two numbers as arguments, checks if they are the same and returns the appropriate boolean value.

You should check both possible outcomes here, i.e. that it returns true when it is supposed to and false when it is supposed to.
*/
public class MethodsExercise3 {
    public static void main(String[] args) {
       boolean result = checkForSameNumber(-4, 4);
        System.out.println(result);
    }
    public static boolean checkForSameNumber(int numberOne, int numberTwo) {
        boolean check;
        if (numberOne == numberTwo){
        check = true; }
        else {
            check = false;
        }
        return check;
    }
}
