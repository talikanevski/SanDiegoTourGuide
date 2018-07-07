package com.example.com.sandiegotourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link AttractionsAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Attraction} objects.
 */
public class AttractionsAdapter extends ArrayAdapter<Attraction> {

    private static final String LOG_TAG = AttractionsAdapter.class.getSimpleName();

    /**
     * param context        The current context. Used to inflate the layout file.
     * //param songs A List of Song objects to display in a list
     **/

    public AttractionsAdapter(Activity context, ArrayList<Attraction> attractions) {

        super(context, 0, attractions);
    }

    /**
     * Provides a view for an AdapterView
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        /** Check if the existing view is being reused, otherwise inflate the view**/
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        /** Get the {@link Attraction} object located at this position in the list**/
        final Attraction currentAttraction = getItem(position);

        /** Find the TextView in the listview_list_item.xml layout with the ID version_name**/
        TextView s = (TextView) listItemView.findViewById(R.id.attraction);

        /** Get the version name from the current Attraction object and
         // set this text on the name TextView**/
        s.setText(currentAttraction.getAttractionName());

        /** Find the ImageView in the list_item.xml layout with the ID list_item_icon**/
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.icon);

        /**Get the image resource ID from the current Attraction object and
         // set the image to iconView**/
        iconView.setImageResource(currentAttraction.getImageResourceId());

        /** Find the TextView in the listview_list_item.xml layout **/
        TextView l = (TextView) listItemView.findViewById(R.id.location);

        /** Get the location from the current Attraction object and
         // set this text on the name TextView**/
        l.setText(currentAttraction.getmLocation());

        /** Return the whole list item layout (containing 2 TextViews and an ImageView)
         // so that it can be shown in the ListView**/
        return listItemView;
    }
}

