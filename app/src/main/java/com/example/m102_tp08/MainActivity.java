package com.example.m102_tp08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalc = findViewById(R.id.calculer);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText textNom = findViewById(R.id.nom);

                EditText textAge = findViewById(R.id.age);

                Switch swFidele = findViewById(R.id.fidele);

                RadioButton rbJava = findViewById(R.id.java);

                RadioButton rbLinux = findViewById(R.id.linux);

                RadioButton rbCisco = findViewById(R.id.cisco);

                String nom = textNom.getText().toString();

                int age = Integer.parseInt(textAge.getText().toString());

                Double prix = 0.0;

                if(rbJava.isChecked()) {


                    prix = 3500.0;
                }



                if(rbLinux.isChecked()) {

                    if(swFidele.isChecked()) {
                        prix=4300*0.9;
                    }
                    else {
                        prix=4300.0;
                    }
                }

                if(rbCisco.isChecked()) {

                    if(swFidele.isChecked()) {
                        prix=5000*0.9;
                    }
                    else {
                        prix=5000.0;
                    }
                }

                Intent i = new Intent(MainActivity.this, MainActivity2.class);

                i.putExtra("nom",nom);

                i.putExtra("age",age);

                i.putExtra("prix",prix);

                startActivity(i);







            }
        });

    }
}