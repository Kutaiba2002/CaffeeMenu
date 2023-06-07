package com.example.caffeemenu;

public class Pizza {
    private String name;
    private String description;
    private int imageID;
    private int price;

    //Note that the actual value of 'R.drawable.img' is an integer resource identifier, not the image itself.
    public static final Pizza[] pizza = {
            new Pizza("BBQ","A pizza topped with barbecue sauce, cooked chicken pieces, red onions, and a blend of cheeses",R.drawable.bbq,50),
            new Pizza("Margherita","A classic Italian pizza with a thin crust topped with tomato sauce, mozzarella cheese, and fresh basil leaves.",R.drawable.margherita,70),
            new Pizza("Vegetarian","A pizza that focuses on fresh vegetables as toppings, such as bell peppers, mushrooms, onions, olives, tomatoes",R.drawable.vegetarian,34)

    };

    public Pizza(String name, String description, int imageID, int price) {
        this.name = name;
        this.description = description;
        this.imageID = imageID;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageID() {
        return imageID;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}
