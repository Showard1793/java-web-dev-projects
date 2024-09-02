package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven? ");
        float milesDriven = input.nextFloat();

        System.out.println("How many gallons have you used? ");
        float gallonsUsed = input.nextFloat();

        System.out.println(milesDriven / gallonsUsed);
    }
}
