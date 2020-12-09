package com.java;

public class Loop {

    public static void main(String arg[]) {
        //Simplest  infinite loop
//        for ( ; ; ) {
//
//        }

        // For loop
        for(int i = 11; i<= 10; i++){
            System.out.println("Print " + i);
        }

        //Nested loop
        // 2 X 1 = 2
        // 2x 2 = 4

        //Enhanced for loop
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            System.out.println( x );
        }

        //While loop
        int i = 11;
        while(i <= 10) {
            System.out.println("Print " + i);
            i++;
        }

        //DoWhile loop
        int j = 11;
        do {
            System.out.println("Print " + j);
            j++;
        } while(j <= 10);

    }
}
