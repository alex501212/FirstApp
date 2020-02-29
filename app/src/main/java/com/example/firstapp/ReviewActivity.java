package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        Intent i = getIntent();
        String msg = i.getStringExtra("COOL");
        ((TextView)findViewById(R.id.textView)).setText(msg);
    }

    public void MainActivity(View v){
        //launch a new activity
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
