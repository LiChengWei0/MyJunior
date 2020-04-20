package com.example.myjunior;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myjunior.Utils.DateUtil;

public class BbsActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_bbs;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_bbs);

        tv_bbs = findViewById(R.id.tv_bbs);
        tv_bbs.setMaxLines(8);
        tv_bbs.setGravity(Gravity.LEFT|Gravity.BOTTOM);
        tv_bbs.setLines(8);
        tv_bbs.setMovementMethod(new ScrollingMovementMethod());
        tv_bbs.setOnClickListener(this);
    }

    private String[] mCharStr = {"今天你吃了没","昨天你吃了没","前天你吃了没","大前天你吃了没"};
    @Override
    public void onClick(View v) {
        String result = String.format(tv_bbs.getText().toString()+"\n"+DateUtil.getNowTime()+mCharStr[(int)(Math.random()*10%4)]);
        tv_bbs.setText(result);
    }
}
