package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isCycleDown = true;
        while (isCycleDown) {
            User user = new User();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name: ");
            try {
                user.setName(scanner.nextLine());
            } catch (IllegalNameLengthException lengthException) {
                lengthException.printStackTrace();
            }
            System.out.println("Enter your age: ");
            try {
                user.setAge(scanner.nextInt());
            } catch (IllegalAgeException exception) {
                exception.printStackTrace();

            }
        }
    }
}