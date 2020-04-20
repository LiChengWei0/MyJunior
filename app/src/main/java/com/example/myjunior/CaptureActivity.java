package com.example.myjunior;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myjunior.Utils.DateUtil;

public class CaptureActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView iv_right;
    private Button bt_left;
    private Button bt_right;
    private TextView tv_left;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_capture);
        iv_right = findViewById(R.id.iv_right);
        tv_left = findViewById(R.id.tv_left);
        tv_left.setMaxLines(8);
        tv_left.setGravity(Gravity.LEFT|Gravity.BOTTOM);
        tv_left.setLines(8);
        tv_left.setMovementMethod(new ScrollingMovementMethod());
        (findViewById(R.id.bt_left)).setOnClickListener(this);
        (findViewById(R.id.bt_right)).setOnClickListener(this);
    }

    private String[] mCharStr = {"今天你吃了没","昨天你吃了没","前天你吃了没","大前天你吃了没"};
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bt_left) {
            String result = String.format(tv_left.getText().toString()+"\n"+ DateUtil.getNowTime()+mCharStr[(int)(Math.random()*10%4)]);
            tv_left.setText(result);
        }else{
            Bitmap bitmap = tv_left.getDrawingCache();
            iv_right.setImageBitmap(bitmap);
            mhandler.postDelayed(mResetCatch, 200);
        }
    }

    private Handler mhandler = new Handler();

    private Runnable mResetCatch = new Runnable() {
        @Override
        public void run() {
            tv_left.setDrawingCacheEnabled(false);
            tv_left.setDrawingCacheEnabled(true);
        }
    };
}
