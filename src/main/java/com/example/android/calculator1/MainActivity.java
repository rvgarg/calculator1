package com.example.android.calculator1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txt;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, clr, rslt, per, ad, sub, mul, div, pow, b0, bkspc;
    private char ch;
    private int a = 0, b = 0;

    private void socl() {
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        rslt.setOnClickListener(this);
        clr.setOnClickListener(this);
        ad.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        pow.setOnClickListener(this);
        bkspc.setOnClickListener(this);
        per.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.display);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        clr = findViewById(R.id.clear);
        rslt = findViewById(R.id.ans);
        per = findViewById(R.id.per);
        ad = findViewById(R.id.add);
        sub = findViewById(R.id.subtract);
        mul = findViewById(R.id.multiply);
        div = findViewById(R.id.divide);
        pow = findViewById(R.id.pow);
        bkspc = findViewById(R.id.backspace);
        socl();
    }

    private void getval() {
        b = Integer.parseInt(txt.getText().toString());
    }

    private void cal() {
        switch (ch) {
            case '+':
                a = a + b;
                break;
            case '-':
                a = a - b;
                break;
            case '*':
                a = a * b;
                break;
            case '/':
                a = a / b;
                break;
            case '%':
                a = a % b;
                break;
            case '^':
                a = (int) Math.pow(a, b);
                break;
            default:
                a = b;
        }
    }

    private void clr() {
        txt.setText("");
    }

    private void disp() {
        txt.setText("" + a);
    }

    private void reset() {
        a = 0;
        b = 0;
        ch = '\0';
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add:
                getval();
                cal();
                clr();
                ch = '+';
                break;
            case R.id.subtract:
                getval();
                cal();
                clr();
                ch = '-';
                break;
            case R.id.multiply:
                getval();
                cal();
                clr();
                ch = '*';
                break;
            case R.id.divide:
                getval();
                cal();
                clr();
                ch = '/';
                break;
            case R.id.pow:
                getval();
                cal();
                clr();
                ch = '^';
                break;
            case R.id.per:
                getval();
                cal();
                clr();
                ch = '%';
                break;
            case R.id.ans:
                getval();
                cal();
                disp();
                ch = '\0';
                break;
            case R.id.b1:
                txt.append("1");
                break;
            case R.id.b2:
                txt.append("2");
                break;
            case R.id.b3:
                txt.append("3");
                break;
            case R.id.b4:
                txt.append("4");
                break;
            case R.id.b5:
                txt.append("5");
                break;
            case R.id.b6:
                txt.append("6");
                break;
            case R.id.b7:
                txt.append("7");
                break;
            case R.id.b8:
                txt.append("8");
                break;
            case R.id.b9:
                txt.append("9");
                break;
            case R.id.b0:
                txt.append("0");
                break;
            case R.id.clear:
                clr();
                reset();
                break;
            case R.id.backspace:
                String str = txt.getText().toString();
                int l = str.length();
                if (l != 0)
                    txt.setText("" + str.substring(0, l - 1));
                else
                    txt.setText("");
        }

    }
}
