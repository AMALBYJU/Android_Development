package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<WordArrayElement> phrlist= new ArrayList<WordArrayElement>();

        phrlist.add(new WordArrayElement("Where are you going?","minto wuksus",-1));
        phrlist.add(new WordArrayElement("What is your name?","tinnә oyaase'nә",-1));
        phrlist.add(new WordArrayElement("My name is...","oyaaset...",-1));
        phrlist.add(new WordArrayElement("How are you feeling?","michәksәs?",-1));
        phrlist.add(new WordArrayElement("I’m feeling good.","kuchi achit",-1));
        phrlist.add(new WordArrayElement("Are you coming?","әәnәs'aa?",-1));
        phrlist.add(new WordArrayElement("Yes, I’m coming.","hәә’ әәnәm",-1));
        phrlist.add(new WordArrayElement("I’m coming.","әәnәm",-1));
        phrlist.add(new WordArrayElement("Let’s go.","yoowutis",-1));
        phrlist.add(new WordArrayElement("Come here.","әnni'nem",-1));

        ListView L = (ListView)findViewById(R.id.word_list);
        WordArrayAdapter adapter = new WordArrayAdapter(this,phrlist,R.color.category_phrases);
        L.setAdapter(adapter);
    }
}
