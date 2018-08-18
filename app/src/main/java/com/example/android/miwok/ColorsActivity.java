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

        //Array of colors
        ArrayList<Word> colorsName = new ArrayList<Word>();

        //Assigning words to englishTranslation array
        colorsName.add(new Word("red", "weṭeṭṭi"));
        colorsName.add(new Word("green", "chokokki"));
        colorsName.add(new Word("brown", "ṭakaakki"));
        colorsName.add(new Word("gray", "ṭopoppi"));
        colorsName.add(new Word("black", "kululli"));
        colorsName.add(new Word("white", "kelelli"));
        colorsName.add(new Word("dusty yellow", "ṭopiisә"));
        colorsName.add(new Word("mustard yellow", "chiwiiṭә"));

        ColorAdapter itemsAdapter = new ColorAdapter(this, colorsName);

        ListView listView = (ListView) findViewById(R.id.wordlist);

        listView.setAdapter(itemsAdapter);
    }
}
