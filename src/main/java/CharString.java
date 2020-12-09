package com.java;

public class CharString {
    public static void main(String arg[]) {
        // https://www.tutorialspoint.com/java/character_touppercase.htm
        char letter = 'm';
        char letterTwo = 'Z';
        System.out.println("Turn this " + letter + " letter to upper case " + Character.toUpperCase(letter));
        System.out.println("Turn this " + letterTwo + " letter to lowwer case " + Character.toLowerCase(letterTwo));


        //String
        String name = "minhaz";
        System.out.println("My name is " + name);
        System.out.println("====");

        // Convert Char array to string
        char[] company = { 'M', 'Z', 'T', 'e', 'c', 'h' };
        for (char x : company){
            System.out.print(x);
        }
        System.out.println("");

        //Convert char array to string
        String convertedString = new String(company);
        System.out.println( "This is the converted array" + convertedString );

        //String methods
        System.out.println("The length of this " + name + " is " + name.length());

        String firstName = "John ";
        String lastName = "Doe";

        //Concat
        System.out.println("This is without contact method " + firstName + lastName);
        System.out.println("This is with contact method " + firstName.concat(lastName));

        //Returns Boolean

        String subject = "Math";
        String subjectTwo = "Science";
        String subjectThree = "math";
        System.out.println("Is " + subject + " equals to " + subjectTwo + " : " + subject.equals(subjectTwo));
        System.out.println("Is " + subject + " equals to " + subjectThree + " (Without ignoring case) : " + subject.equals(subjectThree));
        System.out.println("Is " + subject + " equals to " + subjectThree + " (ignoring case) : " + subject.equalsIgnoreCase(subjectThree));

        //Substring
        // M a t h
        // 0 1 2 3


        String giantString = "SLKDFJLKDJFLJDSLKFJLSDKJFLKSDJFLKSJDLFKJSDLKFJSDLKFJLSKDJFLKSDJLFSJDLKFJSD";
        //Print from 5th character to end
        //MZTech
        // 2 to 6 - 1
        //Length starts from 1 but index starts with 0
        // 5 , 74 - 1
        System.out.println("The length of this String " + giantString + "is " + giantString.length());
        System.out.println("Print first 3 character of " + giantString + " is " + giantString.substring(5, (giantString.length() - 1)));

        String companysfd = "MzTech";

    }



}
