package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask User for sentence
        System.out.println("Enter a sentence: ");
        String myString = input.nextLine();

        //Remove case sensitivity
        myString = myString.toUpperCase();
        input.close();

        //Make empty hashmap
        HashMap<Character, Integer> characterCount = new HashMap<>();

        //Make Array of Characters
        char[] charactersInString = myString.toCharArray();

        for (char value : charactersInString) {


            if (characterCount.containsKey(value)) {
                characterCount.put(value, characterCount.get(value) + 1);
            }
            else if (Character.isLetter(value)) {
                characterCount.put(value, 1);
            }
        }

        System.out.println("Here is your hash map: " + characterCount);
    }
}