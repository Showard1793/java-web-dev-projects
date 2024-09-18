package org.launchcode;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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


    //Getters and Setters
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

//INSTANCE METHODS
    //Is the Item New?
    public boolean isNew(){
        LocalDate today = LocalDate.now();
        double daysBetween = getUpdateDate().until(today, ChronoUnit.DAYS);
        return daysBetween < 90;
    }

    //Format the menu
    public String printMenuItem(){
        return (this.name + ": " + this.description + "---" + this.price);
    }
}
