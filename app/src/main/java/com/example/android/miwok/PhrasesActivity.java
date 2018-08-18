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

        //Array of phrases
        ArrayList<Word> phrasesName = new ArrayList<Word>();

        //Assigning words to englishTranslation array
        phrasesName.add(new Word("Where are you going?", "minto wuksus"));
        phrasesName.add(new Word("What is your name?", "tinnә oyaase'nә"));
        phrasesName.add(new Word("My name is...", "oyaaset..."));
        phrasesName.add(new Word("How are you feeling?", "michәksәs?"));
        phrasesName.add(new Word("I’m feeling good.", "kuchi achit"));
        phrasesName.add(new Word("Are you coming?", "әәnәs'aa?"));
        phrasesName.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        phrasesName.add(new Word("I’m coming.", "әәnәm"));
        phrasesName.add(new Word("Let’s go.", "yoowutis"));
        phrasesName.add(new Word("Come here.", "әnni'nem"));


        PhrasesAdapter itemsAdapter = new PhrasesAdapter(this, phrasesName);

        ListView listView = (ListView) findViewById(R.id.wordlist);

        listView.setAdapter(itemsAdapter);
    }
}
