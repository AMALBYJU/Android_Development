package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<WordArrayElement> famlist = new ArrayList<WordArrayElement>();

        famlist.add(new WordArrayElement("father","әpә",R.drawable.family_father));
        famlist.add(new WordArrayElement("mother","әṭa",R.drawable.family_mother));
        famlist.add(new WordArrayElement("son","angsi",R.drawable.family_son));
        famlist.add(new WordArrayElement("daughter","tune",R.drawable.family_daughter));
        famlist.add(new WordArrayElement("older brother","taachi",R.drawable.family_older_brother));
        famlist.add(new WordArrayElement("younger brother","chalitti",R.drawable.family_younger_brother));
        famlist.add(new WordArrayElement("older sister","teṭe",R.drawable.family_older_sister));
        famlist.add(new WordArrayElement("younger sister","kolliti",R.drawable.family_younger_sister));
        famlist.add(new WordArrayElement("grandmother","ama",R.drawable.family_grandmother));
        famlist.add(new WordArrayElement("grandfather","paapa",R.drawable.family_grandfather));

        WordArrayAdapter adapter = new WordArrayAdapter(this,famlist,R.color.category_family);
        ListView L = (ListView)findViewById(R.id.word_list);
        L.setAdapter(adapter);
    }
}
