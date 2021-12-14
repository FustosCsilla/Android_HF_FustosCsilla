package com.example.hazifeladat5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String [] dogArray = { "Labrador retriever", "Nemet juhaszkutya", "Golden retriever",
            "Francia bulldog", "Angol bulldog", "Uszkar", "Beagle",
            "Rottweiler", "Pembroke welsh corgi", "Tacsko"};

    ArrayList<CharSequence> list = new ArrayList<CharSequence>(Arrays.asList(dogArray));
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new ArrayAdapter<CharSequence>(this, android.R.layout.simple_list_item_1, list);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sort:
                Collections.sort(list, new Comparator<CharSequence>() {
                    @Override
                    public int compare(CharSequence x, CharSequence y) {
                        return x.toString().compareTo(y.toString());
                    }
                });
                adapter.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(),"Sort Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.delete:
                list.clear();
                adapter.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(),"Delete Selected",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        SpannableString str;

        switch (item.getItemId()) {
            case R.id.piros:
                str = SpannableString.valueOf(list.get(info.position));
                str.setSpan(new ForegroundColorSpan(Color.RED), 0, str.length(), 0);
                list.set(info.position, str);
                adapter.notifyDataSetChanged();
                return true;
            case R.id.zold:
                str = SpannableString.valueOf(list.get(info.position));
                str.setSpan(new ForegroundColorSpan(Color.GREEN), 0, str.length(), 0);
                list.set(info.position, str);
                adapter.notifyDataSetChanged();
            case R.id.sarga:
                str = SpannableString.valueOf(list.get(info.position));
                str.setSpan(new ForegroundColorSpan(Color.YELLOW), 0, str.length(), 0);
                list.set(info.position, str);
                adapter.notifyDataSetChanged();
            default:
                return super.onContextItemSelected(item);
        }

    }
}