package com.syoustra.dinnertimedilemma.model;

/**
 * Created by Artsonian on 11/21/2015.
 */
public class Restaurant {
    private Page[] mPages;

    public Restaurant() {
        mPages = new Page[3];

        mPages[0] = new Page(
                "Highlands Tap Room",
                "1056 Bardstown Rd, Louisville, KY 40204",
                "http://www.highlandstaproom.com/#!food/c1jo3",
                "https://www.facebook.com/HighlandsTaproomGrill/",
                "https://twitter.com/highlandstaprm"
        );

        mPages[1] = new Page(
                "A Second Highlands Tap Room",
                "1056 Bardstown Rd, Louisville, KY 40204",
                "http://www.highlandstaproom.com/#!food/c1jo3",
                "https://www.facebook.com/HighlandsTaproomGrill/",
                "https://twitter.com/highlandstaprm"
        );

        mPages[2] = new Page(
                "Yet Another Highlands Tap Room",
                "1056 Bardstown Rd, Louisville, KY 40204",
                "http://www.highlandstaproom.com/#!food/c1jo3",
                "https://www.facebook.com/HighlandsTaproomGrill/",
                "https://twitter.com/highlandstaprm"
        );

    }

    public Page getPage(int pageNumber) {
        return mPages[pageNumber];
    }
}
