package com.example.rmateos.calculadora2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calcu2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu2);



        btn = (Button)findViewById(R.id.Sumar);
        numero1 =(EditText)findViewById(R.id.pedir);
        numero2 =(EditText)findViewById(R.id.pedir2);
        resultado = (TextView)findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                double Numero1;
                double Numero2;
                Double Resultado;
                String resultBueno;


                Numero1 = Double.valueOf(numero1.getText().toString());

                Numero2 = Double.valueOf(numero2.getText().toString());

                Resultado = Numero1 + Numero2;
                resultBueno = Resultado.toString();


                resultado.setText(resultBueno);


            }
        });

    }

}
