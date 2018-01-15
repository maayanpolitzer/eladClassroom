package com.fragments;

import android.app.Fragment;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String TEXT = "text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.edit_text);

        findViewById(R.id.changeTextBtn).setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirstFragment f = new FirstFragment();

                Bundle bundle = new Bundle();
                bundle.putString(TEXT, editText.getText().toString());

                f.setArguments(bundle);

                getFragmentManager()
                        .beginTransaction()
                        .add(R.id.fragment_container, f)
                        .commit();

            }
        });

    }
}
