package com.example.caffeemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SandwitchDetail extends AppCompatActivity {

    private ImageView imgSand;
    private TextView txtSand;
    private TextView SandTxtDesc;
    private TextView txtPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwitch_detail);

        Intent intent = getIntent();
        int id = (int)intent.getExtras().get("id");

        Sandwitches san = Sandwitches.sandwitches[id];

        imgSand = findViewById(R.id.imgSand);
        txtSand = findViewById(R.id.txtSand);
        SandTxtDesc = findViewById(R.id.SandTxtDesc);
        txtPrice = findViewById(R.id.txtPrice);

        imgSand.setImageResource(san.getImageId());
        txtSand.setText(san.getName());
        SandTxtDesc.setText(san.getDescription());
        txtPrice.setText("Price:"+ String.valueOf(san.getPrice()));
    }
}