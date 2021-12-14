package com.example.hazifeladat3;

import android.widget.EditText;

public class Product {

    private EditText code;
    private EditText name;
    private EditText price;

    public Product (EditText code, EditText name, EditText price){
        this.code=code;
        this.name=name;
        this.price=price;
    }
}
