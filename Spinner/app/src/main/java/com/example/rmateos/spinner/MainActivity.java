package com.example.rmateos.spinner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity
        implements AdapterView.OnItemSelectedListener {

    public static ArrayList<Producto> items = new ArrayList<>();

    private TextView selecionado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Producto p1 = new Producto("Leche",3);
        Producto p2 = new Producto("Avellanas",5);
        Producto p3 = new Producto("Huevos",6);
        Producto p4 = new Producto("Azucar",7);
        Producto p5 = new Producto("Gomitas",8);

        items.add(p1);
        items.add(p2);
        items.add(p3);
        items.add(p4);
        items.add(p5);

        selecionado = findViewById(R.id.select);
        Spinner spin = findViewById(R.id.spinner);

        spin.setOnItemSelectedListener(this);

        ArrayAdapter<Producto> ADAP= new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,
                items);

        ADAP.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(ADAP);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        selecionado.setText(items.get(position).getNombreProducto());

        if(selecionado.getText().equals("Azucar")){

            Intent intent = new Intent(this, Azuca.class);

            startActivity(intent);


        }
    }

    public void onNothingSelected(AdapterView<?> parent) {

        selecionado.setText("Nada seleccionado");

    }


    }
