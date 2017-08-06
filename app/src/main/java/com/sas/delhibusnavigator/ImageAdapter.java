package com.sas.delhibusnavigator;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Kashish on 8/6/2017.
 */

public class ImageAdapter extends BaseAdapter {

    private static LayoutInflater inflater = null;
    int imageBackground;
    Integer[] pics;
    String[] names;
    private Activity activity;

    public ImageAdapter(Activity a, Integer[] pic, String[] s) {
        activity = a;
        pics=pic;
        names=s;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return pics.length;
    }

    @Override
    public Object getItem(int arg0) {
        return arg0;
    }

    @Override
    public long getItemId(int arg0) {
        return arg0;
    }

    @Override
    public View getView(int arg0, View arg1, ViewGroup arg2) {
        View vi = arg1;
        if(arg1==null){
            vi = inflater.inflate(R.layout.tourism, null);
        }
        TextView name = (TextView) vi.findViewById(R.id.name);
        ImageView img = (ImageView) vi.findViewById(R.id.list_image);
        name.setText(names[arg0]);
        img.setImageResource(pics[arg0]);
        return vi;
    }
}