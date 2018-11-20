package com.example.rmateos.spinner;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Azuca extends AppCompatActivity
    implements AdapterView.OnItemSelectedListener{

    public static ArrayList<Producto> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azuca);


        Producto recibido = (Producto)getIntent().getParcelableExtra("Producto");

        items.add(recibido);

        Spinner spin = findViewById(R.id.spinner2);

        spin.setOnItemSelectedListener(this);

        ArrayAdapter<Producto> ADAP= new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,
                items);

        ADAP.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(ADAP);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
