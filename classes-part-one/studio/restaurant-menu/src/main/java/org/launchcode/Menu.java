package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private LocalDate menuLastUpdate;

    private ArrayList<MenuItem> menu = new ArrayList<>();

//Menu Methods

    //Add menuItem to menu
    public void addMenuItem(MenuItem item) {
        menu.add(item);
        menuLastUpdate = LocalDate.now();
    }


    public void displayMenu() {
        //for (int i = 0; i < this.menu.size(); i++) {
        for (MenuItem menuItem : menu) {
            System.out.println(menuItem.printMenuItem());
        }
    }
}

//Does Not Work!
public String menuLastUpdatedMessage (MenuItem item){
    return "" + menuLastUpdate;
}



