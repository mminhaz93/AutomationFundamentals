package com.java.oops.oopsInheritance;

// Inheritance - ChildInheritance class is inheriting Parent class
// extends is a special keyword for inheritance

public class Child  extends Parent{

	public static void main(String[] args) {
		System.out.println("My last name is using inheritance" + lastName);

		printDadName();

		System.out.println("My grandparents first name is " + firstName);
		int myAge = 100;
		System.out.println("My age is " + myAge);


	}
}
