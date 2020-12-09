package com.java;

import com.java.modifiers.AccessModifiers;

public class HelloWord {

    public static void main(String arg[]) {
        System.out.println("Hello World");

        AccessModifiers mod = new AccessModifiers();
        //Available properties from object
        System.out.println(mod.publicName);

        //Basic Datatypes
        int decimal = 100;
        String name = "Minhaz";


    }

    class MyClass {
        int x;

        // Following is the constructor
        MyClass(int i ) {
            x = i;
        }
    }

}

