package com.example.hazifeladat6;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }
        setContentView(R.layout.fragment2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String selectedItem = extras.getString("item");
            TextView textView = (TextView) findViewById(R.id.selectedopt);
            textView.setText("You have selected "+selectedItem);
        }
    }
}
