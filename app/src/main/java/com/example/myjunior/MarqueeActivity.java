package com.example.myjunior;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MarqueeActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tv_marquee;
    private boolean bPause;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_marquee);
        tv_marquee = findViewById(R.id.tv_marquee);
        tv_marquee.setOnClickListener(this);
        bPause = false;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.tv_marquee){
            bPause = !bPause;
            if(bPause == true){
                tv_marquee.setFocusable(false);
                tv_marquee.setFocusableInTouchMode(false);
            }else{
                tv_marquee.setFocusable(true);
                tv_marquee.setFocusableInTouchMode(true);
            }
        }
    }
}
