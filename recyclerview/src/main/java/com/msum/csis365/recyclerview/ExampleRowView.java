package com.msum.csis365.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ExampleRowView extends FrameLayout {

    private ImageView ivColor;
    private TextView tvData;

    public ExampleRowView(@NonNull Context context) {
        super(context);
        setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        // Inflate the custom layout and assign the view to the class-level variable
        inflate(context, R.layout.view_example_row, this);
        ivColor = findViewById(R.id.iv_color);
        tvData = findViewById(R.id.tv_data);
    }

    public ExampleRowView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        // Inflate the custom layout and assign the view to the class-level variable
        inflate(context, R.layout.view_example_row, this);
        ivColor = findViewById(R.id.iv_color);
        tvData = findViewById(R.id.tv_data);
    }

    public ExampleRowView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        // Inflate the custom layout and assign the view to the class-level variable
        inflate(context, R.layout.view_example_row, this);
        ivColor = findViewById(R.id.iv_color);
        tvData = findViewById(R.id.tv_data);
    }

    // Set the data to tvData
    public void setup(int position) {
        ivColor.setBackgroundColor(getResources().getIntArray(R.array.colorCodes)[position]);
        tvData.setText(getResources().getStringArray(R.array.colorNames)[position]);
    }
}
