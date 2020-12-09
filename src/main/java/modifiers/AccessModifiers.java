package com.java.modifiers;

public class AccessModifiers {

    // Visible to the package, the default. No modifiers are needed.
    String name = "John";
    // Visible to the class only (private).
    private String privateName = "Private name";
    //Visible to the world (public).
    public String publicName = "Public name";
    //Visible to the package and all subclasses (protected).
    protected String protectedName = "Protected name";

}
