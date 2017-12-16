package com.example.jamesjeannis.therestauranttable;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jamesjeannis on 11/22/17.
 */
public class LocationsViewHolder extends RecyclerView.ViewHolder {

    private ImageView locationImage;
    private TextView locationTitle;
    private TextView locationAddress;

    public LocationsViewHolder(View itemView) {
        super(itemView);

        locationImage = itemView.findViewById(R.id.location_img);
        locationTitle = itemView.findViewById(R.id.location_title);
        locationAddress = itemView.findViewById(R.id.location_address);
    }

    public void updateUI(Therestaurant location) {
        String uri = location.getImgUrl();
        int resource = locationImage.getResources().getIdentifier(uri, null, locationImage.getContext().getPackageName());
        locationImage.setImageResource(resource);
        locationTitle.setText(location.getLocationTitle());
        locationAddress.setText(location.getLocationAddress());
    }

}

