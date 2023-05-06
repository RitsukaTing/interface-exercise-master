package edu.nyu.cs;

import java.util.ArrayList;
import java.util.Arrays;

public class Character extends OrderedThing{
    private int position;
    private String value;

    //primary constructor for taking in string and int input    
    public Character(String charac, int position) {
        this. position = position;
        this.value = charac;
    }

    //alternative constructor for just string input
    public Character(String charac) {
        this(charac, 0);
    }

    //overloaded toString() method that returns a single String character 
    public String toString() {
        StringBuilder newString = new StringBuilder();
        newString.append(this.value);

        return newString.toString();
    }
}
