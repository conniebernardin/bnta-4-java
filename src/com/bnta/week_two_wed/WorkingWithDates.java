package com.bnta.week_two_wed;

import java.time.LocalDate;

public class WorkingWithDates {
    public static void main(String[] args) {
        compareBirthdays();
//        predictDueDate();
    }

    private static void compareBirthdays() {
        LocalDate connieBDay = LocalDate.of(1999, 12, 14); //create date under variable connieBDay using .of function
        LocalDate aidanBDay = LocalDate.of(2000, 9, 02);

        System.out.println("Is Connie younger than Aidan?");
        System.out.println(connieBDay.isAfter(aidanBDay) + "! Connie is older :)"); //compare date variables using .isAfter function
    }

//    public static void predictDueDate() {
//        LocalDate conception = LocalDate.of(2022, 1, 26);
//        LocalDate dueDate = conception.plusMonths(9);
//
//        System.out.println("When is due date?");
//        System.out.println(dueDate);
//
////        System.out.println("How many days until due date?");
////        System.out.println(conception.until(dueDate));
   // }
}
