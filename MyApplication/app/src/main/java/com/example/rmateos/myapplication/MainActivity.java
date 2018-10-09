package com.example.rmateos.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Todo;
    TextView Suma;
    TextView Resta;
    TextView Multiplicacion;
    TextView Division;
    EditText Numero1;
    EditText Numero2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Todo = (Button)findViewById(R.id.boton);
        Suma = (TextView)findViewById(R.id.ResultSuma);
        Resta = (TextView)findViewById(R.id.ResultSuma);
        Multiplicacion = (TextView)findViewById(R.id.ResultMultiplicacion);




    }
}
