package com.msum.csis365.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.msum.csis365.list_view.R;

public class MainActivity extends AppCompatActivity {

    private ListView lvExample;
    private String[] exampleNames = {"Red", "Orange", "Yellow", "Chartreuse Green", "Green", "Spring Green", "Cyan", "Azure", "Blue", "Violet", "Magenta", "Rose"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain and assign the ListView with Id lv_example in the layout activity_main
        lvExample = findViewById(R.id.lv_example);

        // Create a generic ArrayAdapter
        ArrayAdapter exampleAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, exampleNames);

        // Assign exampleAdapter to lvExample
        lvExample.setAdapter(exampleAdapter);
    }
}
