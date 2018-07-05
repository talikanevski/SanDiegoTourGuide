package com.example.com.sandiegotourguide;


/**
 * {@link Attraction} represents a single Android platform release.
 * Each object has 3 properties: name of a an attraction and image resource ID
 */
public class Attraction {
    //name af an attraction
    private String mName;
    // Drawable resource ID
    private int mImageResourceId;

    /**
     * Create a new Attraction object.
     *
     * @param name            is the name of the attraction (e.g. San Diego Zoo)
     * @param imageResourceId is drawable reference ID that corresponds to the Android version
     */
    public Attraction(String name, int imageResourceId) {
        mName = name;
        mImageResourceId = imageResourceId;
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
}

