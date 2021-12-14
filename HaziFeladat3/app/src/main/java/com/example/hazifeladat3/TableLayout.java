package com.example.hazifeladat3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class TableLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablelayout_products);

        EditText code = findViewById(R.id.edit_pc);
        EditText name = findViewById(R.id.edit_pn);
        EditText price = findViewById(R.id.edit_pp);
        Button add = findViewById(R.id.add);
        Button cancel = findViewById(R.id.cancel);
        Button show = findViewById(R.id.show);
        TextView show_prod = findViewById(R.id.show_prod);

        ArrayList<Product> products = new ArrayList<Product>();

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product pr1 = new Product(code, name, price);
                products.add(pr1);
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.getText().clear();
                name.getText().clear();
                price.getText().clear();
            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder build = new StringBuilder();
                for (Product prod_list: products) {
                    build.append(build);
                    build.append("\n");
                }
                show_prod.setText(build.toString());
            }
        });
    }
}
