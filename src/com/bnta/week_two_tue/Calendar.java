package com.bnta.week_two_tue;
import java.util.Scanner;

    public class Calendar {
        public static void main(String[] args) {

            boolean showMore = true; //boolean variable introduced to check if while loop should be executed

            while (showMore) { //while loop repeats operations as long as showMore is true
                Scanner scanner = new Scanner(System.in); //creating scanner for user input

                printMenu(); //invoking method called print Menu

                int option = scanner.nextInt(); //create integer variable for user input

                if (option == 1) {
                    programOne(scanner); //invokes method one if user input from scanner is equal to one
                } else if (option == 2) {
                    programTwo(scanner);
                } else if (option == -1) { //exits loop is user input from scanner is -1 by declaring boolean showMore as false
                    System.out.println("Thank you for participating!");
                    showMore = false;
                } else { //default if user input does not match options given
                    System.out.println("Unknown option");
                }
            }

        }

        private static void printMenu() { //method prints instructions and options for user
            System.out.println("Choose program");
            System.out.println("- Option 1 - Add numbers");
            System.out.println("- Option 2 - Convert int to month");
            System.out.println("- Option -1 - To Exit program");
        }

        private static void programTwo(Scanner scanner) { //method for user to input number and get month in return
            System.out.println("Enter month to convert: Range = 1...12");
            int month = scanner.nextInt();
            System.out.println(convertNumberToMonth(month)); //invokes method for converting number to month name with int month as argument
        }

        private static void programOne(Scanner scanner) {
            printQuestionOne(); //invokes method to print question one
            int number1 = scanner.nextInt(); //creates integer variable for value given by user input
            printQuestionTwo(); //invokes method to print question two
            int number2 = scanner.nextInt();
            int result = add(number1, number2); // creates variable result for add method invoked
            printAnswer(number1, number2, result); // invokes method to print answer, giving arguments/variables defined
        }

        public static int add(int num1, int num2) {
            int result = num1 + num2;
            return result;
        }

        public static void printQuestionOne() {
            System.out.println("Enter first number: ");
        }

        public static void printQuestionTwo() {
            System.out.println("Enter second number: ");
        }

        public static void printAnswer(int n1, int n2, int result) { //method to print answer
            System.out.println("------Addition-------");
            System.out.println(n1 + " + " + n2 + " = " + result);
            System.out.println("have a good day");
        }

        public static String convertNumberToMonth(int month) {
            switch (month) {
                case 1:
                    return "JANUARY";
                case 2:
                    return "FEB";
                case 3:
                    return "MARCH";
                case 4:
                    return "APRIL";
                case 5:
                    return "MAY";
                case 6:
                    return "JUNE";
                case 7:
                    return "JULY";
                case 8:
                    return "AUGUST";
                case 9:
                    return "SEPTEMBER";
                case 10:
                    return "OCTOBER";
                case 11:
                    return "NOVEMBER";
                case 12:
                    return "DECEMBER";

                default:
                    return month + " NOT VALID MONTH";
            }
        }
    }

