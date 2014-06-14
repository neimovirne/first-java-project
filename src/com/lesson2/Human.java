package com.lesson2;

public class Human {

    public static final int MIN_AGE = 4; // const
    private static final int MAX_AGE = 120;
    private static final int MIN_NAME_LENGTH = 3;

    private String name;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge (int newAge) {
        if (newAge > Human.MAX_AGE && newAge < Human.MAX_AGE) {
            age = newAge;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if(newName != null && newName.length() > Human.MIN_NAME_LENGTH) {
            name = newName;
        }
    }

    public void sayHello() {
        System.out.println("Hi!");
    }

}
