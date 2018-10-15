package com.example.rafa.calculatorplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculatorPlus extends AppCompatActivity {

    TextView resultado;
    public double operando1,operando2,res;
    int ope;
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
        operando1 = Double.parseDouble(aux);
        resultado.setText("");
        ope = 1;

    }

    public void resta(View v){

        String aux;
        aux = resultado.getText().toString();
        operando1 = Double.parseDouble(aux);
        resultado.setText("");
        ope = 2;

    }

    public void multipli(View v){

        String aux;
        aux = resultado.getText().toString();
        operando1 = Double.parseDouble(aux);
        resultado.setText("");
        ope = 3;

    }

    public void division(View v){

        String aux;
        aux = resultado.getText().toString();
        operando1 = Double.parseDouble(aux);
        resultado.setText("");
        ope = 4;

    }

    public void igual(View v){

        String aux1;
        aux1 = resultado.getText().toString();
        operando2 = Double.parseDouble(aux1);
        resultado.setText("");

        if(ope == 1){

            res = operando1 + operando2;
        }else if (ope == 2){

            res = operando1 - operando2;

        }else if (ope == 3){

            res = operando1 * operando2;

        }else if(ope == 4){

            if(operando2 == 0.0){

                resultado.setText("Error nene andeva a dividi por cero");
            }else{

                res = operando1/operando2;
            }

        }

        resultado.setText("" + res);


    }

    public void limpiar(View v){

        resultado.setText("");
        operando1= 0.0;
        operando2 = 0.0;
        res = 0.0;

    }



    }


