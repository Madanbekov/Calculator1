package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private TextView tvResult;
private Float first,second;
private Boolean isClick = false;
private String operations;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_Result);
        }

    public void onClickNumber(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("1");
                } else tvResult.append("1");
                if (isClick) {
                    tvResult.setText("1");
                }isClick = false;
                break;
            case R.id.btn_two:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("2");
                } else tvResult.append("2");
                if (isClick) {
                    tvResult.setText("2");
                }isClick = false;
                break;
            case R.id.btn_tri:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("3");
                } else tvResult.append("3");
                if (isClick) {
                    tvResult.setText("3");
                }isClick = false;
                break;
            case R.id.btn_four:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("4");
                } else tvResult.append("4");
                if (isClick) {
                    tvResult.setText("4");
                }isClick = false;
                break;
            case R.id.btn_five:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("5");
                } else tvResult.append("5");
                if (isClick) {
                    tvResult.setText("5");
                }isClick = false;
                break;
            case R.id.btn_six:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("6");
                } else tvResult.append("6");
                if (isClick) {
                    tvResult.setText("6");
                }isClick = false;
                break;
            case R.id.btn_sem:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("7");
                } else tvResult.append("7");
                if (isClick) {
                    tvResult.setText("7");
                }isClick = false;
                break;
            case R.id.btn_segis:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("8");
                } else tvResult.append("8");
                if (isClick) {
                    tvResult.setText("8");
                }isClick = false;
                break;
            case R.id.btn_nine:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("9");
                } else tvResult.append("9");
                if (isClick) {
                    tvResult.setText("9");
                }
                isClick = false;
                break;
            case R.id.btn_noll:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("0");
                } else tvResult.append("0");
                if (isClick) {
                    tvResult.setText("0");
                }
                isClick = false;
                break;
            case R.id.btn_clean:
                tvResult.setText("0");
                break;
            case R.id.btn_tochka:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText(".");
                } else {
                    tvResult.append(".");
                    if (isClick){
                        tvResult.setText(".");
                    }
                }
        }
        isClick = false;
    }

    public void onClickOperation(View view) {
            switch (view.getId()) {
                case R.id.btn_plus:
                    first = Float.parseFloat(tvResult.getText().toString());
                    operations = "+";
                    isClick = true;
                    break;
                case R.id.btn_multyply:
                    first = Float.parseFloat(tvResult.getText().toString());
                    operations = "*";
                    isClick = true;
                    break;
                case R.id.btn_drob:
                    first = Float.parseFloat(tvResult.getText().toString());
                    operations = "/";
                    isClick = true;
                    break;
                case R.id.btn_minus:
                    first = Float.parseFloat(tvResult.getText().toString());
                    operations = "-";
                    isClick = true;
                    break;


                case R.id.btn_procent:
                    first = Float.parseFloat(tvResult.getText().toString());
                    operations = "%";
                    isClick = true;
                    break;
                case R.id.btn_ravno:
                    second = Float.parseFloat(tvResult.getText().toString());
                    Float res = 0.0f;
                    switch (operations) {
                        case "+":
                            res = first + second;
                            break;
                        case "*":
                            res = first * second;
                            break;
                        case "/":
                            res = first / second;
                            break;
                        case "-":
                            res = first - second;
                            break;
                        case "%":
                            first = Float.parseFloat(tvResult.getText().toString());
                            isClick = true;
                            res = first / 100 ;
                            tvResult.setText((res.toString()));
                            break;

                    }
                    tvResult.setText(res.toString());
                    isClick = true;
                    break;
            }
    }
}