package com.timboat.coolapp;

/**
 * Created by Timmy on 2018-03-03.
 */

public class Item {

    private String name;
    private int type; // 0 -> clothes, 1-> tech 2-> Grocery

    public Item(String name, int type, int price)
    {
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return name;
    }
    public int getType(){
        return type;
    }

}
