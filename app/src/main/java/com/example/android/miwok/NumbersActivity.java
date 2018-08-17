package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Array of numbers
        ArrayList<String> englishNumbers = new ArrayList<String>();

        //Assigning words to englishTranslation array
        englishNumbers.add("one");
        englishNumbers.add("two");
        englishNumbers.add("three");
        englishNumbers.add("four");
        englishNumbers.add("five");
        englishNumbers.add("six");
        englishNumbers.add("seven");
        englishNumbers.add("eight");
        englishNumbers.add("nine");
        englishNumbers.add("ten");

        //Linking LinearLayout to java using id
        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        int index = 0;

        while (index<englishNumbers.size()){
            //creating new texview
            TextView wordView = new TextView(this);
            //setting text in the wordView TextView
            wordView.setText(englishNumbers.get(index));
            //displaying wordView TextView in the parent rootView Layout
            rootView.addView(wordView);
            index++;
        }

    }
}
