package com.example.hazifeladat2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("State","MainActivity:onCreate()");

        Button b1 = findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("State", "MainActivity:onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("State: ", "MainActivity:onStop()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("State: ", "MainActivity:onPause()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("State: ", "MainActivity:onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("State: ", "MainActivity:onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("State: ", "MainActivity:onDestroy()");
    }
}