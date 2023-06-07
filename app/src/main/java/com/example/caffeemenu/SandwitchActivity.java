package com.example.caffeemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SandwitchActivity extends AppCompatActivity {

    private ListView listSandwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwitch);
        ArrayAdapter<Sandwitches> arrayAdapter = new ArrayAdapter<Sandwitches>(this, android.R.layout.simple_list_item_1, Sandwitches.sandwitches);
        listSandwitch = findViewById(R.id.listSandwitch);
        listSandwitch.setAdapter(arrayAdapter);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(SandwitchActivity.this,SandwitchDetail.class);
                    intent.putExtra("id", (int)id);
                    startActivity(intent);
            }
        };
        listSandwitch.setOnItemClickListener(itemClickListener);
    }
}