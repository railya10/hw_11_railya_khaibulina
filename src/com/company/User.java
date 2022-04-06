package com.company;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) throws IllegalNameLengthException {
        this.name = name;
        if (name.length() > 20) {
            throw new IllegalNameLengthException ("Name is too long");

        }
    }

    public void setAge (int age) throws IllegalAgeException {
        this.age = age;
        if (age < 1 || age > 100){
            try {
                throw new IllegalAgeException ("Age range is not correct");
            } catch (IllegalAgeException e) {
                e.printStackTrace();
            }
        }
    }
}