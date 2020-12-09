package com.java;

public class Operators {

    public static void main(String args []){
        /*
                + (Addition)	Adds values on either side of the operator.	A + B will give 30
                - (Subtraction)	Subtracts right-hand operand from left-hand operand.	A - B will give -10
                * (Multiplication)	Multiplies values on either side of the operator.	A * B will give 200
                / (Division)	Divides left-hand operand by right-hand operand.	B / A will give 2
                % (Modulus)	Divides left-hand operand by right-hand operand and returns remainder.	B % A will give 0
                ++ (Increment)	Increases the value of operand by 1.	B++ gives 21
                -- (Decrement)
        */

        // + - * / %

        int x = 21;
        int y = 5;

        // The Arithmetic Operators
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        //Increase or decrease by 1
        System.out.println(x++);
        System.out.println(x--);

        //The Relational Operators - Returns true or false
        System.out.println(x == y); // false
        System.out.println(x != y); //true
        System.out.println(x < y); // false
        System.out.println(x > y); // true
        System.out.println(x <= y); // false
        System.out.println(x >= y); // true


        //The Logical Operators

        /*
        && (logical and)	Called Logical AND operator. If both the operands are non-zero, then the condition becomes true.	(A && B) is false
        || (logical or)	Called Logical OR Operator. If any of the two operands are non-zero, then the condition becomes true.	(A || B) is true
        ! (logical not)	Called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will make false.	!(A && B) is true

        int x = 21;
        int y = 5;
         */
        // For && both conditions has to be true
        System.out.println( x > 0 &&  x < 21);  // false b/c x is not less than 21
        System.out.println( x > 0 &&  x <= 21); // true

        // || will return true if any of the conditions is true
        System.out.println( y > 0 ||  x < 5); // true
        System.out.println( y > 6 ||  x < 5); // false

        // ! inverts the result
        System.out.println( !(y > 6 ||  x < 5)); // true

        System.out.println( 1 != 1); // false b/c 1 is equal to 1
        System.out.println( x != 21); // false

        System.out.println( x != 20); // true
    }
}
