package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<WordArrayElement> clrlist = new ArrayList<WordArrayElement>();

        clrlist.add(new WordArrayElement("red","weṭeṭṭi",R.drawable.color_red));
        clrlist.add(new WordArrayElement("green","chokokki",R.drawable.color_green));
        clrlist.add(new WordArrayElement("brown","ṭakaakki",R.drawable.color_brown));
        clrlist.add(new WordArrayElement("gray","ṭopoppi",R.drawable.color_gray));
        clrlist.add(new WordArrayElement("black","kululli",R.drawable.color_black));
        clrlist.add(new WordArrayElement("white","kelelli",R.drawable.color_white));
        clrlist.add(new WordArrayElement("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        clrlist.add(new WordArrayElement("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));

        WordArrayAdapter adapter = new WordArrayAdapter(this,clrlist,R.color.category_colors);
        ListView L = (ListView)findViewById(R.id.word_list);
        L.setAdapter(adapter);
    }
}

