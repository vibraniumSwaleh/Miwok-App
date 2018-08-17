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
        //creating TextView
        TextView wordView = new TextView(this);
        //setting text in the wordView TextView
        wordView.setText(englishNumbers.get(0));
        //displaying wordView TextView in the parent rootView Layout
        rootView.addView(wordView);

        //creating TextView
        TextView wordView2 = new TextView(this);
        //setting text in the wordView TextView
        wordView2.setText(englishNumbers.get(1));
        //displaying wordView TextView in the parent rootView Layout
        rootView.addView(wordView2);

        //creating TextView
        TextView wordView3 = new TextView(this);
        //setting text in the wordView TextView
        wordView3.setText(englishNumbers.get(2));
        //displaying wordView TextView in the parent rootView Layout
        rootView.addView(wordView3);

        //creating TextView
        TextView wordView4 = new TextView(this);
        //setting text in the wordView TextView
        wordView4.setText(englishNumbers.get(3));
        //displaying wordView TextView in the parent rootView Layout
        rootView.addView(wordView4);

        //creating TextView
        TextView wordView5 = new TextView(this);
        //setting text in the wordView TextView
        wordView5.setText(englishNumbers.get(4));
        //displaying wordView TextView in the parent rootView Layout
        rootView.addView(wordView5);

        //creating TextView
        TextView wordView6 = new TextView(this);
        //setting text in the wordView TextView
        wordView6.setText(englishNumbers.get(5));
        //displaying wordView TextView in the parent rootView Layout
        rootView.addView(wordView6);

        //creating TextView
        TextView wordView7 = new TextView(this);
        //setting text in the wordView TextView
        wordView7.setText(englishNumbers.get(6));
        //displaying wordView TextView in the parent rootView Layout
        rootView.addView(wordView7);

        //creating TextView
        TextView wordView8 = new TextView(this);
        //setting text in the wordView TextView
        wordView8.setText(englishNumbers.get(7));
        //displaying wordView TextView in the parent rootView Layout
        rootView.addView(wordView8);

        //creating TextView
        TextView wordView9 = new TextView(this);
        //setting text in the wordView TextView
        wordView9.setText(englishNumbers.get(8));
        //displaying wordView TextView in the parent rootView Layout
        rootView.addView(wordView9);

        //creating TextView
        TextView wordView10 = new TextView(this);
        //setting text in the wordView TextView
        wordView10.setText(englishNumbers.get(9));
        //displaying wordView TextView in the parent rootView Layout
        rootView.addView(wordView10);
        
    }
}
