package com.example.myjunior;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CalculateActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_result;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_calculate);
        (findViewById(R.id.bt_zero)).setOnClickListener(this);
        (findViewById(R.id.bt_one)).setOnClickListener(this);
        (findViewById(R.id.bt_two)).setOnClickListener(this);
        (findViewById(R.id.bt_three)).setOnClickListener(this);
        (findViewById(R.id.bt_four)).setOnClickListener(this);
        (findViewById(R.id.bt_five)).setOnClickListener(this);
        (findViewById(R.id.bt_six)).setOnClickListener(this);
        (findViewById(R.id.bt_seven)).setOnClickListener(this);
        (findViewById(R.id.bt_eight)).setOnClickListener(this);
        (findViewById(R.id.bt_nine)).setOnClickListener(this);
        (findViewById(R.id.bt_add)).setOnClickListener(this);
        (findViewById(R.id.bt_sub)).setOnClickListener(this);
        (findViewById(R.id.bt_mul)).setOnClickListener(this);
        (findViewById(R.id.bt_div)).setOnClickListener(this);
        (findViewById(R.id.bt_point)).setOnClickListener(this);
        (findViewById(R.id.bt_equal)).setOnClickListener(this);
        tv_result = findViewById(R.id.tv_result);
    }

    private String firstNum = "";
    private String operator = "";
    private String secondNum = "";
    private String result = "";
    private String showText = "";

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.bt_add || id == R.id.bt_sub || id == R.id.bt_mul || id == R.id.bt_div){
            if (firstNum.equals("")) {
                Toast.makeText(this,"请输入操作数",Toast.LENGTH_SHORT).show();
            }else{
                operator = ((TextView)v).getText().toString();
                showText += operator;
            }
        } else if (id == R.id.bt_equal) {
            switch (operator){
                case "+":
                    result = String.valueOf(Double.valueOf(firstNum) + Double.valueOf(secondNum));
                    break;
                case "-":
                    result = String.valueOf(Double.valueOf(firstNum) - Double.valueOf(secondNum));
                    break;
                case "x":
                    result = String.valueOf(Double.valueOf(firstNum) * Double.valueOf(secondNum));
                    break;
                case "/":
                    result = String.valueOf(Double.valueOf(firstNum) / Double.valueOf(secondNum));
                    break;
            }
            showText += "=" +result;

            firstNum = result;
            operator = "";
            secondNum = "";
            result = "";

        }else{
            if(operator.equals("")){
                firstNum += ((TextView)v).getText().toString();
                showText += ((TextView)v).getText().toString();
            }else{
                secondNum += ((TextView)v).getText().toString();
                showText += ((TextView)v).getText().toString();
            }
        }

        tv_result.setText(showText);

    }


}
