package com.msum.csis365.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvExample;
    private ExampleAdapter exampleAdapter;
    private String[] exampleNames = {"Kyle", "Aishat", "Nathan", "Chris", "Jake", "Ben", "Peter", "Andrew"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain and assign the RecyclerView with Id rv_example in the layout activity_main
        rvExample = findViewById(R.id.rv_example);

        // Create an ExampleAdapter and assign it to the class-level variable
        exampleAdapter = new ExampleAdapter();

        // Set the LayoutManager for rvExample
        rvExample.setLayoutManager(new LinearLayoutManager(this));
//        rvExample.setLayoutManager(new GridLayoutManager(this, 4));

        // Assign exampleAdapter to rvExample
        rvExample.setAdapter(exampleAdapter);

        // Set the exampleNames to the exampleAdapter
        exampleAdapter.setDataItems(exampleNames);
    }
}
