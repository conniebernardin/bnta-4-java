package com.bnta.week_two_mon;

public class Exercise2 {
    /*
     Given the following String input
     String input = "   b ri   ght net   work  "
     Write a program that transforms input into: Bright Network
   */
    public static void main(String[] args) {
        String sentence = "bright network";
        String tmp = "";

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            tmp += words[i].substring(0, 1).toUpperCase();
            tmp += words[i].substring(1).toLowerCase();
            tmp += " ";
        }

        System.out.println(tmp.trim());

    }
    }
