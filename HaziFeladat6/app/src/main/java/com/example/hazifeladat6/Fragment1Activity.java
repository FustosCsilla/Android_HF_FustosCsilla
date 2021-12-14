package com.example.hazifeladat6;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class Fragment1Activity extends Fragment {

    protected static final String FRAG2 = "2";

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Context c = getActivity().getApplicationContext();
        View vw = inflater.inflate(R.layout.fragment1, container, false);

        ListView currencyList = (ListView) vw.findViewById(R.id.currencyList);
        ArrayAdapter<String> arrayAdpt= new ArrayAdapter<String>(c, android.R.layout.simple_list_item_1, (List<String>) currencyList);
        currencyList.setAdapter(arrayAdpt);

        final FragmentManager fragmentManager = getFragmentManager();
        currencyList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                TextView name = v.findViewById(R.id.Text1);
                TextView cump = v.findViewById(R.id.Text3);

                if(fragmentManager.findFragmentByTag(FRAG2)!=null){
                    TextView selectedOpt = (TextView) getActivity().findViewById(R.id.selectedopt);
                    selectedOpt.setText("You have selected "+name.getText().toString() + " " + cump.getText().toString());
                } else {
                    Intent intent = new Intent(getActivity().getApplicationContext(), Details.class);
                    intent.putExtra("item", name.getText().toString() + " " + cump.getText().toString());
                    startActivity(intent);
                }
            }
        });
        return vw;
    }
}
