package com.syoustra.dinnertimedilemma.model;

/**
 * Created by Artsonian on 11/21/2015.
 */
public class Page {
    private String mRestaurant;
    private String mMap;
    private String mMenu;
    private String mFacebook;
    private String mTwitter;

    public Page(String restaurant, String map, String menu, String facebook, String twitter) {
        mRestaurant = restaurant;
        mMap = map;
        mMenu = menu;
        mFacebook = facebook;
        mTwitter = twitter;
    }



    public String getRestaurant() {
        return mRestaurant;
    }

    public void setRestaurant(String restaurant) {
        mRestaurant = restaurant;
    }

    public String getMap() {
        return mMap;
    }

    public void setMap(String map) {
        mMap = map;
    }

    public String getMenu() {
        return mMenu;
    }

    public void setMenu(String menu) {
        mMenu = menu;
    }

    public String getFacebook() {
        return mFacebook;
    }

    public void setFacebook(String facebook) {
        mFacebook = facebook;
    }

    public String getTwitter() {
        return mTwitter;
    }

    public void setTwitter(String twitter) {
        mTwitter = twitter;
    }
}
