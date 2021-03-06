package com.example.abhi.grammyquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        //Display result TextViews dynamically
        LinearLayout layout=(LinearLayout)findViewById(R.id.answers);
        TextView result1 = new TextView(this);
        result1.setText("Question 1: " + QuestionActivity.getResult1());
        layout.addView(result1);
        TextView result2 = new TextView(this);
        result2.setText("Question 2: " + QuestionActivity.getResult2());
        layout.addView(result2);
    }

    //Method to start app from beginning after pressing Restart button
    public void onClickRestart (View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    //Method to close app after pressing Quit Button
    public void onClickQuit (View view)
    {
        this.finishAffinity();
    }
}
