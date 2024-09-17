package org.launchcode;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// create menuItems
        LocalDate oldDate = LocalDate.of(2024, 05, 01);

    MenuItem cheesburger = new MenuItem("cheeseburger", "This is a tasty burger", "Main Course", 3.50, false, oldDate);
    MenuItem fries = new MenuItem("Fries", "The best fries", "appetizer", 1.99, false, oldDate);
    MenuItem iceCream = new MenuItem("Ice Cream", "So so cold", "Dessert", 3.99, false, oldDate);

    //Make menu
    Menu menu1 = new Menu();

    //Add Items to Menu arrayList
    menu1.addMenuItem(cheesburger);
    menu1.addMenuItem(fries);
    menu1.addMenuItem(iceCream);


        System.out.println(cheesburger.getDescription());
        menu1.displayMenu();

    }
}