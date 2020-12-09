package com.java.oops.oopsInheritance;

public class ChildObject {

	public static void main(String[] args) {

		Parent parentInfo = new Parent();// Creating an object of Parent class and this gives us all the properties(Fields, methods) for us to use

		System.out.println("My last name from my parent is using object" + parentInfo.lastName);

		parentInfo.printDadName();

//		// Using object
//		Parent myParent = new Parent();
//
//
//		System.out.println("My last name is " + myParent.lastName);
//		System.out.println("My dads age is " + myParent.dadAge);

	}

}
