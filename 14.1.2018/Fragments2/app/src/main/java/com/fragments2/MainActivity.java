package com.fragments2;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnRowClick {

    public static final String TEXT = "text";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        launchFragment(new FragmentA(),false,false);


    }

    private void launchFragment(Fragment fragment,
                                boolean addToBackStack, boolean animate) {
        FragmentTransaction transaction = getFragmentManager()
                .beginTransaction();
        if(addToBackStack){
            transaction.addToBackStack(null);
        }
        if(animate){
            transaction.setCustomAnimations(
                    R.animator.slide_in_from_right,
                    R.animator.slide_out_to_left,
                    R.animator.slide_in_from_left,
                    R.animator.slide_out_to_right
            );
        }
        transaction.replace(R.id.container, fragment)
                .commit();
    }

    @Override
    public void onClick(String text) {
        // TODO: 14/01/2018 create fragment.
        Fragment fragment = new FragmentB();
        // TODO: 14/01/2018 text  - setArguments()
        Bundle bundle = new Bundle();
        bundle.putString(TEXT, text);
        fragment.setArguments(bundle);
        // TODO: 14/01/2018 display fragment.
        launchFragment(fragment, true,true);

    }

    /*
    @Override
    public void onBackPressed() {
        if(getFragmentManager().getBackStackEntryCount() > 0){
            getFragmentManager().popBackStack();
        }else{
            super.onBackPressed();
        }
    }
    */
}
