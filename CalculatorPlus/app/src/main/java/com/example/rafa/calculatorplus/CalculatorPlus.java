package com.example.rafa.calculatorplus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;
import static java.lang.Double.parseDouble;

public class CalculatorPlus extends AppCompatActivity {

    TextView resultado;

    public double operando1 = 0;
    public double operando2 = 0;
    public double res = 0;
    int ope = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_plus);

        resultado =(TextView)findViewById(R.id.resultados);


    }

    public void btn1 (View v){

        String ret = resultado.getText().toString();
        ret = ret + "1";
        resultado.setText(ret);
    }

    public void btn2 (View v){

        String ret = resultado.getText().toString();
        ret = ret + "2";
        resultado.setText(ret);
    }

    public void btn3 (View v){

        String ret = resultado.getText().toString();
        ret = ret + "3";
        resultado.setText(ret);
    }

    public void btn4 (View v){

        String ret = resultado.getText().toString();
        ret = ret + "4";
        resultado.setText(ret);
    }

    public void btn5 (View v){

        String ret = resultado.getText().toString();
        ret = ret + "5";
        resultado.setText(ret);
    }

    public void btn6 (View v){

        String ret = resultado.getText().toString();
        ret = ret + "6";
        resultado.setText(ret);
    }

    public void btn7 (View v){

        String ret = resultado.getText().toString();
        ret = ret + "7";
        resultado.setText(ret);
    }

    public void btn8 (View v){

        String ret = resultado.getText().toString();
        ret = ret + "8";
        resultado.setText(ret);
    }

    public void btn9 (View v){

        String ret = resultado.getText().toString();
        ret = ret + "9";
        resultado.setText(ret);
    }

    public void btn0 (View v){

        String ret = resultado.getText().toString();
        ret = ret + "0";
        resultado.setText(ret);
    }

    public void suma(View v){

        String aux;
        aux = resultado.getText().toString();
<<<<<<< Updated upstream
=======
        operando1 = Double.parseDouble(aux);
        resultado.setText("");
        this.ope = 1;
>>>>>>> Stashed changes

        if(aux.isEmpty()){

            Toast toast1 =
                    makeText(getApplicationContext(),
                            "Introduce numerito para sumar nene", Toast.LENGTH_SHORT);

            toast1.show();


        }else{

            operando1 = parseDouble(aux);
            resultado.setText("");
            ope = 1;

        }


    }
    public void resta(View v){

        String aux;
        aux = resultado.getText().toString();
<<<<<<< Updated upstream

        if(aux.isEmpty()) {

            Toast toast1 =
                    makeText(getApplicationContext(),
                            "Introduce numerito para restar nene", Toast.LENGTH_SHORT);

            toast1.show();

        }else{

            operando1 = parseDouble(aux);
            resultado.setText("");
            ope = 2;

        }

=======
        operando1 = Double.parseDouble(aux);
        resultado.setText("");
        this.ope = 2;
>>>>>>> Stashed changes

    }

    public void multipli(View v){

        String aux;
        aux = resultado.getText().toString();
<<<<<<< Updated upstream

        if(aux.isEmpty()) {

            Toast toast1 =
                    makeText(getApplicationContext(),
                            "Introduce numerito para multipli nene", Toast.LENGTH_SHORT);

            toast1.show();

        }else {

            operando1 = parseDouble(aux);
            resultado.setText("");
            ope = 3;
        }
=======
        operando1 = Double.parseDouble(aux);
        resultado.setText("");
        this.ope = 3;
>>>>>>> Stashed changes

    }

    public void division(View v){

        String aux;
        aux = resultado.getText().toString();
<<<<<<< Updated upstream

        if(aux.isEmpty()) {

            Toast toast1 =
                    makeText(getApplicationContext(),
                            "Introduce numerito para dividi nene", Toast.LENGTH_SHORT);

            toast1.show();

        }else {
            operando1 = parseDouble(aux);
            resultado.setText("");
            ope = 4;
        }
=======
        operando1 = Double.parseDouble(aux);
        resultado.setText("");
        this.ope = 4;
>>>>>>> Stashed changes

    }

    public void igual(View v){

        String aux1;
        aux1 = resultado.getText().toString();

<<<<<<< Updated upstream
        if(aux1.isEmpty()){

            Toast toast1 =
                    makeText(getApplicationContext(),
                            "Introduce numerito para dividi nene", Toast.LENGTH_SHORT);

            toast1.show();


        }else {

            operando2 = Double.parseDouble(aux1);
            if (ope == 1) {
=======
        if(this.ope == 1){

            res = operando1 + operando2;
        }else if (this.ope == 2){
>>>>>>> Stashed changes

                res = operando1 + operando2;

<<<<<<< Updated upstream
            } else if (ope == 2) {
=======
        }else if (this.ope == 3){
>>>>>>> Stashed changes

                res = operando1 - operando2;

<<<<<<< Updated upstream
            } else if (ope == 3) {
=======
        }else if(this.ope == 4){
>>>>>>> Stashed changes

                res = operando1 * operando2;

            } else if (ope == 4) {

                if (operando2 == 0.0) {

                    resultado.setText("Error nene andeva a dividi por cero");

                } else {

                    res = operando1 / operando2;
                }

            }

            resultado.setText(" " + res);
        }

            }



    public void limpiar(View v){

        resultado.setText("");
        operando1= 0.0;
        operando2 = 0.0;
        res = 0.0;

    }



    }


