package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
    }
    private String input;

    public void disable(View v){
        View myView = findViewById(R.id.button1);
        myView.setEnabled(false);
        Button button = (Button)myView;

        if(input==null){
            button.setText(button.getText());
        }else{
            button.setText(input);
        }
    }

    public void handleText(View v){
        EditText t = findViewById(R.id.source);
        input = t.getText().toString();
        ((TextView)findViewById(R.id.ouput)).setText(input);
        Toast.makeText(this, input, Toast.LENGTH_LONG).show();

        Log.d("info123",input);
    }

    public void launchReview(View v){
        //launch a new activity
        Intent i = new Intent(this, ReviewActivity.class);
        String msg = ((EditText)findViewById(R.id.editText)).getText().toString();
        i.putExtra("COOL", msg);
        startActivity(i);
    }

}
