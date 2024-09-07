package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WordLengthFinder {

    // Static method to print words with a specific length
    public static void printWordsWithLength(ArrayList<String> words, int length) {
        System.out.println("Words with " + length + " letters:");
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        // Create an ArrayList with some words
        ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "grape", "peach", "lemon", "mango", "kiwi", "melon", "plum", "berry"));

        // Prompt the user to enter the word length
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        // Call the printWordsWithLength method
        printWordsWithLength(words, numChars);
    }
}
