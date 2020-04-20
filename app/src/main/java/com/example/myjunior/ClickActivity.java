package com.example.myjunior;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ClickActivity extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener {

    private Button bt_click;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_click);

        bt_click = findViewById(R.id.bt_click);
        bt_click.setOnClickListener(this);
        bt_click.setOnLongClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Toast.makeText(this,"点击",Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onLongClick(View v) {
        Toast.makeText(this,"长按",Toast.LENGTH_SHORT).show();
        return false;
    }
}
