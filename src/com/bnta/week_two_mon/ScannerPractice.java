package com.bnta.week_two_mon;
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Translate");

            String input = scanner.nextLine();

            if (input.equals("Ola")) {
                System.out.println("Hello");
            } else if (input.equals("Hola")) {
                System.out.println("Hello"); }
            else if (input.equals("Adios")) {
                System.out.println("Goodbye"); }
            else if (input.equals("Au Reviour")) {
                System.out.println("Goodbye");
            } else {
                System.out.println("Language not supported");
            }
        }
    }

