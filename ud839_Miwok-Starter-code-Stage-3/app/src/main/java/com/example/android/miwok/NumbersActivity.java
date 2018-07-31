package com.example.android.miwok;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Creating array
        ArrayList<WordArrayElement> engnum = new ArrayList<WordArrayElement>();

        engnum.add(new WordArrayElement("one","lutti",R.drawable.number_one));
        engnum.add(new WordArrayElement("two","otiiko",R.drawable.number_two));
        engnum.add(new WordArrayElement("three","tolookosu",R.drawable.number_three));
        engnum.add(new WordArrayElement("four","oyyisa",R.drawable.number_four));
        engnum.add(new WordArrayElement("five","massokka",R.drawable.number_five));
        engnum.add(new WordArrayElement("six","temmokka",R.drawable.number_six));
        engnum.add(new WordArrayElement("seven","kenekaku",R.drawable.number_seven));
        engnum.add(new WordArrayElement("eight","kawinta",R.drawable.number_eight));
        engnum.add(new WordArrayElement("nine","wo'e",R.drawable.number_nine));
        engnum.add(new WordArrayElement("ten","na'aacha",R.drawable.number_ten));

        // Creating TextViews for each number using while loop
        // Drawback : Occupies a lot of space in memory
        /*
        int index = 0;
        LinearLayout NumLayout = (LinearLayout)findViewById(R.id.list);
        while(index < 10)
        {
            TextView t = new TextView(this);
            t.setText(engnum.get(index));
            NumLayout.addView(t);
            index++;
        }
        */

        WordArrayAdapter adapter = new WordArrayAdapter(this,engnum,R.color.category_numbers);
        ListView list = (ListView)findViewById(R.id.word_list);
        list.setAdapter(adapter);
        // logging
        Log.v("NumbersActivity","engnum[0] = " + engnum.get(0));
    }
}
// Way 1 to create Event listeners

