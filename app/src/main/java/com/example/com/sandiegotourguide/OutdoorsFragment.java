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
public class    OutdoorsFragment extends Fragment {


    public OutdoorsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        // Create a list of words
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.zoo), R.drawable.zoo, getString(R.string.zoo_location)));
        attractions.add(new Attraction(getString(R.string.safari), R.drawable.safari, getString(R.string.safari_location)));
        attractions.add(new Attraction(getString(R.string.torrey), R.drawable.del_mar, getString(R.string.torrey_location)));
        attractions.add(new Attraction(getString(R.string.balboa), R.drawable.balboa,getString(R.string.balboa_location)));
        attractions.add(new Attraction(getString(R.string.la_jolla), R.drawable.la_holla_cove, getString(R.string.la_jolla_location)));
        attractions.add(new Attraction(getString(R.string.old_town), R.drawable.old_town, getString(R.string.old_town_location)));
        attractions.add(new Attraction(getString(R.string.seaport_village), R.drawable.saeport_vilage, getString(R.string.seaport_village_location)));

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
