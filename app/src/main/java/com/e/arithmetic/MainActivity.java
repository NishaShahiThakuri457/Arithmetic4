package com.e.arithmetic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etfirst,etsecond;
    private Button btnsum,btnsubtract,btndivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirst=findViewById(R.id.etfirst);
        etsecond=findViewById(R.id.etsecond);
        btnsum=findViewById(R.id.btnsum);

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();
            }
        });
    }

            private void Add() {

                float first = Float.parseFloat(etfirst.getText().toString());
                float second = Float.parseFloat(etsecond.getText().toString());

                Arithmetic arithmetic = new Arithmetic();

                float result = arithmetic.add(first, second);

                Intent intent = new Intent(MainActivity.this, OutputActivity.class);
                Intent.putExtra("result", result);
                startActivity(intent);
            }
            }






}
