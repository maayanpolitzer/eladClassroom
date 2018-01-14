package com.fragmentspractice;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnButtonClickListener {

    private BottomFragment bottomFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomFragment = (BottomFragment) getFragmentManager().findFragmentById(R.id.bottom);

    }

    @Override
    public void changeText(String text) {
        bottomFragment.change(text);
    }
}
