package com.msum.csis365.gridview;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class ExampleAdapter extends ArrayAdapter<String> {
    public ExampleAdapter(@NonNull Context context, int resource, @NonNull String[] objects) {
        super(context, resource, objects);
    }
}
