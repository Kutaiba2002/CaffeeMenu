package com.example.caffeemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PizzaActivity extends AppCompatActivity {
    private ListView listPizza;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        listPizza = findViewById(R.id.listPizza);
        ArrayAdapter<Pizza> pizzaArrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Pizza.pizza);
        listPizza.setAdapter(pizzaArrayAdapter);

        AdapterView.OnItemClickListener pizzaItemClickListner = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(PizzaActivity.this, PizzaDetail.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        };
        listPizza.setOnItemClickListener(pizzaItemClickListner);

    }
}