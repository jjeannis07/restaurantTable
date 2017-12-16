package com.example.jamesjeannis.therestauranttable;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by jamesjeannis on 12/12/17.
 */

public class RestaurantActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant__main);

        final Button btnBrowse = findViewById(R.id.btnBrowse);
        btnBrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntentBrowse = new Intent(v.getContext(), MapsActivity.class);
                startActivityForResult(myIntentBrowse, 0);

            }
        });

        final Button btnHistory = findViewById(R.id.btnBookingHist);
        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntentHist = new Intent(v.getContext(), BookingHistory.class);
                startActivityForResult(myIntentHist, 0);

            }
        });

        final Button btnProfile = findViewById(R.id.btnProfile);
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntentProfile = new Intent(v.getContext(), UsersListActivity.class);
                startActivityForResult(myIntentProfile, 0);

            }
        });

    }
}
