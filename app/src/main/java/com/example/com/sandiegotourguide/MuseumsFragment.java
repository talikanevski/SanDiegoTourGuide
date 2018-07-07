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
        attractions.add(new Attraction(getString(R.string.maritime), R.drawable.maritime_museum, getString(R.string.maritime_location)));
        attractions.add(new Attraction(getString(R.string.niki), R.drawable.niki_de_saint, getString(R.string.niki_location)));
        attractions.add(new Attraction(getString(R.string.midway), R.drawable.uss_midway_museum, getString(R.string.midway_location)));
        attractions.add(new Attraction(getString(R.string.natural_history), R.drawable.natural_history_museum, getString(R.string.natural_history_location)));
        attractions.add(new Attraction(getString(R.string.mingei), R.drawable.mingei, getString(R.string.mingei_location)));
        attractions.add(new Attraction(getString(R.string.space), R.drawable.air_and_space_museum_, getString(R.string.space_location)));
        attractions.add(new Attraction(getString(R.string.art_village), R.drawable.art_village, getString(R.string.art_village_location)));
        attractions.add(new Attraction(getString(R.string.mission), R.drawable.first_mission, getString(R.string.mission_location)));

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
