package com.example.yuka.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int num =0;
    Button mPlusButton;
    Button mMinusButton;
    TextView mCounterText;

    //System.out.println(printしたい内容)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPlusButton = (Button) findViewById(R.id.plus_button);
        mMinusButton = (Button) findViewById(R.id.minus_button);
        mCounterText = (TextView) findViewById(R.id.counter_text);
        mPlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num++;
                mCounterText.setText(String.valueOf(num));
            }
        });
        mMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num--;
                mCounterText.setText(String.valueOf(num));
            }
        });
    }
}
