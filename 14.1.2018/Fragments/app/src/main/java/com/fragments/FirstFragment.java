package com.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by maayanpolitzer on 14/01/2018.
 */

public class FirstFragment extends Fragment {

    private TextView textView;

    public FirstFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(
                R.layout.fragment_first,
                container,
                false
        );

        textView = (TextView) view.findViewById(R.id.text);

        textView.setText(getArguments().getString(MainActivity.TEXT));

        /*
        String text = getArguments().getString(MainActivity.TEXT);
        textView.setText(text);
        */

        return view;
    }


}
