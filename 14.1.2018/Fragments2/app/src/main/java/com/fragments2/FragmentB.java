package com.fragments2;

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

public class FragmentB extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.b_fragment,
                container,
                false
        );
        TextView textView = (TextView) view.findViewById(R.id.b_text_view);
        String text = getArguments().getString(MainActivity.TEXT);

        textView.setText(text);

        return view;
    }
}
