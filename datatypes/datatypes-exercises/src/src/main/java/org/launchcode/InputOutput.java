package org.launchcode;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What is your name? ");

        String name = input.next();
        System.out.println("Hello, " + name + "!");
    }
}
