package org.launchcode;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class MenuItem {

    //Declare fields
    private String name;
    private String description;
    private String category;
    private LocalDate updateDate;
    private boolean newItem;


    //Create Constructor

    public MenuItem(String name, String description, String category, boolean newItem) {
        this.name = name;
        this.description = description;
        this.category = category;
        //this.newItem = newItem;
        this.updateDate = LocalDate.now();
        if (this.updateDate.equals(LocalDate.now())){
            this.newItem = true;
        }
    }

    //Overload option
    public MenuItem(String name, String description, String category) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.newItem = true;
        this.updateDate = getUpdateDate();
    }


    //Create getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
}
