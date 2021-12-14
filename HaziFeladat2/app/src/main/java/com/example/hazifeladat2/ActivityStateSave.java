package com.example.hazifeladat2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityStateSave extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statesave);

        final EditText text = (EditText) findViewById(R.id.editText);
        CheckBox cb = (CheckBox) findViewById(R.id.checkBox);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.append("\n" + text.getText());
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        EditText text = (EditText) findViewById(R.id.editText);
        CheckBox cb = (CheckBox) findViewById(R.id.checkBox);
        savedInstanceState.putString("myEditText", text.getText().toString());
        Log.d("State: ", "onSaveInstanceState");
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        EditText text = (EditText) findViewById(R.id.editText);
        CheckBox cb = (CheckBox) findViewById(R.id.checkBox);
        if (savedInstanceState.getString("myEditText") != null) {
            text.setText(savedInstanceState.getString("myEditText"));
        }
        Log.d("State: ", "onRestoreInstanceState");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("State: ", "ActivityStateSave: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("State: ", "ActivityStateSave: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("State: ", "ActivityStateSave: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("State: ", "ActivityStateSave: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("State: ", "ActivityStateSave: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("State: ", "ActivityStateSave: onDestroy()");
    }
}
