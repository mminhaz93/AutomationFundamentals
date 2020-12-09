package com.java.constructor;

public class StudentInfo {
    public static void main(String args[]) {
        //Creating an instance of MyClass as object
        //Syntax of creating object is
        // ClassName objectName = new ClassName();
        Student studentOne = new Student( 20, "John Doe");
        Student studentTwo = new Student(21, "Md Hasan" );

        System.out.println("First student name is " + studentOne.name );
        System.out.println("Second student name is " + studentTwo.name);

        //String concatenation
        String firstName = "John";
        String lastName = "Doe";
        int age = 30;

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        //John Doe is 30 years old
        System.out.println(fullName + " is " + age + " Years old");



    }
}



