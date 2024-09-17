package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private LocalDate menuLastUpdate;

    private ArrayList<MenuItem> menu = new ArrayList<>();

//Menu Methods

    //give menu last updated message
    public String menuLastUpdatedMessage() {
        if (menuLastUpdate == null) {
            return "The menu has not been updated yet.";
        }
        return "This menu was last updated: " + menuLastUpdate;
    }

    //Add menuItem to menu
    public void addMenuItem(MenuItem item) {
        menu.add(item);
        menuLastUpdate = LocalDate.now();
    }

    //display the full menu
    public void displayMenu() {
        for (MenuItem menuItem : menu) {
            System.out.println(menuItem.printMenuItem());
        }

    }
}





