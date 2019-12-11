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
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String[] englishTranslation = new String[10];
        englishTranslation[0]= "one";
        englishTranslation[1]= "two";
        englishTranslation[2]= "three";
        englishTranslation[3]= "four";
        englishTranslation[4]= "five";
        englishTranslation[5]= "six";
        englishTranslation[6]= "seven";
        englishTranslation[7]= "eight";
        englishTranslation[8]= "nine";
        englishTranslation[9]= "ten";

        Log.v("NumbersActivity", "Word at index 0: " + englishTranslation[0]);
        Log.v("NumbersActivity", "Word at index 1: " + englishTranslation[1]);


        String[] miwokTranslation = new String[10];
        miwokTranslation[0]= "lutti";
        miwokTranslation[1]= "otiiko";
        miwokTranslation[2]= "tolookosu";
        miwokTranslation[3]= "oyyisa";
        miwokTranslation[4]= "massokka";
        miwokTranslation[5]= "temmokka";
        miwokTranslation[6]= "kenekaku";
        miwokTranslation[7]= "kawintta";
        miwokTranslation[8]= "wo'e";
        miwokTranslation[9]= "na'aacha";
    }
}
