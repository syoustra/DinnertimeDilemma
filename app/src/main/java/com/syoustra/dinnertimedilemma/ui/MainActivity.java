package com.syoustra.dinnertimedilemma.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.syoustra.dinnertimedilemma.R;

import static com.syoustra.dinnertimedilemma.R.string.no_blame;

public class MainActivity extends AppCompatActivity {

    //FunFacts Version (I hope!!!)
// DON'T NEED THIS EITHER    private Restaurant mRestaurant = new Restaurant();


    private Button mRandomSelectorButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRandomSelectorButton = (Button)findViewById(R.id.randomSelectorButton);

        mRandomSelectorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(no_blame), Toast.LENGTH_SHORT).show();
                ///FunFact Version of things
//   DON'T NEED TO DO THIS ... HAPPENS IN NEXT PAGE'S ON-CREATE
//                String foodPlace = mRestaurant.getFoodPlace();





                selectRestaurant();
            }
        });
    }
//selectRestaurant method is what opens the second page
    private void selectRestaurant() {
        Intent intent = new Intent(this, SelectorActivity.class);
        startActivity(intent);
    }







    // Menu Code Only ... can delete if needed
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    // End deletable menu code
}
