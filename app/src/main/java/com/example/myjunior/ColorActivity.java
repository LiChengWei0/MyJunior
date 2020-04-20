package com.example.myjunior;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ColorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_color);
        TextView tv_six = findViewById(R.id.tv_six);
        TextView tv_eight = findViewById(R.id.tv_eight);
        //设置6位的，是透明的，所以代码中看不见
        tv_six.setBackgroundColor(0x0000ff);
        tv_eight.setBackgroundColor(0x990000ff);
    }
}
