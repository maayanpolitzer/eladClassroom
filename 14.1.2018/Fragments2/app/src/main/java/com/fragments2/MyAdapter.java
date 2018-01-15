package com.fragments2;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by maayanpolitzer on 14/01/2018.
 */

public class MyAdapter extends ArrayAdapter {

    private String[] arr;
    private Context context;

    public MyAdapter(Context context, String[] arr){
        super(context, R.layout.list_item, arr);
        this.context = context;
        this.arr = arr;
    }

    private class ViewHolder {

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TextView textView = null;
        Log.d("TAG", "convertView = " + convertView);
        if(convertView == null){
            // inflate...
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.list_item, parent, false);
            textView = (TextView) convertView.
                    findViewById(R.id.list_item_text_view);
            convertView.setTag(textView);
        }else{
            // recycled...
            textView = (TextView) convertView.getTag();
        }

        textView.setText(arr[position]);

        return convertView;
    }
}
