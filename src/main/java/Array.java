package com.java;

public class Array {
    public static void main(String[] args) {

        //Syntax
        //VariableType[] arrayName = {val1, val2, val3.. }
        //Single array

        int[] numberInt = {1, 2, 3};
        double[] numbersDouble = {1, 2.2, 3, 4};
        //                        0   1   2  3

        System.out.println(numbersDouble[0]); //print 1

        String[] colors = {"Red", "Blue", "Black", "Green", "Gray"};

        //Print one index value at a time
//        System.out.println(colors[2]);

        //Print all values.

        // Print 1 to 10
        String name = "MZ";
        name.length();

        System.out.println("Printing all colors using for loop");

        //Using for loop
        // Length 5
        // max i 4
        // colors.length - 1 => 5 - 1 = 4
        //{"Red", "Blue", "Black", "Green", "Gray"};

        for(int i = 0; i <= colors.length - 1; i++) {
            System.out.println(colors[i]);
        }

        System.out.println("Printing all colors using for-each loop");
        //Using for-each loop
        for(String color : colors){
            System.out.println(color);
        }

        //{"Red", "Blue", "Black", "Green"};
        // 0       1        2         3


        //Print every other color
        for(int i = 1; i < colors.length; i = i + 2) {
            System.out.println(colors[i]);
        }



/*        for(int i = 0; i <= 10; i = i + 2) {
            //0 1 2 3 4 5 6 7 8 9 10
            System.out.println(i);
        }*/

/*        for(int i = 10; i > 0; i--) {
                    //0 1 2 3 4 5 6 7 8 9 10
                System.out.println(i);
        }
        */

        //{"Red", "Blue", "Black", "Green", "Grey"};
        // 0       1        2         3       4
        //Length 5

        System.out.println("Print color in reverse order");
        System.out.println("color array length " + colors.length);
        //Print colors in reverse order
        for(int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        System.out.println("2D ARRAY");
        // 2-D array
        int [][] twoDArray =
                {
                {1, 2, 3}, // i = 0 => {1, 2, 3} => { j0, j1, j2}
                {4, 5, 6}, // i = 1
                {7, 8, 9}  // i = 2
                };

        // Print 5
        System.out.println(twoDArray[1][1]); // 5

        //Print 9
        System.out.println(twoDArray[2][2]);



        double [][][] threeDArray =
                {
                        {{1.1, 2.1, 3.1}, {1.2,2.2, 3.2}}, // i = 0 // {1.1, 2.1, 3.1} =>  j = 0 => 1.1 => k=0
                        {{4.1, 5.1, 6.1}, {4.2,5.2, 6.2}}, // i = 1
                        {{7.1, 8.1, 9.1}, {7.2,8.2, 9.2}}  // i = 2
                };

        System.out.println("3D array " + threeDArray[1][1][2]);

        //int num = { 1, 2, 3 };
        //index      0  1  2
        //        { {...}, {..}, {..} }
        // index i {   0     1     2   }
        // {...} =>

        //Printing all 2D array
        int [][] myNumbers =
                {
                        {1, 2, 3, 4}, // i = 0 => {1, 2, 3} => { j0, j1, j2}
                        {4, 5, 6}, // i = 1
                        {7, 8, 9, 5, 5}  // i = 2
                };

//        for (int i = 0; i < myNumbers.length; ++i) {
//            for(int j = 0; j < myNumbers[i].length; ++j) {
//                System.out.println(myNumbers[i][j]);
//            }
//        }



        for (int i = 0; i < myNumbers.length; i++) {
            // [ #, #, # ]
            System.out.print("["); // Prints [
            for(int j = 0; j < myNumbers[i].length; j++) {
                if(j !=  (myNumbers[i].length - 1) ){
                    System.out.print(myNumbers[i][j] + ",");
                }else{
                    System.out.print(myNumbers[i][j]);
                }
            }
            System.out.print("]");  // Prints ]
            System.out.println(""); // Puts empty line to move next row in a new line
        }

        //Want 5 rows
        for (int i = 0; i < 3; i++) {
            // i=0 j=0 *
            // i=1 j=1 **
            // i=2 j=2 ***

            // i = 1 -> j = 0 + *
            // i = 1 -> 1 = 1 + *
            for(int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        System.out.println("[" + myNumbers[0][0] +", " + myNumbers[0][1] +", " + myNumbers[0][2] + "]");
//        System.out.println("[" + myNumbers[1][0] +", " + myNumbers[1][1] +", " + myNumbers[1][2] + "]");
//        System.out.println("[" + myNumbers[2][0] +", " + myNumbers[2][1] +", " + myNumbers[2][2] + "]");

    }
}
