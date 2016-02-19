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
import android.widget.EditText;
import android.widget.RadioButton;

public class QuestionActivity extends AppCompatActivity {

    static String result1 = null;
    static String result2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_question);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, ImageQuestionFragment.newInstance())
                .addToBackStack(null)
                .commit();


    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.paul_simon:
                if (checked)
                    result2 = "Incorrect. The correct answer was Fleetwood Mac.";
                    break;
            case R.id.marvin_gaye:
                if (checked)
                    result2 = "Incorrect. The correct answer was Fleetwood Mac.";
                    break;
            case R.id.pink_floyd:
                if (checked)
                    result2 = "Incorrect. The correct answer was Fleetwood Mac.";
                    break;
            case R.id.fleetwood:
                if (checked)
                    result2 = "Correct!";
                    break;
        }
    }

    public void onClickSubmit (View view)
    {
        EditText editText = (EditText) findViewById(R.id.year_submission);
        String message = editText.getText().toString();

        if(message.equals("1974")==true)
        {
            result1 = "Correct!";
        }
        else
        {
            result1 = "Incorrect. The correct answer was 1974.";
        }

        getFragmentManager().popBackStack();
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, TextQuestionFragment.newInstance())
                .addToBackStack(null)
                .commit();


    }

    public void onClickFinish (View view)
    {
        Intent intent = new Intent(this, ResultsActivity.class);
        startActivity(intent);
    }

    Intent intent = getIntent();

    public static String getResult1()
    {
        return result1;
    }

    public static String getResult2()
    {
        return result2;
    }



}
