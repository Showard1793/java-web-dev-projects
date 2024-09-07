package org.launchcode;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAdder {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        // Use an ArrayList instead of an array
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 7, 10, 8));

        // Call the sumEven method and print the result
        int sum = sumEven(arr);
        System.out.println("Sum of even numbers: " + sum);
    }

}
