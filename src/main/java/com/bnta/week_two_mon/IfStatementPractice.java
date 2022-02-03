package com.bnta.week_two_mon;

import java.util.Locale;

public class IfStatementPractice {
    public static void main(String[] args) {
        String hello = "Hello";
        if (hello.equals("Ola")) {
            System.out.println("Portuguese");

        } else if (hello.equals("Hello")) {
            System.out.println("English");

        } else if (hello.equals("Ciao")) {
            System.out.println("Italian");

        } else {
            System.out.println("Oops I don't know the language");
        }

        // Using Switch statement for simplifying long if else statements
        System.out.println("What language is this?");
        switch (hello.trim().toLowerCase().toUpperCase(Locale.ROOT)) {
            case "ola":
                System.out.println("Portuguese");
                break;
            case "ciao":
                System.out.println("Italian");
                break;
            case "Bonjour":
                System.out.println("French");
                break;
            default:
                System.out.println("Opps I don't know");
        }
    }
}

