package com.msum.csis365.recyclerview;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ViewHolder> {

    // The data items the adapter will iterate over
    private int arrayLength;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Creates and stores an ExampleRowView in the ViewHolder
        return new ViewHolder(new ExampleRowView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Passes the corresponding data to the ExampleRowView in the ViewHolder
        holder.rowView.setup(position);
    }

    @Override
    public int getItemCount() {
        // Returns how many data items are in the list
        return arrayLength;
    }

    public void setDataItems(int arrayLength) {
        // Assigns the new length of data items into the class-level variable
        this.arrayLength = arrayLength;

        // Tells the Adapter to refresh/redraw itself
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        // Inner-class-level of the ExampleRowView to be setup
        ExampleRowView rowView;

        ViewHolder(@NonNull ExampleRowView itemView) {
            super(itemView);

            // Assigns the ExampleRowView into the inner-class-level variable
            rowView = itemView;
        }
    }
}
