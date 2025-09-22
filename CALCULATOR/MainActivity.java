package com.example.calcultor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,dot,zero,clear,add,sub,div,mul,eql;
    EditText edit1;
    float mvalueone,mvaluetwo;
    boolean add1,sub1,mul1,div1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        bt4=findViewById(R.id.bt4);
        bt5=findViewById(R.id.bt5);
        bt6=findViewById(R.id.bt6);
        bt7=findViewById(R.id.bt7);
        bt8=findViewById(R.id.bt8);
        bt9=findViewById(R.id.bt9);
        dot=findViewById(R.id.dot);
        zero=findViewById(R.id.zero);
        clear=findViewById(R.id.clear);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        div=findViewById(R.id.div);
        mul=findViewById(R.id.mul);
        eql=findViewById(R.id.eql);
        edit1=findViewById(R.id.edit1);
        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edit1.setText(edit1.getText()+"1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edit1.setText(edit1.getText()+"2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edit1.setText(edit1.getText()+"3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edit1.setText(edit1.getText()+"4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edit1.setText(edit1.getText()+"5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edit1.setText(edit1.getText()+"6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edit1.setText(edit1.getText()+"7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edit1.setText(edit1.getText()+"8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edit1.setText(edit1.getText()+"9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edit1.setText(edit1.getText()+".");
            }
        });
        zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edit1.setText(edit1.getText()+"0");
            }
        });
        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edit1.setText("");
            }
        });

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (edit1==null){
                    edit1.setText("");

                }
                else{
                    mvalueone=Float.parseFloat((edit1.getText()+" "));
                    add1=true;
                    edit1.setText(null);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (edit1==null){
                    edit1.setText("");

                }
                else{
                    mvalueone=Float.parseFloat((edit1.getText()+" "));
                    sub1=true;
                    edit1.setText(null);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (edit1==null){
                    edit1.setText("");

                }
                else{
                    mvalueone=Float.parseFloat((edit1.getText()+" "));
                    mul1=true;
                    edit1.setText(null);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (edit1==null){
                    edit1.setText("");

                }
                else{
                    mvalueone=Float.parseFloat((edit1.getText()+" "));
                    div1=true;
                    edit1.setText(null);
                }
            }
        });
        eql.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mvaluetwo=Float.parseFloat((edit1.getText()+" "));
                if (add1==true){
                    edit1.setText(mvalueone+mvaluetwo + "");
                    add1=false;
                }
                if (sub1==true){
                    edit1.setText(mvalueone-mvaluetwo + "");
                    sub1=false;
                }
                if (mul1==true){
                    edit1.setText(mvalueone*mvaluetwo + "");
                    mul1=false;
                }
                if (div1==true){
                    edit1.setText(mvalueone/mvaluetwo + "");
                    div1=false;
                }
            }
        });
    }
}
