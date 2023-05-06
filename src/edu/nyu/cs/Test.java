package edu.nyu.cs;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
   
    public static void main(String[] args){
        //creates examples for a sentence from a string and a word object from the sentence
        Sentence sentenceEx = new Sentence("Hello there my name is Ray");
        Word wordEx = new Word(sentenceEx.getSequence().get(3).toString(),3);

        //declares sentence outputs as variables
        OrderedThing firstWord = sentenceEx.getFirst();
        OrderedThing lastWord = sentenceEx.getLast();
        //prints out these outputs as strings
        System.out.println("The first word here is " + firstWord);
        System.out.println("The last word here is " + lastWord);
        //prints through an overloaded .toString() method
        System.out.println("The whole sentence is " + sentenceEx.getSequence().toString() + "\n");

        //declares word outputs as variables
        OrderedThing firstChar = wordEx.getFirst();
        OrderedThing lastChar = wordEx.getLast();
        //prints out these variables as strings
        System.out.println("This word's first character is " + firstChar);
        System.out.println("This word's last character is " + lastChar);
        //prints through an overloaded .toString() method
        System.out.println("This word is at position " + wordEx.getPosition());
        System.out.println("The whole word is " + wordEx.getSequence());
    }
}
