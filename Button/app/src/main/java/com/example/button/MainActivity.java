package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed_id;
    Button but_test;
    EditText ed_ps;
    Button but_test2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_id = findViewById(R.id.ed_id);
        but_test = findViewById(R.id.but_test);
        ed_ps = findViewById(R.id.ed_ps);
        but_test2 = findViewById(R.id.but_test2);

        but_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ed_id.setText("제운");
                ed_ps.setText("*****");
            }
        });


    }
}