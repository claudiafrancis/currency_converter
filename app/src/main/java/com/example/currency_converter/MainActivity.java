package com.example.currency_converter;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {
    Spinner sp1,sp2;
    EditText ed1;
    Button b1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1=findViewById(R.id.spfrom);
        sp2=findViewById(R.id.to);
        ed1=findViewById(R.id.txtamt);

        String[] from={"USD"};
        ArrayAdapter ad= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,from);
        sp1.setAdapter(ad);

        String[] to={"IND"};
        ArrayAdapter ad2= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,to);
        sp2.setAdapter(ad2);

        b1=findViewById(R.id.btn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double tot;

                EditText editText = (EditText) findViewById(R.id.txtamt);


                Double amt = Double.parseDouble(ed1.getText().toString());

                if(sp1.getSelectedItem().toString()=="USD"  && sp2.getSelectedItem().toString()=="IND")
                {
                    int ind = 70;

                    double result = amt * ind ;
                    Toast.makeText(MainActivity.this, Double.toString(result), Toast.LENGTH_LONG).show();
                }
                else
                {
                    int usd = 1;
                    double result = amt * usd ;
                    Toast.makeText(MainActivity.this, Double.toString(result), Toast.LENGTH_LONG).show();
                }

            }
        });



    }
}
