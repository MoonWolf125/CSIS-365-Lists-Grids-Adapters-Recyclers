package com.msum.csis365.gridview;

import android.content.Context;
import android.widget.ArrayAdapter;

public class ColorAdapter extends ArrayAdapter<String> {
    public ColorAdapter(Context context) {
        super(
                context,
                android.R.layout.simple_list_item_1,
                context.getResources().getStringArray(R.array.colorNames));
    }
}
