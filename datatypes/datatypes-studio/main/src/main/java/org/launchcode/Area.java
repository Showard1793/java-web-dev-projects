package org.launchcode;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        Double radius = null;
        boolean validInput = false;

        // Use a loop to keep prompting the user for a valid radius
        while (!validInput) {
            System.out.print("Enter the radius of the circle: ");
            String userInput = input.nextLine();  // Read input as string

            // Validate input: Check if it's a valid number and non-negative
            try {
                radius = Double.parseDouble(userInput);  // Try to convert to Double

                if (radius < 0) {
                    System.out.println("Error: Radius cannot be negative. Please enter a positive value.");
                } else {
                    validInput = true;  // Input is valid, exit the loop
                }
            } catch (NumberFormatException e) {
                // Handle non-numeric input
                System.out.println("Error: Please enter a valid number.");
            }
        }

        // Call the Circle.getArea() method to calculate the area
        Double area = Circle.getArea(radius);

        // Print the calculated area
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}