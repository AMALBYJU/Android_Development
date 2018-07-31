package com.example.android.oop;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }



    /**

     * Called when the cookie should be eaten.

     */

    public void eatCookie(View view) {

        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView img = (ImageView)findViewById(R.id.cookie_image_view);
        img.setImageResource(R.drawable.after_cookie);
        TextView h = (TextView)findViewById(R.id.heading_view);
        h.setText("I'm so full");
        Button eat = (Button)findViewById(R.id.eat_button);
        eat.setVisibility(View.INVISIBLE);
        // TODO: Find a reference to the TextView in the layout. Change the text.



    }

}
