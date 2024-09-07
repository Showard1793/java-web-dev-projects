package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of your circle: ");
        double radius = input.nextDouble();

        System.out.println("The area of your circle is: " + (radius * radius * Math.PI));
    }
}
