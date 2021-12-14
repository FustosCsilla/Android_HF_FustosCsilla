package com.example.hazifeladat7;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by pali on 10/5/2017.
 */

public class CustomListAdapter extends ArrayAdapter {

    private final Activity context;
    private final Integer[] imageIDarray;
    private final String[] nameArray;
    private final String[] infoArray;

    public CustomListAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam, Integer[] imageIDArrayParam){
        super(context, R.layout.list_view);
        this.context=context;
        this.imageIDarray = imageIDArrayParam;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_view, null,true);

        TextView nameTextField = rowView.findViewById(R.id.tv1);
        TextView infoTextField = rowView.findViewById(R.id.tv2);
        ImageView imageView = rowView.findViewById(R.id.img);

        nameTextField.setText(nameArray[position]);
        infoTextField.setText(infoArray[position]);
        imageView.setImageResource(imageIDarray[position]);

        return rowView;

    }
}
