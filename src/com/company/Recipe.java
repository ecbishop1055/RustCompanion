package com.company;

import java.util.*;

public class Recipe {
    String Title = "";
    HashMap<String, Integer> itemsHash = new HashMap<String, Integer>();

    public void createRecipe(String title, HashMap<String, Integer> items){
        Title = title;
        itemsHash = items;

    }

}
