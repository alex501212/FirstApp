package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class send_email extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email);
    }
    public void composeMessage(View v)
    {
        Intent i = new Intent(this,ComposeMessageActivity.class);
        String name = ((Button)v).getText().toString();
        i.putExtra("NAME", name);
        startActivity(i);

    }
}

