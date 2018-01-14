package com.fragments;

import android.app.DialogFragment;
import android.app.Fragment;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "onCreate()");

        textView = (TextView) findViewById(R.id.activity_text);

        FirstFragment fragment = (FirstFragment) getFragmentManager().findFragmentById(R.id.fragment);
        fragment.changeText("working!!!");

    }

    public void changeActivityColor(String color){
        textView.setTextColor(Color.parseColor(color));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "onStart()");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy()");

    }
}
