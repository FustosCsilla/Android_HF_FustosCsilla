package com.example.hazifeladat6;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListAdapter extends ArrayAdapter {

    private  final Activity context;

    private final Integer[] imageArray;
    private final String[] nameArray;
    private final String[] currencyArray;
    private final String[] cumparaArray;
    private final String[] vindeArray;

    public CustomListAdapter (Activity context, String[] nameArrayParam, String[] currencyArrayParam,
                       Integer[] imageArrayParam, String[] cumparaArrayParam, String[] vindeArrayParam){

        super(context, R.layout.list_view, nameArrayParam);
        this.context=context;
        this.imageArray=imageArrayParam;
        this.nameArray=nameArrayParam;
        this.currencyArray=currencyArrayParam;
        this.cumparaArray=cumparaArrayParam;
        this.vindeArray=vindeArrayParam;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_view,null,true);

        TextView nev = rowView.findViewById(R.id.Text1);
        TextView leiras = rowView.findViewById(R.id.Text2);
        TextView cump = rowView.findViewById(R.id.Text3);
        TextView vind = rowView.findViewById(R.id.Text4);
        ImageView img = rowView.findViewById(R.id.img);

        nev.setText(nameArray[position]);
        leiras.setText(currencyArray[position]);
        img.setImageResource(imageArray[position]);
        cump.setText(cumparaArray[position]);
        vind.setText(vindeArray[position]);

        return rowView;
    }
}
