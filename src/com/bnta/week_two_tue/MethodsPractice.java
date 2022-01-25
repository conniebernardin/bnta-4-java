package com.bnta.week_two_tue;

import java.util.Locale;

public class MethodsPractice {
    public static void main(String[] args) {
        System.out.println(capitalise("hello"));
        System.out.println(numLength("hello"));
        display("hello");
    }
    static public String capitalise (String input){
        return input.toUpperCase(Locale.ROOT);
    }
    static public int numLength (String input){
        return input.length();
    }
    static public void display (String input){
        System.out.println(input.toUpperCase(Locale.ROOT));
        System.out.println(input.length());
    }
}
