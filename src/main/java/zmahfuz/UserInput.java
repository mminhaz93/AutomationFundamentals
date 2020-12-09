package com.java.zmahfuz;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        int myAge;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");

        myAge = input.nextInt();

        if (myAge >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("Unfortunately, you are a kid.");


        }
    }
}
