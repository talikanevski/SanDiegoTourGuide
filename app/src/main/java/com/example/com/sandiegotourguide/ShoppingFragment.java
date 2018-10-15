package com.example.com.sandiegotourguide;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        // Create a list of words
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.old_town), R.drawable.old_town, getString(R.string.old_town_location)));
        attractions.add(new Attraction(getString(R.string.gaslamp), R.drawable.gaslamp_quarter, getString(R.string.gaslamp_location)));
        attractions.add(new Attraction(getString(R.string.fashion_valley), R.drawable.fashion_valley, getString(R.string.fashion_valley_location)));
        attractions.add(new Attraction(getString(R.string.hillcrest), R.drawable.hillcrest, getString(R.string.hillcrest_location)));
        attractions.add(new Attraction(getString(R.string.coronado_ferry), R.drawable.sd, getString(R.string.coronado_ferry_location)));
        attractions.add(new Attraction(getString(R.string.westfield), R.drawable.westfield_horton_plaza, getString(R.string.westfield_location)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attractions_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
