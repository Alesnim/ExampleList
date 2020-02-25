package com.itschool.examplelist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter extends ArrayAdapter<String> {

    public MyAdapter(@NonNull Context context,  @NonNull String[] objects) {
        super(context, R.layout.list_item_two, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final  String name = (String) getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_two, null);
        }
        ((TextView) convertView.findViewById(R.id.tw_name)).setText(name);

        ((ImageView) convertView.findViewById(R.id.iv_item)).setImageResource(R.drawable.cat_image);

        return convertView;
    }
}
