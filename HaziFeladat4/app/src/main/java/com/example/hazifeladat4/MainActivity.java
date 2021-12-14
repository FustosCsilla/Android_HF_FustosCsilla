package com.example.hazifeladat4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {
            "EUR", "USD", "GBP", "AUD", "CAD", "CHF", "DKK", "HUF"
    };

    String[] currencyArray = {
            "Euro", "Dolar american", "Lira sterlina", "Dolar australian",
            "Dolar canadian", "Franc elvetian", "Coroana daneza", "Forint maghiar"
    };

    String[] cumparaArray = {
            "4,4100 RON", "3,9750 RON", "6,4250 RON", "2,9600 RON", "3,0950 RON", "4,2300 RON", "0,5850 RON", "0,0136 RON"
    };

    String[] vindeArray = {
            "4,5500 RON", "4,1450 RON", "6,3550 RON", "3,0600 RON", "3,2650 RON", "4,2300 RON", "0,5850 RON", "0,0146 RON"
    };

    Integer[] imageArray = {
            R.drawable.eu, R.drawable.us, R.drawable.uk, R.drawable.aus,
            R.drawable.cad, R.drawable.sw, R.drawable.dk, R.drawable.hu
    };

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.currencyList);

        CustomListAdapter adapter = new CustomListAdapter (this, nameArray, currencyArray, imageArray, cumparaArray, vindeArray);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String value=nameArray[position];
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();
            }
        });
    }
}