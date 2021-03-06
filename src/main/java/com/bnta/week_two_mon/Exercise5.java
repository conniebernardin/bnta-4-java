package com.bnta.week_two_mon;
import java.util.Scanner;
/*
       Write a method that displays random joke to the user.
       Your program should stop displaying jokes when user inputs no.
       For e.g
       Want to hear a joke? Yes/No
           if yes then display joke and repeat same question
           if no then program should exit
   */
public class Exercise5 {

    public static void main(String[] args) {

        System.out.println("Do you want to hear a joke?");
        Scanner scanner = new Scanner(System.in); //allows user input
        String response = scanner.nextLine(); //takes string from console input

        while (response.equals("yes")) { //continues to ask joke until no more jokes is called
            System.out.println("Why did the one-handed man cross the road?");
            String response2 = scanner.nextLine(); //create new input response for reply
            if(response2.equals("why?")){
                System.out.println("...to get to the second hand shop!!");
            }
            if (response2.equals("no more jokes!")) {
                System.out.println("okay that's enough joking around");
                break;
            }
        }
        if (response.equals("no")) {
            System.out.println("You're no fun!!!"); }
    }

    }
