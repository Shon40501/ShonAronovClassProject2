package com.example.shonaronovclassproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button bt;
    int counter = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.bt1);
        bt.setText("Click me");
        bt.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                counter += 1;
                bt.setText("This is a click number : " + counter);
            }
        });


    }
}