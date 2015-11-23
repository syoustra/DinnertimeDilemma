package com.syoustra.dinnertimedilemma.model;

import java.util.Random;

/**
 * Created by Artsonian on 11/21/2015.
 */



//// TESTING a la FunFacts
//
//public class Restaurant {
////MEMBER VARIABLES
//    public String[] mfoodPlaces = {
//            "Simply Thai",
//            "Tap Room",
//            "The Planet",
//            "BDubs",
//            "Barrett Bar",
//            "Sapporo",
//            "Cheesecake Factory"
//    };
//
////METHODS
//    public String getFoodPlace() {
//
//        // TESTING WITH HARD-CODED RESTAURANT NAME (a la FunFacts)
////                String foodPlace = "StuffYourGullet Town";
////                mRestaurantTextView.setText(foodPlace);
////                String tweetTime = "TweetMe, my tweetie!";
////                mTwitter.setText(tweetTime);
//
//
//        String foodPlace = "";
//
//        // RANDOM SELECTION FROM FUNFACTS
//        Random randomGenerator = new Random();
//        int randomNumber = randomGenerator.nextInt(mfoodPlaces.length);
//
//        foodPlace = mfoodPlaces[randomNumber];
//
//
//        return foodPlace;
//
//    }
//
//
//}


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
                "2221056 Bardstown Rd, Louisville, KY 40204",
                "222222222http://www.highlandstaproom.com/#!food/c1jo3",
                "222https://www.facebook.com/HighlandsTaproomGrill/",
                "222https://twitter.com/highlandstaprm"
        );

        mPages[2] = new Page(
                "Yet Another Highlands Tap Room",
                "33331056 Bardstown Rd, Louisville, KY 40204",
                "333http://www.highlandstaproom.com/#!food/c1jo3",
                "333https://www.facebook.com/HighlandsTaproomGrill/",
                "333https://twitter.com/highlandstaprm"
        );

    }


    ///CHANGE PAGE TO FOODPLACE/GET FOODPLACE
    ///TRYING TO ADD RANDOMIZER FROM FUNFACTS
    Random randomGenerator = new Random();
    int randomNumber = randomGenerator.nextInt(3);

    public Page getPage(int randomNumber) {
        return mPages[randomNumber];
    }
}
