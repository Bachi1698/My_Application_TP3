package com.example.myapplicationtp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 
    ListView listview;
    PlaneteAdapter adapter;
    Data data;
    //private PlaneteAdapter planeteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = new Data();
        listview = (ListView) findViewById(R.id.listView);
        adapter = new PlaneteAdapter(this, data);
        //data.installePlanetes();
        listview.setAdapter(adapter);
        View button = findViewById(R.id.button);
        Button cliquer = findViewById(R.id.button);
        cliquer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score = 0;
                String[] PlaneteTaille = data.getTaillePlanetes();
                for (int i = 0; i < PlaneteTaille.length; i++) {

                    View v = listview.getChildAt(i); // on récupère la vue
                    Spinner sp = v.findViewById(R.id.spinner);// on récupére la liste déroulante
                    String tailleChoisie = sp.getSelectedItem().toString();
                    TextView textView = v.findViewById(R.id.textView);

                    if (tailleChoisie.equals(PlaneteTaille[i])) {
                        score = score + 1;
                        //Toast.makeText(MainActivity.this,"Planéte:" +textView.getText().toString()+ "Taille:" +sp.getSelectedItem().toString(),Toast.LENGTH_LONG).show();
                    }
                }
                Toast.makeText(MainActivity.this, "score: " + score + "/" + PlaneteTaille.length, Toast.LENGTH_LONG).show();

            }
        });





    }
}






