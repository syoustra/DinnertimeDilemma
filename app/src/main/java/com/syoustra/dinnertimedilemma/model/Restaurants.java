package com.syoustra.dinnertimedilemma.model;

/**
 * Created by Artsonian on 11/21/2015.
 */
public class Restaurants {
    private Page[] mPages;

    public Restaurants() {
        mPages = new Page[3];

        mPages[0] = new Page(
                "Highlands Tap Room",
                "https://www.google.com/maps/place/Highlands+Tap+Room/@38.2386963,-85.7241873,17z/data=!3m1!4b1!4m2!3m1!1s0x88690cd2879b232b:0xf25bbfae0b7772e1",
                "http://www.highlandstaproom.com/#!food/c1jo3",
                "https://www.facebook.com/HighlandsTaproomGrill/",
                "https://twitter.com/highlandstaprm"
        );

        mPages[1] = new Page(
                "A Second Highlands Tap Room",
                "https://www.google.com/maps/place/Highlands+Tap+Room/@38.2386963,-85.7241873,17z/data=!3m1!4b1!4m2!3m1!1s0x88690cd2879b232b:0xf25bbfae0b7772e1",
                "http://www.highlandstaproom.com/#!food/c1jo3",
                "https://www.facebook.com/HighlandsTaproomGrill/",
                "https://twitter.com/highlandstaprm"
        );

        mPages[2] = new Page(
                "Yet Another Highlands Tap Room",
                "https://www.google.com/maps/place/Highlands+Tap+Room/@38.2386963,-85.7241873,17z/data=!3m1!4b1!4m2!3m1!1s0x88690cd2879b232b:0xf25bbfae0b7772e1",
                "http://www.highlandstaproom.com/#!food/c1jo3",
                "https://www.facebook.com/HighlandsTaproomGrill/",
                "https://twitter.com/highlandstaprm"
        );

    }

}
