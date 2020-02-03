package com.msum.csis365.gridview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private GridView gvExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain and assign the GridView with Id gv_example in the layout activity_main
        gvExample = findViewById(R.id.gv_example);

        // Create a generic ArrayAdapter
        ExampleAdapter exampleAdapter = new ExampleAdapter(
                this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.colorNames));

        // Assign exampleAdapter to gvExample
        gvExample.setAdapter(exampleAdapter);
    }
}
