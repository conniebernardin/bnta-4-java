package com.bnta.week_two_mon;

public class Exercise1 {
    public static void main(String[] args) { //method one
            /*
      Write a method that reverses any String and print to console
      Input should be a string
      Output should be reversed input
    */
//       String output = reverse("Connie Bernardin");
//        System.out.println(output);
        System.out.println(reverse("Bruno")); //replace lines 10 and 11
    }
    static String reverse(String input) { //method two with name reverse
        String output = ""; //line used to create empty variable for output
        for(int i=input.length()-1; i>= 0; i--) {
            output += input.charAt(i); // every loop adds index value in stated order
        }
        return output;
    }
}
