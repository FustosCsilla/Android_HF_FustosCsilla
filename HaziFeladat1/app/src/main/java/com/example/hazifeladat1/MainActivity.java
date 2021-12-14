package com.example.hazifeladat1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText szam1 = findViewById(R.id.editText1);
        EditText szam2 = findViewById(R.id.editText2);
        Button ossz = findViewById(R.id.button);
        Button kiv = findViewById(R.id.button2);
        Button szor = findViewById(R.id.button3);
        Button oszt = findViewById(R.id.button4);
        TextView res = findViewById(R.id.result);

        ossz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double r = Double.parseDouble(szam1.getText().toString())+Double.parseDouble(szam2.getText().toString());
                res.setText(Double.toString(r));
            }
        });

        kiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double r = Double.parseDouble(szam1.getText().toString())-Double.parseDouble(szam2.getText().toString());
                res.setText(Double.toString(r));
            }
        });

        szor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double r = Double.parseDouble(szam1.getText().toString())*Double.parseDouble(szam2.getText().toString());
                res.setText(Double.toString(r));
            }
        });

        oszt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sz1 = Double.parseDouble(szam1.getText().toString());
                double sz2 = Double.parseDouble(szam2.getText().toString());
                if (sz1<sz2){
                    res.setText("Hiba");
                }
                else if(sz2==0){
                    res.setText("0-val nem osztunk");
                }
                else{
                    double r = sz1/sz2;
                    res.setText(Double.toString(r));
                }
            }
        });
    }
}