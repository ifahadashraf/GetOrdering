package com.dev.androidapp.view.adapters;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.androidapp.R;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CheckBoxAdapter extends BaseAdapter {

    Context mContext;
    List<String> itemsList;

    public CheckBoxAdapter(Context context, List<String> itemsList) {

        this.mContext = context;
        this.itemsList = itemsList;
    }

    @Override
    public int getCount() {
        return itemsList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null)
        {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.checkbox_item, parent, false);
        }

        TextView cb = convertView.findViewById(R.id.itemId);
        cb.setText(itemsList.get(position).toString());

        return convertView;
    }
}