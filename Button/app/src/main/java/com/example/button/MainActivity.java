package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed_id;
    Button but_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_id = findViewById(R.id.ed_id);
        but_test = findViewById(R.id.but_test);

        but_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed_id.setText("제운");
            }
        });


    }
}