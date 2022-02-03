package com.bnta.week_two_thur;

import java.util.Locale;

/*Write a method which takes a string as an argument, capitalises the first letter and returns the capitalised string.
     HINT: The .toUpperCase() method will capitalise the whole string. Investigate how to split the first letter from the string,
     capitalise that, then join the pieces back together*/
public class WritingMethods {
    public static void main(String[] args) {
        //call method here and store result as variable
        String result = capitaliseFirstLetter("connie");
        // print variable
        System.out.println(result);
    }

    //method signature - takes string as parameter (Calling it inputString) and returns string
    public static String capitaliseFirstLetter (String inputString) {

        //capitalise first letter of input string
        String capitalisedString = inputString.substring(0, 1).toUpperCase() + inputString.substring(1); //substring divides string into sub division
                                    //begin index 0, end index 1     + joins substrings           being index 1, runs to end of string

        //return modified string
        return capitalisedString;
    }
}


