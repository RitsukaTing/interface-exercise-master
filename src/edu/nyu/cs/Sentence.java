package edu.nyu.cs;

import java.util.ArrayList;
import java.util.Arrays;

public class Sentence implements SequentiallyOrdered {
    //creates instances for a String-based word list, and an OrderedThing-based word list 
    private ArrayList<String> wordList;
    private ArrayList<OrderedThing> orderedWordList = new ArrayList<>();

    //constructor converts String input into an ArrayList of Word objects
    public Sentence(String input) {
        String[] words = input.split(" ");
        this.wordList = new ArrayList<>(Arrays.asList(words));

        for (int i = 0; i < this.wordList.size(); i++) {
            OrderedThing newWord = new Word(this.wordList.get(i), 0);
            orderedWordList.add(newWord);
        }

    }

    //returns first word by referencing String ArrayList index
    public OrderedThing getFirst() {
        String firstWord = this.wordList.get(0);;
        OrderedThing first = new Word(firstWord);

        return first;
    }

    //returns last word by referencing String ArrayList index
    public OrderedThing getLast() {
        String lastWord = this.wordList.get(this.wordList.size() - 1);
        OrderedThing last = new Word(lastWord);

        return last;
    }

    //returns sequence of OrderedThing objects directly
    public ArrayList<OrderedThing> getSequence() {
        return this.orderedWordList;
    }

    //overloaded toString() that returns a string made from scratch
    public String toString() {
        StringBuilder newString = new StringBuilder();
        for (String i : wordList) {
            newString.append(i).append(" ");
        }

        return newString.toString();
    }
}
