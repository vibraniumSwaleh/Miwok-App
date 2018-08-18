package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Array of numbers
        ArrayList<Word> numbersName = new ArrayList<Word>();

        //Assigning words to englishTranslation array
        numbersName.add(new Word("one", "lutti"));
        numbersName.add(new Word("two", "ottiko"));
        numbersName.add(new Word("three", "tolookosu"));
        numbersName.add(new Word("four", "oyyisa"));
        numbersName.add(new Word("five", "massokka"));
        numbersName.add(new Word("six", "temmokka"));
        numbersName.add(new Word("seven", "kenekaku"));
        numbersName.add(new Word("eight", "kawinta"));
        numbersName.add(new Word("nine", "wo'e"));
        numbersName.add(new Word("ten", "na'aacha"));


        WordAdapter itemsAdapter = new WordAdapter(this, numbersName);

        ListView listView = (ListView) findViewById(R.id.numberslist);

        listView.setAdapter(itemsAdapter);

    }
}
