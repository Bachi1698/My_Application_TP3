package com.example.myapplicationtp3;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaneteAdapter extends BaseAdapter {
    private final Data data;
    private final MainActivity activity;
    private static int nbr = 0;
    private ArrayList<String> planetes;

    public PlaneteAdapter(MainActivity mainActivity, Data data) {
        this.data=data;
        this.activity = mainActivity;
        this.planetes = data.getPlanetes();
    }
    
    @Override
    public int getCount() {

        return planetes.size();
    }

    @Override
    public Object getItem(int position) {
        return planetes.get(position);
    }

    @Override
    public long getItemId(int i) {

        return i;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = inflater.inflate(R.layout.listitem, null);
        }


        TextView nomPlanete = (TextView) itemView.findViewById(R.  id.textView);
        final CheckBox checkBox = (CheckBox) itemView.findViewById(R.id.checkbox);
        final Spinner spinner = (Spinner) itemView.findViewById(R.id.spinner);


        nomPlanete.setText(planetes.get(position));

        final ArrayAdapter<String> spinadapter = new ArrayAdapter<String>(activity, android.R.layout.simple_spinner_item, data.getTaillePlanetes());
        spinadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinadapter);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                CheckBox checkBox = (CheckBox)  compoundButton.findViewById(R.id.checkbox);
                if (checkBox.isChecked()) {
                    spinner.setEnabled(false);
                    spinadapter.notifyDataSetChanged();
                    nbr++;

                } else {
                    spinner.setEnabled(true);
                    spinadapter.notifyDataSetChanged();
                    nbr--;
                }
                Button btn =activity.findViewById(R.id.button);
                if (nbr==data.getPlanetes().size()){
                    btn.setEnabled(true);
                }else{
                    btn.setEnabled(false);
                }
            }
        });


        return itemView;
    }
    

}
