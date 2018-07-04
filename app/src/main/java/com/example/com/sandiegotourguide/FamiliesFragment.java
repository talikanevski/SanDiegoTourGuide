package com.example.com.sandiegotourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Context;
import android.widget.AdapterView;


import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FamiliesFragment extends Fragment {


    public FamiliesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);


        // Create a list of words
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("San Diego Zoo", R.drawable.zoo, R.drawable.favorites));
        attractions.add(new Attraction("San Diego Zoo Safari Park", R.drawable.safari, R.drawable.favorites));


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
