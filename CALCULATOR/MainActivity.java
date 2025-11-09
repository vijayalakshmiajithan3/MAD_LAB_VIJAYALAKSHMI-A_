package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, dot, zero, clear, add, sub, div, mul, eql;
    EditText edit1;

    float mValueOne, mValueTwo;
    boolean addOp, subOp, mulOp, divOp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        dot = findViewById(R.id.dot);
        zero = findViewById(R.id.zero);
        clear = findViewById(R.id.clear);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        eql = findViewById(R.id.eql);
        edit1 = findViewById(R.id.edit1);

      
        View.OnClickListener numberClickListener = v -> {
            Button b = (Button) v;
            edit1.append(b.getText().toString());
        };

        
        bt1.setOnClickListener(numberClickListener);
        bt2.setOnClickListener(numberClickListener);
        bt3.setOnClickListener(numberClickListener);
        bt4.setOnClickListener(numberClickListener);
        bt5.setOnClickListener(numberClickListener);
        bt6.setOnClickListener(numberClickListener);
        bt7.setOnClickListener(numberClickListener);
        bt8.setOnClickListener(numberClickListener);
        bt9.setOnClickListener(numberClickListener);
        zero.setOnClickListener(numberClickListener);
        dot.setOnClickListener(numberClickListener);


        clear.setOnClickListener(v -> edit1.setText(""));


        add.setOnClickListener(v -> {
            if (!edit1.getText().toString().isEmpty()) {
                mValueOne = Float.parseFloat(edit1.getText().toString());
                addOp = true;
                edit1.setText("");
            }
        });

        sub.setOnClickListener(v -> {
            if (!edit1.getText().toString().isEmpty()) {
                mValueOne = Float.parseFloat(edit1.getText().toString());
                subOp = true;
                edit1.setText("");
            }
        });


        mul.setOnClickListener(v -> {
            if (!edit1.getText().toString().isEmpty()) {
                mValueOne = Float.parseFloat(edit1.getText().toString());
                mulOp = true;
                edit1.setText("");
            }
        });


        div.setOnClickListener(v -> {
            if (!edit1.getText().toString().isEmpty()) {
                mValueOne = Float.parseFloat(edit1.getText().toString());
                divOp = true;
                edit1.setText("");
            }
        });


        eql.setOnClickListener(v -> {
            if (!edit1.getText().toString().isEmpty()) {
                mValueTwo = Float.parseFloat(edit1.getText().toString());

                if (addOp) {
                    edit1.setText(String.valueOf(mValueOne + mValueTwo));
                    addOp = false;
                } else if (subOp) {
                    edit1.setText(String.valueOf(mValueOne - mValueTwo));
                    subOp = false;
                } else if (mulOp) {
                    edit1.setText(String.valueOf(mValueOne * mValueTwo));
                    mulOp = false;
                } else if (divOp) {
                    if (mValueTwo != 0) {
                        edit1.setText(String.valueOf(mValueOne / mValueTwo));
                    } else {
                        edit1.setText("Error");
                    }
                    divOp = false;
                }
            }
        });
    }
}

