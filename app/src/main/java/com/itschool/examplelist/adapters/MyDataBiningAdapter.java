package com.itschool.examplelist.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.itschool.examplelist.cats.Cat;
import com.itschool.examplelist.databinding.ListItemThreeBinding;

import java.util.ArrayList;

public class MyDataBiningAdapter<Cat extends com.itschool.examplelist.cats.Cat> extends BaseAdapter {
    private ArrayList<Cat> mData;
    private LayoutInflater mLayout;


    public MyDataBiningAdapter(ArrayList<Cat> data) {
        mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View res = null;
        ListItemThreeBinding binding;
        if (res == null) {
            if (mLayout == null) {
                mLayout = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            }
            binding = ListItemThreeBinding.inflate(mLayout, parent, false);
            res = binding.getRoot();
            res.setTag(binding);
        }
        else {
            binding = (ListItemThreeBinding) res.getTag();
        }
        binding.setCat(mData.get(position));
        return res;
    }
}
