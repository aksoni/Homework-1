package com.example.abhi.grammyquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Method to start question activity after pressing Play
    public void onClickPlay (View view)
    {
        Intent intent = new Intent(this, QuestionActivity.class);
        startActivity(intent);
    }
}
