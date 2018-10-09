package com.example.rmateos.cliker;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ClikerFlama extends AppCompatActivity {

    /*Declaramos las variables correspondientes*/
    ImageView image;
    //No declare if not going to use
    TextView text;
    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliker_flama);

        image = (ImageView)findViewById(R.id.imagen);
        buttonOne = (Button)findViewById(R.id.botonUno);
        buttonTwo = (Button)findViewById(R.id.botonDos);
        buttonThree= (Button)findViewById(R.id.botonTres);
        buttonFour = (Button)findViewById(R.id.botonCuatro);
        text = (TextView)findViewById(R.id.texto);


        buttonOne.setText("espana");
        buttonTwo.setText("puertorico");
        buttonThree.setText("francia");
        buttonFour.setText("alemania");

        image.setImageResource(R.drawable.espana);




    }

    public void comprobar (View v){

        switch (v.getId()){

            case R.id.botonUno:

                if(buttonOne.getText().equals(image.getTag())){

                    buttonOne.setTextColor(Color.GREEN);

                    image.setImageResource(R.drawable.puertorico);

                    Toast.makeText(this, "Acertaste nene", Toast.LENGTH_SHORT).show();

                    image.setTag("puertorico");

                } else {

                    Toast.makeText(this, "Incorrecto nene", Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.botonDos:

                if(buttonTwo.getText().equals(image.getTag())){

                    buttonTwo.setTextColor(Color.GREEN);

                    image.setImageResource(R.drawable.patria);

                    Toast.makeText(this, "Acertaste nene", Toast.LENGTH_SHORT).show();

                    image.setTag("francia");

                    buttonOne.setTextColor(Color.BLACK);
                    buttonThree.setTextColor(Color.BLACK);
                    buttonFour.setTextColor(Color.BLACK);


                } else {

                    Toast.makeText(this, "Incorrecto nene", Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.botonTres:

                if(buttonThree.getText().equals(image.getTag())){

                    buttonThree.setTextColor(Color.GREEN);

                    image.setImageResource(R.drawable.alemania);

                    Toast.makeText(this, "Acertaste nene", Toast.LENGTH_SHORT).show();

                    image.setTag("alemania");

                    buttonOne.setTextColor(Color.BLACK);
                    buttonTwo.setTextColor(Color.BLACK);
                    buttonFour.setTextColor(Color.BLACK);


                } else {

                    Toast.makeText(this, "Incorrecto nene", Toast.LENGTH_SHORT).show();
                }

                break;


            case R.id.botonCuatro:

                if(buttonFour.getText().equals(image.getTag())){

                    buttonFour.setTextColor(Color.GREEN);

                    image.setImageResource(R.drawable.ganaste);

                    Toast.makeText(this, "Acertaste nene", Toast.LENGTH_SHORT).show();



                    buttonOne.setTextColor(Color.BLACK);
                    buttonTwo.setTextColor(Color.BLACK);
                    buttonThree.setTextColor(Color.BLACK);


                    buttonOne.setVisibility(View.GONE);
                    buttonTwo.setVisibility(View.GONE);
                    buttonThree.setVisibility(View.GONE);
                    buttonFour.setVisibility(View.GONE);
                    text.setVisibility(View.GONE);






                } else {

                    Toast.makeText(this, "Incorrecto nene", Toast.LENGTH_SHORT).show();
                }





        }





    }
}

