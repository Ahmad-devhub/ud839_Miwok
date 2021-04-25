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

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Creating an arrayList of Word objects
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti", R.drawable.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five));
        words.add(new Word("six", "temmokka", R.drawable.number_six));
        words.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        words.add(new Word("eight", "kawinta", R.drawable.number_eight));
        words.add(new Word("nine", "wo'e", R.drawable.number_nine));
        words.add(new Word("ten", "na'aacha", R.drawable.number_ten));



//      <----------------Using a List view adaptor--------------------->
        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter =
                new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        //GridView listView = (GridView) findViewById(R.id.list);
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
//      <---------------------------------------------------/>


//      <--------------------------------------------------->
//
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        TextView wordView = new TextView((this));
//        wordView.setText(englishTranslation.get(0));
//        rootView.addView(wordView);
//      <---------------------------------------------------/>


//      <--------------------------------------------------->
//        //Displaying the Array list for english translation
//        for (int i = 0; i < englishTranslation.size(); i++) {
//
//            TextView wordView = new TextView((this));
//            wordView.setText(englishTranslation.get(i));
//            rootView.addView(wordView);
//
//        }
//      <---------------------------------------------------/>



//      <--------------------------------------------------->
//        while (index < 4) {
//            Log.i("NumbersActivity", "Word at index 0: " + englishTranslation.get(index));
//            index++;
//        }
//      <---------------------------------------------------/>

        //Creating an arrayList of english translations
        ArrayList<String> englishTranslation = new ArrayList<String>();
        englishTranslation.add("one");
        englishTranslation.add("two");
        englishTranslation.add("three");
        englishTranslation.add("four");
        englishTranslation.add("five");
        englishTranslation.add("six");
        englishTranslation.add("eight");
        englishTranslation.add("nine");
        englishTranslation.add("ten");

        //Creating an Array of miwok
        String[] miwokTranslation = new String[10];
        miwokTranslation[0] = "lutti";
        miwokTranslation[1] = "otiiko";
        miwokTranslation[2] = "tolookosu";
        miwokTranslation[3] = "oyyisa";
        miwokTranslation[4] = "massokka";
        miwokTranslation[5] = "temmokka";
        miwokTranslation[6] = "kenekaku";
        miwokTranslation[7] = "kawintta";
        miwokTranslation[8] = "wo'e";
        miwokTranslation[9] = "na'aacha";
    }
}
