package com.example.com.sandiegotourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);


        // Create a list of words
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Maritime Museum", R.drawable.maritime_museum));
        attractions.add(new Attraction("Niki de Saint Phalle's Queen Califia's Magical Circle", R.drawable.niki_de_saint));
        attractions.add(new Attraction("Uss Midway Museum", R.drawable.uss_midway_museum));
        attractions.add(new Attraction("San Diego Natural History Museum", R.drawable.natural_history_museum));
        attractions.add(new Attraction("Mingei International Museum", R.drawable.mingei));
        attractions.add(new Attraction("San Diego Air&Space Museum", R.drawable.air_and_space_museum_));
        attractions.add(new Attraction("Spanish Village Art Center", R.drawable.art_village));
        attractions.add(new Attraction("Mission Basilica San Diego de Alcalá", R.drawable.first_mission));




        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attractions_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
