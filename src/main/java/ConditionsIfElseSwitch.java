package com.java;

public class ConditionsIfElseSwitch {
    public static void main(String arg[]) {

        char letter = 'm';
        char letterTwo = 'Z';
        System.out.println("Turn this " + letter + " letter to upper case " + Character.toUpperCase(letter));
        System.out.println("Turn this " + letterTwo + " letter to lowwer case " + Character.toLowerCase(letterTwo));

  /*    Syntax
        Following is the syntax of an if...else statement −

        if(Boolean_expression 1) {
            // Executes when the Boolean expression 1 is true
        }else if(Boolean_expression 2) {
            // Executes when the Boolean expression 2 is true
        }else if(Boolean_expression 3) {
            // Executes when the Boolean expression 3 is true
        }else {
            // Executes when the none of the above condition is true.
        }
 */

   int adult = 18;
   int age = -10;

   //If you are more or equal to 18 and less than equal to 120 => You are adult
   if(age >= adult && age <= 120){
       System.out.println("You are an adult");
   }
   //If you are less than 0 => wait for your turn
  else if (age < 0){
       System.out.println("Wait for your turn");
   }
   // if you are more than 120 => RIP
   else if(age > 120){
       if(age > 121 && age < 199){
           System.out.println("Enjoy it till it ends");
       }else{
           System.out.println("RIP");
       }
   }
   else{
       System.out.println("You are a kid");
   }


   //Switch statement

/*        The syntax of enhanced for loop is −

        switch(expression) {
            case value :
                // Statements
                break; // optional

            case value :
                // Statements
                break; // optional

            // You can have any number of case statements.
            default : // Optional
                // Statements
        }*/

        char grade = 'A';

        switch(grade) {
            case 'A' :
                System.out.println("Excellent!");
                break; //optional
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);

    }





}
