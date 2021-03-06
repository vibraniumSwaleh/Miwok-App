package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaMetadata;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>{

    private int mColorResourceId;

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Word> numbersName, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, numbersName);
        mColorResourceId = colorResourceId;
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

        ImageView miwokImage = (ImageView) listItemView.findViewById(R.id.image);
        if(currentPosition.hasImage()) {
            miwokImage.setImageResource(currentPosition.getImageResourceId());
            miwokImage.setVisibility(View.VISIBLE);
        }else {
            miwokImage.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;

    }

}