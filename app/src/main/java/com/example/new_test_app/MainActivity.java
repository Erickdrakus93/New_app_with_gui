package com.example.new_test_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaRecorder;
import android.view.View;
// The last example is for the main buttons with our layer architecture in the app
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Here we can create the next lines of the code
        Button button = (Button) findViewById(R.id.bottom);

        //  Here we have to register the main activity as we can see in the next lines of the code
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Here we can put some activity in the next part of the code
            }
        });

    }
    private void load_Persons(View view){
        // Here is the main method
    }



}
