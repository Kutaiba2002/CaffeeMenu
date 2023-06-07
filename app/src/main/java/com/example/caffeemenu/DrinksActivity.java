package com.example.caffeemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(this,
                android.R.layout.simple_list_item_1,
                Drink.drinks);

        ListView listView = (ListView)findViewById(R.id.drinks_list);
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

            //The "onItemClick()" method is a callback method that is invoked when an item in an 'AdapterView' (such as a 'ListView' or 'Spinner;) is clicked
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    //'View' that represents the clicked item within th 'AdapterView==>'ListView'/'Spinner'
                                    View view,
                                    // The position of the clicked item within the adapter's data set===>'Index'
                                    int position,
                                    long id) {
                Intent intent = new Intent(DrinksActivity.this,
                        DrinkDetail.class);
                intent.putExtra("drink_id", (int)id);
                startActivity(intent);

            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}