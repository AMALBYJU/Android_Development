package com.example.android.miwok;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class WordArrayAdapter extends ArrayAdapter<WordArrayElement>
{
    int bgColorId;
    private LayoutInflater layoutinf; // Arbitrarily made private, more secure

    public WordArrayAdapter(@NonNull Context context, @NonNull List<WordArrayElement> objects,int bgId) {
        super(context,0, objects);
        // To create layoutinflater in activity, use getLayoutInflater()
        // If context is given, use getSystemService()
        layoutinf = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        bgColorId = bgId;
    }

    // Editing the getView() method


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null)
        {
            // Create a view with LayoutInflater
            convertView = layoutinf.inflate(R.layout.list_item,parent,false);
        }

        // Assigning values to 2 textviews in convertView

        WordArrayElement n = getItem(position);

        TextView miwok_number = (TextView)convertView.findViewById(R.id.miwok_number);
        TextView eng_number = (TextView)convertView.findViewById(R.id.eng_number);
        LinearLayout textContainer = (LinearLayout)convertView.findViewById(R.id.textContainer);
        ImageView icon = (ImageView)convertView.findViewById(R.id.icon);

        miwok_number.setText(n.miwTranslation);
        eng_number.setText(n.defTranslation);

        int color = ContextCompat.getColor(getContext(),bgColorId);
        textContainer.setBackgroundColor(color);

        if(n.iconId != -1)
            icon.setImageResource(n.iconId);
        else
            icon.setVisibility(icon.GONE);
        return convertView;
    }
}
