package com.example.lab_05;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //define button & textView
        Button btnC,btn2,btn3,btnAdd,btn5,btn6,btn7,btn8,
                btn9,btn10,btn11,btn12,btn13,btn14,btnEqu;

        TextView textView;

        //boolean only contain true or false
        boolean addition,subtraction,multiplication,division,percent;

        //values variable for addition/subtraction etc operation
        float value1,value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //btn finding
        btnC=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btnAdd=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn10=(Button)findViewById(R.id.btn10);
        btn11=(Button)findViewById(R.id.btn11);
        btn12=(Button)findViewById(R.id.btn12);
        btn13=(Button)findViewById(R.id.btn13);
        btn14=(Button)findViewById(R.id.btn14);
        btnEqu=(Button)findViewById(R.id.btn15);

        textView=(TextView) findViewById(R.id.tv1);

        //event listener
        btnC.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textView.setText(null);
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"1");
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"2");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
               if (textView==null){
                   textView.setText("");
               }
               else {
                   value1=Float.parseFloat(textView.getText()+"");
                   addition=true;
                   textView.setText(null);
               }
            }
        });

        btnEqu.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                value2=Float.parseFloat(textView.getText()+"");
                if (addition){
                    textView.setText(value1+value2+"");
                    addition=false;
                }
            }
        });

    }
}