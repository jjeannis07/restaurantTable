package com.example.jamesjeannis.therestauranttable;

import java.util.ArrayList;

/**
 * Created by jamesjeannis on 11/22/17.
 */
public class DataService {
    private static DataService instance = new DataService();

    private DataService() {

    }

    public static DataService getInstance() {
        return instance;
    }

    public ArrayList<Therestaurant> getTherestaurantLocationsWithin10MilesOfZip(int zipcode) {
        //pretending we are downloading data from the server

        ArrayList<Therestaurant> list = new ArrayList<>();
        list.add(new Therestaurant(35.279f, -120.663f, "Downtown", "762 Higuera Street, San Luis Obispo, CA 93401", "slo"));
        list.add(new Therestaurant(35.302f, -120.658f, "Flatbush", "1 Grand Ave, San Luis Obispo, CA 93401", "slo"));
        list.add(new Therestaurant(35.267f, -120.652f, "New Jersey", "2494 Victoria Ave, San Luis Obispo, CA 93401", "slo"));
        list.add(new Therestaurant(35.267f, -120.652f, "East Side Tower", "2494 Victoria Ave, San Luis Obispo, CA 93401", "slo"));
        return list;
    }
}
