package com.msum.csis365.gridview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private GridView gvExample;
    private String[] exampleNames = {"Kyle", "Aishat", "Nathan", "Chris", "Jake", "Ben", "Peter"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain and assign the ListView with Id lv_example in the layout activity_main
        gvExample = findViewById(R.id.gv_example);

        // Create a generic ArrayAdapter
        ArrayAdapter exampleAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, exampleNames);

        // Assign exampleAdapter to lvExample
        gvExample.setAdapter(exampleAdapter);
    }
}
