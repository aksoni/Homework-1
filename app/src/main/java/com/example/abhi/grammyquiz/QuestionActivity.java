package com.example.abhi.grammyquiz;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_question);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, QuestionFragment.newInstance())
                .addToBackStack(null)
                .commit();


    }

    public void onClickNext (View view)
    {
        getFragmentManager().popBackStack();
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, ImageFragment.newInstance())
                .addToBackStack(null)
                .commit();
    }

    Intent intent = getIntent();


}
