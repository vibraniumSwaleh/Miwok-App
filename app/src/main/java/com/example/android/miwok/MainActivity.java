/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Linking view in xml to variable in java
        TextView listenNumbers = (TextView)findViewById(R.id.numbers);
        TextView listenFamilyMembers = (TextView)findViewById(R.id.family);
        TextView listenColors = (TextView)findViewById(R.id.colors);
        TextView lisenPhrases = (TextView)findViewById(R.id.phrases);

        //Method to open Numbers Activity when view is click
        listenNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view){
//              Toast.makeText(view.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();
                Intent numbersIntents = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntents);
            }
        });

        //Method to open Family Members Activity when view is click
        listenFamilyMembers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//              Toast.makeText(view.getContext(), "Open the list of family members", Toast.LENGTH_SHORT).show();
                Intent listenFamilyMembers = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(listenFamilyMembers);
            }
        });

        //Method to open Colors Activity when view is click
        listenColors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//              Toast.makeText(view.getContext(), "Open the list of colors", Toast.LENGTH_SHORT).show();
                Intent listenColors = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(listenColors);
            }
        });

        //Method to open Phrases Activity when view is click
        lisenPhrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//              Toast.makeText(view.getContext(), "Open the list of phrases", Toast.LENGTH_SHORT).show();
                Intent lisenPhrases = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(lisenPhrases);
            }
        });
    }

}
