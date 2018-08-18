package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = ColorAdapter.class.getSimpleName();

    public ColorAdapter(Activity context, ArrayList<Word> colorsName) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, colorsName);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }
        Word currentPosition = getItem(position);

        TextView miwokText = (TextView) listItemView.findViewById(R.id.textView1);
        miwokText.setText(currentPosition.getMiwokTranslation());

        TextView defaultText = (TextView) listItemView.findViewById(R.id.textView2);
        defaultText.setText(currentPosition.getDefaultTranslation());

        return listItemView;

    }
}