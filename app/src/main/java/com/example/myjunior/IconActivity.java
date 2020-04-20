package com.example.myjunior;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IconActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bt_change;
    private int index = 0;
    private Drawable drawable;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_icon);
        bt_change = findViewById(R.id.bt_change);
        bt_change.setOnClickListener(this);
        drawable = getResources().getDrawable(R.mipmap.ic_launcher);
        //必须设置大小，否则不显示
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
    }
    @Override
    public void onClick(View v) {
        switch (index){
            case 0:
                bt_change.setCompoundDrawables(null,drawable,null,null);
                break;
            case 1:
                bt_change.setCompoundDrawables(null,null,null,drawable);
                break;
            case 2:
                bt_change.setCompoundDrawables(drawable,null,null,null);
                break;
            case 3:
                bt_change.setCompoundDrawables(null,null,drawable,null);
                break;
        }
        if(index == 3)
            index = 0;
        index++;
    }
}
