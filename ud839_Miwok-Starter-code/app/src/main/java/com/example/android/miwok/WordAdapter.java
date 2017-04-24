package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by wasif on 24-03-2017.
 */
public class WordAdapter extends ArrayAdapter<Word> {


    private int mColorResourceId;


    public WordAdapter(Context context,List<Word> objects, int colorResourceId) {
        super(context, 0, objects);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        if(listView==null)
        {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView def = (TextView) listView.findViewById(R.id.default_text_view);
        def.setText(currentWord.getDefaultTranslation());

        TextView miwok = (TextView) listView.findViewById(R.id.miwok_text_view);
        miwok.setText(currentWord.getMiwokTranslation());

        ImageView image = (ImageView) listView.findViewById(R.id.img);
        if((currentWord.hasImage())) {
            image.setImageResource(currentWord.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        }
        else
            image.setVisibility(View.GONE);

        View textContainer = listView.findViewById(R.id.container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listView;
    }
}
