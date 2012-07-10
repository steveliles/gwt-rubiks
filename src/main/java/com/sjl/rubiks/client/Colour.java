package com.sjl.rubiks.client;

public class Colour {

    public static Colour BLACK = new Colour("#000");
    public static Colour WHITE = new Colour("#fff");
    public static Colour RED = new Colour("#f00");
    public static Colour GREEN = new Colour("#0f0");
    public static Colour BLUE = new Colour("#00f");
    public static Colour ORANGE = new Colour("#f80");
    public static Colour YELLOW = new Colour("#ff0");
    
    private String colour;
    
    public Colour(String aColourString) {
        colour = aColourString;
    }
    
    public String asHtmlColour() {
        return colour;
    }
    
}
