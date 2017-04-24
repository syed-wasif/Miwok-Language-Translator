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
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);


//        TextView no = (TextView) findViewById(R.id.numbers);
//
//        no.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MainActivity.this, NumbersActivity.class);
//                startActivity(i);
//            }
//        });
//
//
//        TextView  family= (TextView) findViewById(R.id.family);
//
//        family.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MainActivity.this, FamilyActivity.class);
//                startActivity(i);
//            }
//        });
//
//
//        TextView  color= (TextView) findViewById(R.id.colors);
//
//        color.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MainActivity.this, ColorsActivity.class);
//                startActivity(i);
//            }
//        });
//
//
//        TextView  phrase= (TextView) findViewById(R.id.phrases);
//
//        phrase.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MainActivity.this, PhrasesActivity.class);
//                startActivity(i);
//            }
//        });
//    }

//    public void openNumbersActivity(View view) {
//        Intent i = new Intent(this, NumbersActivity.class);
//        startActivity(i);
//    }
//
//    public void openPhrasesActivity(View view) {
//        Intent i = new Intent(this, PhrasesActivity.class);
//        startActivity(i);
//    }
//
//    public void openFamilyActivity(View view) {
//        Intent i = new Intent(this, FamilyActivity.class);
//        startActivity(i);
//    }
//
//    public void openColorsActivity(View view) {
//        Intent i = new Intent(this, ColorsActivity.class);
//        startActivity(i);
  }
}
