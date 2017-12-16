package com.example.jamesjeannis.therestauranttable;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jamesjeannis on 12/15/17.
 */

public class RestaurantLocation extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_location);

        final ImageView clickImage = findViewById(R.id.location_img);
        clickImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myBooking = new Intent(v.getContext(), Restaurant_Reservation.class);
                startActivityForResult(myBooking, 0);
            }
        });

        final TextView clickText = findViewById(R.id.location_title);
        clickText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent location_address = new Intent(v.getContext(), Restaurant_Reservation.class);
                startActivityForResult(location_address, 0);
            }
        });
    }
}
