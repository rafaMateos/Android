package com.iesnervion.jobando.calculadorasimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText numero1, numero2;
    RadioButton suma, resta, multiplicacion, division;
    RadioGroup grupo;
    Button calcular;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);

        suma = (RadioButton) findViewById(R.id.suma);
        resta = (RadioButton) findViewById(R.id.resta);
        multiplicacion = (RadioButton) findViewById(R.id.multiplicacion);
        division = (RadioButton) findViewById(R.id.division);

        grupo = (RadioGroup) findViewById(R.id.grupo);

        calcular = (Button) findViewById(R.id.boton);

        resultado = (TextView) findViewById(R.id.resultado);


    }

    /**
     *
     * Metodo que calculara segun la seleccion deseada
     *
     * @param v
     */


    public void calcular (View v){

        double factor1 = 0;
        double factor2 = 0;
        double resultadoOperacion = 0;

        String vacio1 , vacio2;

        vacio1 = numero1.getText().toString();
        vacio2 = numero2.getText().toString();

            if (vacio1.isEmpty() || vacio2.isEmpty()) {

                Toast.makeText(this, "Pls mete algun numerito", Toast.LENGTH_SHORT).show();



            }else {

                factor1 = Double.parseDouble(numero1.getText().toString());
                factor2 = Double.parseDouble(numero2.getText().toString());


                switch (grupo.getCheckedRadioButtonId()) {

                    case R.id.suma:

                        resultadoOperacion = factor1 + factor2;

                        break;


                    case R.id.resta:

                        resultadoOperacion = factor1 - factor2;

                        break;


                    case R.id.multiplicacion:

                        resultadoOperacion = factor1 * factor2;

                        break;


                    case R.id.division:

                        resultadoOperacion = factor1 / factor2;

                        break;

                }


            resultado.setText(Double.toString(resultadoOperacion));

            }



    }
}
