package edu.nyu.cs;

import java.util.ArrayList;
import java.util.Arrays;

public class Word extends OrderedThing{
    //creates instances for position, a String-based character list, and an OrderedThing-based character list 
    private int position;
    private ArrayList<String> charList;
    private ArrayList<OrderedThing> orderedCharList = new ArrayList<>();


    //constructor converts String input into an ArrayList of Word objects
    public Word(String word, int position) {
        this.position = position;

        String[] chars = word.split("");
        this.charList = new ArrayList<>(Arrays.asList(chars));
        for (int i = 0; i < this.charList.size(); i++) {
            OrderedThing newChar = new Character(this.charList.get(i), 0);
            orderedCharList.add(newChar);
        }
    }

    //alternative constructor for only String inputs
    public Word(String word) {
        this(word, 0);
    }
    
    //returns first character by referencing String ArrayList index
    public OrderedThing getFirst() {
        return this.orderedCharList.get(0);
    }

    //returns last character by referencing String ArrayList index
    public OrderedThing getLast() {
        return this.orderedCharList.get(orderedCharList.size() - 1);
    }

    //returns sequence of OrderedThing objects directly
    public ArrayList<OrderedThing> getSequence() {
        return this.orderedCharList;
    }

    //returns word's position in sentence as a whole
    public int getPosition() {
        return this.position;
    }

    //overloaded toString() that returns a string made from scratch
    public String toString() {
        StringBuilder newString = new StringBuilder();
        for (String i : charList) {
            newString.append(i);
        }

        return newString.toString();
    }
}
