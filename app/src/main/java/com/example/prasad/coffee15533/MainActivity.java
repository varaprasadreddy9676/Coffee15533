package com.example.prasad.coffee15533;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    Button btnadd,btnremove,btnreset;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=(TextView)findViewById(R.id.result);
        btnadd=(Button)findViewById(R.id.btnadd);
        btnremove=(Button)findViewById(R.id.btnrem);
        btnreset=(Button)findViewById(R.id.btnreset);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                result.setText(Integer.toString(count));

            }
        });
        btnremove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count --;
                result.setText(Integer.toString(count));
            }
        });
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                result.setText(Integer.toString(count));
            }
        });




    }
}
