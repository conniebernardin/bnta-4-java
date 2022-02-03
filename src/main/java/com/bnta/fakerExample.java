package com.bnta;

import com.github.javafaker.Faker;


public class fakerExample {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.address().fullAddress());
        System.out.println(faker.name().fullName());
    }
}
