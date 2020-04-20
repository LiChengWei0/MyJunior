package com.example.myjunior;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myjunior.Utils.DisplayUtil;

public class ScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_screen);

        TextView textView = findViewById(R.id.tv_screen);
        int width = DisplayUtil.getScreenWidth(this);
        int height = DisplayUtil.getScreenHeight(this);
        float density = DisplayUtil.getScreenDensity(this);
        String result = String.format("屏幕宽%dpx，高%dpx，密度%f", width, height, density);
        textView.setText(result);
    }
}
