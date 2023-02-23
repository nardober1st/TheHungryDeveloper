package com.bernardooechsler.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        ListView dessertsList = findViewById(R.id.list_view_desserts);

        Dish[] desserts = {
                new Dish("Chocolate Ice Cream with Sauce", "Creamy, chocolate ice cream served with a rich sauce", 799),
                new Dish("Chocolate and Blackcurrant Pudding", "A rich suet pudding made with milk chocolate and fresh blackcurrant", 899),
                new Dish("Chocolate and Blackcurrant Crepes", "Fluffy crepes filled with plain chocolate and fresh blackcurrant", 699),
                new Dish("Chocolate and Mustard Pancake", "Crispy pancake filled with white chocolate and French mustard", 799),
                new Dish("Cranberry Cart with Chocolate Sauce", "A rich pastry case filled with cranberry and served with chocolate sauce", 799),
                new Dish("Chocolate and Cheese Cheesecake", "A luxurious cheesecake layered with dark chocolate and smoked cheese", 799),
                new Dish("Cocoa and Blackcurrant Cake", "Moist cake made with cocoa and fresh blackcurrant", 499),
                new Dish("Mulberry and Cardamom Crumble", "Fresh mulberry and green cardamom topped with butter crumble", 699),
                new Dish("Lemon Scones With Chilli Jam", "Vegan scones served with chilli jam and fresh coconut cream", 599),
                new Dish("Potato and Banana Vegan Crepes", "Crispy vegan crepes filled with fresh potato and banana", 599),
                new Dish("Cinnamon and Treacle Buns", "Crumbly buns made with cinnamon and dark treacle", 499)
        };

        ArrayAdapter<Dish> dessertAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, desserts);

        dessertsList.setAdapter(dessertAdapter);
    }
}