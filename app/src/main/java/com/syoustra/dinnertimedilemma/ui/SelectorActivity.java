package com.syoustra.dinnertimedilemma.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.syoustra.dinnertimedilemma.R;
import com.syoustra.dinnertimedilemma.model.Page;
import com.syoustra.dinnertimedilemma.model.Restaurant;

public class SelectorActivity extends AppCompatActivity {

    private Restaurant mRestaurant = new Restaurant();
    private TextView mRestaurantTextView;
    private Button mMap;
    private Button mMenu;
    private Button mFacebook;
    private Button mTwitter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);


//        TextView restaurantLabel = (TextView) findViewById(R.id.restaurantTextView);
//        Button

        mRestaurantTextView = (TextView)findViewById(R.id.restaurantTextView);
        mMap = (Button)findViewById(R.id.mapButton);
        mMenu = (Button)findViewById(R.id.menuButton);
        mFacebook = (Button)findViewById(R.id.facebookButton);
        mTwitter = (Button)findViewById(R.id.twitterButton);


    }

    private void loadPage() {
        Page page = mRestaurant.getPage(0);

        mRestaurantTextView.setText(page.getRestaurant());
        mMap.setText(page.getMap());
        mMenu.setText(page.getMenu());
        mFacebook.setText(page.getFacebook());
        mTwitter.setText(page.getTwitter());
    }



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
