package com.example.com.sandiegotourguide;


/**
 * {@link Attraction} represents a single Android platform release.
 * Each object has 3 properties: name of a an attraction, image resource ID, and button "add to favorites"
 */
public class Attraction {    //name af an attraction
    private String mName;
    // Drawable resource ID
    private int mImageResourceId;
    //favorites button
    private int mfavorites;


    /**
     * Create a new Attraction object.
     *
     * @param name            is the name of the attraction (e.g. San Diego Zoo)
     * @param imageResourceId is drawable reference ID that corresponds to the Android version
     * @param favorites       is drawable reference ID that corresponds to the Android version
     */
    public Attraction(String name, int imageResourceId, int favorites) {
        mName = name;
        mImageResourceId = imageResourceId;
        mfavorites = favorites;
    }

    /**
     * Get the name of the attraction
     */
    public String getAttractionName() {
        return mName;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getFavorites() {
        return mfavorites;
    }

    public void setFavorites(int value) {
        mfavorites = value;
    }
}

