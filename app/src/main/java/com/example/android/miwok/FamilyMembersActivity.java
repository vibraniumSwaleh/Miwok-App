package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Array of family members
        ArrayList<Word> familyMembersName = new ArrayList<Word>();

        //Assigning words to englishTranslation array
        familyMembersName.add(new Word("father", "әpә"));
        familyMembersName.add(new Word("mother", "әṭa"));
        familyMembersName.add(new Word("son", "angsi"));
        familyMembersName.add(new Word("daughter", "tune"));
        familyMembersName.add(new Word("older brother", "taachi"));
        familyMembersName.add(new Word("younger brother", "chalitti"));
        familyMembersName.add(new Word("older sister", "teṭe"));
        familyMembersName.add(new Word("younger sister", "kolliti"));
        familyMembersName.add(new Word("grandmother", "ama"));
        familyMembersName.add(new Word("grandfather", "paapa"));


        FamilyMemberAdapter itemsAdapter = new FamilyMemberAdapter(this, familyMembersName);

        ListView listView = (ListView) findViewById(R.id.wordlist);

        listView.setAdapter(itemsAdapter);
    }
}
