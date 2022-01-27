package com.bnta.week_two_mon;
import java.util.Scanner;
import java.util.Random;

public class jokesScannerSolution {
    /*
        Write a method that displays random joke to the user.
        Your program should stop displaying jokes when use inputs no.
        For e.g
        Want to hear a joke? Yes/No
            if yes then display joke and repeat same question
            if no then program should exit
    */
    public static void main(String[] args) {

        boolean keepAsking = true; //boolean variable to integrate into while loop

        while (keepAsking) {     // allows us to continue asking question as long as user keeps inputting yes
            Scanner scanner = new Scanner(System.in);
            printMenu();
            String input = scanner.nextLine();
            if (input.equals("yes")) {
                jokeGenerator(); //invokes jokeGenerator method if user inputs yes
            } else if (input.equals("no")) {
                System.out.println("Okay no more jokes! See you later :)");
                keepAsking = false;    //exits loop and program if the user inputs no, as the boolean is now false
            } else {
                System.out.println("Input not recognised"); //default if user puts input that doesn't match code
            }
        }
    }

    public static void jokeGenerator() {
        String[] jokes = {  //creates an array of jokes with enhanced array
                "Did you hear about the claustrophobic astronaut?... He just needed a little space",
                "Why do we tell actors to break a leg?... because every play has a cast",
                "How do you drown a hipster?... throw him in the mainstream.",
        };
        Random rand = new Random();   //generates a random number

        int randomNumber = rand.nextInt(jokes.length); //ensures that the random number we generate is within the bounds of the array length and thus equal to the index of the contents in the array (usually we see it as i but in this case, it is "random")

        System.out.println(jokes[randomNumber]); //prints the joke at index random number

    }

    public static void printMenu() {
        System.out.println("Want to hear a joke?...yes or no?");
    }

}
