package com.example.rmateos.calculadoraapk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Calcu extends AppCompatActivity {

    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button num0;
    Button sumar;
    Button restar;
    Button multiplicar;
    Button dividir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu);

        num0 = (Button)findViewById(R.id.btn_14);

    }
}
