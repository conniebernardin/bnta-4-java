package com.bnta.oop;

public class PersonExample {
    private String name; //private properties only accessible through getters
    private int age;
    private SkinColour skinColour;

    //constructors
    public PersonExample(){}

    public PersonExample(String name,
                         int age,
                         SkinColour skinColour){
        this.name = name;
        this.age = age;
        this.skinColour = skinColour;
    }
    //setter for name
    public void setName(String name){
        this.name = name; //"this" refers to current instance when it is called. If name isn't defined then it appears as name by default.
    }
    //getter for name
    public String getName() {
        return name;
    }

    //setter for age
    public void setAge (int age){
        if (age > 99){
            throw new IllegalArgumentException("Age cannot be over 99");
        }
        this.age = age;
    }
    //getter for age
    public int getAge() {
        return age;
    }

    //setter for SkinColour
    public void setSkinColour (SkinColour skinColour){
        this.skinColour = skinColour;
    }
    //getter for skincolour
    public SkinColour getSkinColour() {
        return skinColour;
    }

    @Override
    public String toString() { //allows you to print object properties using system.out.ptintln(objectName);
        return this.name + " " + this.age + " " + this.skinColour; //rewriting toString method to change behaviour from the parent
    }
}
