package com.example.caffeemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaDetail extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    private TextView textView2;
    private TextView textView3;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        Intent intent = getIntent();
        int position = (int)intent.getExtras().get("position");

        Pizza pizza = Pizza.pizza[position];

        imageView = findViewById(R.id.pizzaImage);
        imageView.setImageResource(pizza.getImageID());

        textView = findViewById(R.id.textView);
        textView.setText(pizza.getName());

        textView2 = findViewById(R.id.textView2);
        textView2.setText(pizza.getDescription());

        textView3 = findViewById(R.id.textView3);
        textView3.setText(String.valueOf(pizza.getPrice()));

    }
}