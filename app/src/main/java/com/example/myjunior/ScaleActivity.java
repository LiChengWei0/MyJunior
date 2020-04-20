package com.example.myjunior;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ScaleActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView iv_apple;
    private int index = 0;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_scale);
        iv_apple = findViewById(R.id.iv_apple);
        iv_apple.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (index){
            case 0:
                iv_apple.setScaleType(ImageView.ScaleType.FIT_XY);
                break;
            case 1:
                iv_apple.setScaleType(ImageView.ScaleType.FIT_START);
                break;
            case 2:
                iv_apple.setScaleType(ImageView.ScaleType.FIT_CENTER);
                break;
            case 3:
                iv_apple.setScaleType(ImageView.ScaleType.FIT_END);
                break;
            case 4:
                iv_apple.setScaleType(ImageView.ScaleType.CENTER);
                break;
            case 5:
                iv_apple.setScaleType(ImageView.ScaleType.CENTER_CROP);
                break;
            case 6:
                iv_apple.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                break;
        }
        if(index == 6)
            index = 0;

        index ++;
    }
}
