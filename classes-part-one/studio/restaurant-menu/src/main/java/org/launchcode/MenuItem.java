package org.launchcode;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class MenuItem {

    //Declare fields
    private String name;
    private String description;
    private String category;
    private double price;
    private LocalDate updateDate;
    private boolean newItem;


    //Create Constructor

    public MenuItem(String name, String description, String category, double price, boolean newItem, LocalDate updateDate) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.updateDate = updateDate;
        if (this.updateDate.equals(LocalDate.now())){
            this.newItem = true;
        }
    }

    //Overload option
    public MenuItem(String name, String description, String category, double price) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.newItem = true;
        this.updateDate = getUpdateDate();
    }


    //MenuItem Methods (getters and setters)


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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public String printMenuItem(){
        return (this.name + ": " + this.description + "---" + this.price);
    }
}
