package com.benchelbikh.architecture.presentation.controllers;

import android.content.Intent;
import android.os.Bundle;

import com.benchelbikh.architecture.R;
import com.benchelbikh.architecture.utils.MyContext;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MyContext context;
    Spinner spinner;
    EditText editText;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = (MyContext) getApplicationContext();

        spinner = (Spinner) findViewById(R.id.ville);
        editText = (EditText) findViewById(R.id.qte);
        btn = (Button) findViewById(R.id.calculate);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.cities_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();

                Log.d("item" , item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("tarif",12);
                startActivity(intent);
            }
        });





    }
}