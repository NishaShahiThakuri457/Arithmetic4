package com.e.arithmetic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etfirst, etsecond;
    private Button btnadd, btnsubtract, btndivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirst = findViewById(R.id.etfirst);
        etsecond = findViewById(R.id.etsecond);
        btnadd = findViewById(R.id.btnadd);
        btnsubtract = findViewById(R.id.btnsubtract);
        btndivide = findViewById(R.id.btndivide);


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();
            }
        });

        btnsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Subtract();
            }
        });

        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Divide();
            }
        });
    }

    private void Add() {

        float first = Float.parseFloat(etfirst.getText().toString());
        float second = Float.parseFloat(etsecond.getText().toString());

        Arithmetic arithmetic = new Arithmetic();

        float result = arithmetic.add(first, second);

        Intent intent = new Intent(MainActivity.this, OutPutActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }


    private void Subtract() {

        float first = Float.parseFloat(etfirst.getText().toString());
        float second = Float.parseFloat(etsecond.getText().toString());

        Arithmetic arithmetic = new Arithmetic();

        float result = arithmetic.subtract(first, second);

        Intent intent = new Intent(MainActivity.this, OutPutActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }


    private void Divide() {

        float first = Float.parseFloat(etfirst.getText().toString());
        float second = Float.parseFloat(etsecond.getText().toString());

        Arithmetic arithmetic = new Arithmetic();

        float result = arithmetic.divide(first, second);

        Intent intent = new Intent(MainActivity.this, OutPutActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }
}



