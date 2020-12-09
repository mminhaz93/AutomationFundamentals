package com.java.constructor;

class Student {
    int age; //Variable x
    double y = 1;
    String name;

    String firstName = "Mohammed";

    long number = 21474836478L;

    boolean ate = false;

    char a = 'A';

    int ageOne = 20;
    int ageTwo = 30;

    String myFullName = "Mohammed Minhaz";

    // Defining a constructor
    //int i  is an parameter of the constructor
    Student(int studentAge, String fullName ) {
        age = studentAge; // Set i (parameter) to variable x
        name = fullName;
    }
}