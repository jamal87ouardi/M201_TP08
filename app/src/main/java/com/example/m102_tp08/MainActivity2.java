package com.example.m102_tp08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textNom = findViewById(R.id.bjr);

        TextView textAge = findViewById(R.id.bjrage);

        TextView textPrix = findViewById(R.id.prix);

        Intent i = getIntent();

        textNom.setText(i.getExtras().getString("nom"));

        textAge.setText(String.valueOf(i.getIntExtra("age",0)));

        Double price = i.getDoubleExtra("prix",0.0);

        String msg = "Le prix total est "+price;

        textPrix.setText(msg);

    }
}