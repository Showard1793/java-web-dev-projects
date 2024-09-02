package org.launchcode;
import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        System.out.println("What phrase would you like to search? ");
        String searchedPhrase = input.next();

        System.out.println(str.contains(searchedPhrase));

        if (str.contains(searchedPhrase)) {
            System.out.println("The index of that phrase is " + str.indexOf(searchedPhrase)); //finds index of searchedPhrase
            System.out.println("The length of that string is " + searchedPhrase.length() + " characters long."); //finds length of searchedPhrase

            String newString = str.replace(searchedPhrase, ""); //"creates newString by removing the searchedPrase from str
            System.out.println(newString); //prints the new string
        }
    }
}
