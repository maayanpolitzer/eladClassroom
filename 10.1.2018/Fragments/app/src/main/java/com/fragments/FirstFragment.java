package com.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by maayanpolitzer on 10/01/2018.
 */

public class FirstFragment extends Fragment {

    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(
                R.layout.fragment_first,container,false);

        textView = (TextView) view.findViewById(R.id.tv);
        view.findViewById(R.id.btn_color).setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).changeActivityColor("#ff0000");
            }
        });

        return view;
    }

    public void changeText(String text){
        textView.setText(text);
    }

}
