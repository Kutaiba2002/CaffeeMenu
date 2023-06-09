package com.example.caffeemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.main_menu);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.options));
        listView.setAdapter(arrayAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                if(position == 0){
                    Intent intent = new Intent(MainActivity.this, DrinksActivity.class);
                    startActivity(intent);
                }
                if(position == 1){
                    Intent intent = new Intent(MainActivity.this,SandwitchActivity.class);
                    startActivity(intent);
                }
                if(position == 2){
                    Intent intent = new Intent(MainActivity.this,PizzaActivity.class);
                    startActivity(intent);
                }
            }
        };
        //you are registering the 'itemClickListener' as the listener for click events on the ListView
        listView.setOnItemClickListener(itemClickListener);
    }
}