package com.bnta.oop;

public class main {
    public static void main(String[] args) {
        PersonExample Connie = new PersonExample(); //creating new object (connie) using class Person
        Connie.setName("Connie");
        Connie.setAge(22);
        Connie.setSkinColour(SkinColour.WHITE);

        PersonExample Nikki = new PersonExample("Nikki", 52, SkinColour.WHITE); //creating new person using constructors

        System.out.println("-------------------");
        System.out.println(Connie.getName()); //retrieving property values for person/object using .getName by printing individually
        System.out.println(Connie.getAge());
        System.out.println(Connie.getSkinColour());


    }
}
