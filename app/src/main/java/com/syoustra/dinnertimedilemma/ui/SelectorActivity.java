package com.syoustra.dinnertimedilemma.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.syoustra.dinnertimedilemma.R;
import com.syoustra.dinnertimedilemma.model.Page;
import com.syoustra.dinnertimedilemma.model.Restaurant;

public class SelectorActivity extends AppCompatActivity {

    // RESTAURANT ARRAY VARIABLES
    private Restaurant mRestaurant = new Restaurant();
    private TextView mRestaurantTextView;
    private Button mMap;
    private Button mMenu;
    private Button mFacebook;
    private Button mTwitter;

    private Button mSelectAgainButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);


//        TextView restaurantLabel = (TextView) findViewById(R.id.restaurantTextView);
//        Button

        // AGAIN, RESTAURANT ARRAY (I think!)
        mRestaurantTextView = (TextView)findViewById(R.id.restaurantTextView);
        mMap = (Button)findViewById(R.id.mapButton);
        mMenu = (Button)findViewById(R.id.menuButton);
        mFacebook = (Button)findViewById(R.id.facebookButton);
        mTwitter = (Button)findViewById(R.id.twitterButton);


        loadPage();


        mSelectAgainButton = (Button)findViewById(R.id.selectAgainButton);


//        ///FunFacts Version (I hope!!!!!)
//        String foodPlace = mRestaurant.getFoodPlace();
//        mRestaurantTextView.setText(foodPlace);
//

        // NOPE, SELECT AGAIN
        mSelectAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SelectorActivity.this, "Picky, picky!", Toast.LENGTH_SHORT).show();

//                ///FunFact Version of things
//                String foodPlace = mRestaurant.getFoodPlace();
//
//
//                mRestaurantTextView.setText(foodPlace);
            }
        });
//  NOT SURE ABOUT THIS ... JUST COPIED FROM FUNFACTS
   //     mSelectAgainButton.setOnClickListener(listener);

// TRYING FROM INTERACTIVE STORY w/RANDOM OF FUNFACTS
    }

    private void loadPage() {
        Page page = mRestaurant.getPage(0);

        mRestaurantTextView.setText(page.getRestaurant());
        mMap.setText(page.getMap());
        mMenu.setText(page.getMenu());
        mFacebook.setText(page.getFacebook());
        mTwitter.setText(page.getTwitter());
    }


    // TEMPORARILY COMMENTING OUT
//    private void loadPage() {
//        Page page = mRestaurant.getPage(0);
//
//        mRestaurantTextView.setText(page.getRestaurant());
//        mMap.setText(page.getMap());
//        mMenu.setText(page.getMenu());
//        mFacebook.setText(page.getFacebook());
//        mTwitter.setText(page.getTwitter());
//    }



    /// ******************ALSO CHECK GETPAGE() ON RESTAURANT.JAVA PAGE**************
    // **************** MAKE SURE YOU ADD IN REDO BUTTON ****************










    //Menu code ... can be deleted
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_selector, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
