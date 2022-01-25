package com.bnta.week_two_tue;

import java.util.Scanner;

public class ScannerAddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printQuestionOne();
        int number1 = scanner.nextInt();
        printQuestionTwo();
        int number2 = scanner.nextInt();
        int result = add(number1, number2);
        printAnswer(number1, number2, result);
    }

    public static int add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
    public static void printQuestionOne() {
        System.out.println("Enter first number: ");
    }
    public static void printQuestionTwo() {
        System.out.println("Enter second number: ");
    }
    public static void printAnswer(int n1, int n2, int result) {
        System.out.println("------Addition-------");
        System.out.println(n1 + " + " + n2 + " = " + result);
        System.out.println("have a good day");
    }
}
