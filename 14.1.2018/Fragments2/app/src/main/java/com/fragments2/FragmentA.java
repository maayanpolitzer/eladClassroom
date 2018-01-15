package com.fragments2;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by maayanpolitzer on 14/01/2018.
 */

public class FragmentA extends Fragment {

    private Context context;
    private String[] arr = {"a","b","c","d","e","f","g","h","i","j","k","l"};
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        if(view == null) {
            view = inflater.inflate(R.layout.a_fragment,
                    container,
                    false
            );

            ListView listView = (ListView) view.findViewById(R.id.list_view);
            MyAdapter adapter = new MyAdapter(context, arr);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    String text = arr[position];
                    ((OnRowClick) context).onClick(text);
                }
            });

        }
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        context = activity;
    }
}
