package com.bnta.week_two_wed;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class DateScanner {
    public static void main(String[] args) {
        System.out.println("How can I help?");
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();

        if (question.equals("What is the time?")){
            askForTime();
        }
        else if (question.equals("What is the date?")){
            askForDate();
        }
        else if (question.equals("What is the year?")){
            askForYear();
        }
        else
            System.out.println("Sorry I don't know");
    }

    private static void askForYear() {
        LocalDateTime year = LocalDateTime.now();
        System.out.println(year.getYear());
    }

    private static void askForDate() {
        LocalDate date = LocalDate.now();
        System.out.println(date);
    }

    private static void askForTime() {
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}
