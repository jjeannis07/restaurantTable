package com.example.jamesjeannis.therestauranttable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class Restaurant_Reservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant__reservation);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            if (bundle.getString("some") != null) {
                Toast.makeText(getApplicationContext(), "data:" + bundle.getString("some"), Toast.LENGTH_LONG).show();
                //confirm_txt.setText();
                Intent intent = getIntent();
                TextView confirm_txt = findViewById(R.id.lblRestaurantName);
                confirm_txt = findViewById(R.id.lblRestaurantName);
                String txt_put = intent.getStringExtra("some");
                confirm_txt.setText(txt_put);
            }
        }
    }
}
