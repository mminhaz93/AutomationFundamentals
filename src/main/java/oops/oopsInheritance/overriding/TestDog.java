package com.java.oops.oopsInheritance.overriding;

public class TestDog {

    public static void main(String args[]) {

        Animal b = new Dog();   // Animal reference but Dog object
        b.move();   // runs the method in Dog class

        b.color();
    }
}
