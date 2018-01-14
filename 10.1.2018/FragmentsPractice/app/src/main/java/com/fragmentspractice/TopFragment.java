package com.fragmentspractice;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by maayanpolitzer on 10/01/2018.
 */

public class TopFragment extends Fragment {

    private OnButtonClickListener listener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top,
                container, false);

        view.findViewById(R.id.btn).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        listener.changeText("WOW Worked!");
                    }
                }
        );

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (OnButtonClickListener) context;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        listener = (OnButtonClickListener) activity;
    }
}
