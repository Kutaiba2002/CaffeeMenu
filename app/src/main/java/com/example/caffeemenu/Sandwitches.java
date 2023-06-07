package com.example.caffeemenu;

public class Sandwitches {
    private String name;
    private String description;
    private int price;
    private int imageId;

    public Sandwitches(String name, String description, int price, int imageId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageId = imageId;
    }

    public static final Sandwitches[] sandwitches = {
            new Sandwitches("Hot Dog","Is a food consisting of a grilled or steamed sausage served in the slit of a partially sliced bun",10,R.drawable.hot_dog),
            new Sandwitches("Burger","A sandwich consisting of one or more cooked beef patties, placed inside a sliced bread roll or bun roll.",30,R.drawable.burger),
            new Sandwitches("Shawarma","Cooked on a rotating vertical spit in a rotisserie oven, shawarma essentially bastes itself in its own juices, resulting in moist, tender meat",17,R.drawable.sh)
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {return price;}

    public int getImageId() {
        return imageId;
    }

    @Override
    public String toString() {return name;}
}
