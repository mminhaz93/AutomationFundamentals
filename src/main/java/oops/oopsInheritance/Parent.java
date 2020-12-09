package com.java.oops.oopsInheritance;

public class Parent extends GrandParent{

	static String lastName = "Chowdhury";
	static int dadAge = 50;
	static int momAge = 40;

	public static void printDadName() {
		String dadName = "Md Chowdhury";
		System.out.println("My dad's name is " + dadName);
	}


	public static void main(String[] args) {
		System.out.println("This is the parents class");

		System.out.println("My firstName from my parents (childs grand parent) is " + firstName);
	}
}
