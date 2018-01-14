package com.fragmentspractice;

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

public class BottomFragment extends Fragment {

    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(
                R.layout.fragment_bottom, container, false
        );

        textView = (TextView) view.findViewById(R.id.textView);

        return view;
    }

    public void change(String text){
        textView.setText(text);
    }

}
