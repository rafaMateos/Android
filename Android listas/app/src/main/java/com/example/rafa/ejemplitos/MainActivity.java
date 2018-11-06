package com.example.rafa.ejemplitos;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.appcompat.*;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Ganalocal;
    TextView Empate;
    TextView GanalVisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Quitamos el actionBar porque es mas feo que pegarle a un padre.
        getSupportActionBar().hide();

        Ganalocal = findViewById(R.id.textView10);
        Empate = findViewById(R.id.textView12);
        GanalVisi = findViewById(R.id.textView13);

    }


    public void CambiarColorGanaLocal(View view) {


        //AL pulsar que gana equipo local
        if((Ganalocal.getCurrentTextColor() == Color.WHITE) && (Empate.getCurrentTextColor() == Color.WHITE)
                && GanalVisi.getCurrentTextColor() == Color.WHITE) {

            Ganalocal.setTextColor(Color.RED);

        }else{

            Ganalocal.setTextColor(Color.WHITE);
        }

    }

    public void CambiarColorEmpate(View view){

        if((Empate.getCurrentTextColor() == Color.WHITE) && (Ganalocal.getCurrentTextColor() == Color.WHITE)
                && GanalVisi.getCurrentTextColor() == Color.WHITE) {

            Empate.setTextColor(Color.RED);

        }else{

            Empate.setTextColor(Color.WHITE);
        }

    }


    public void CambiarColorDerrota(View view){

        if((GanalVisi.getCurrentTextColor() == Color.WHITE) && (Ganalocal.getCurrentTextColor() == Color.WHITE)
                && Empate.getCurrentTextColor() == Color.WHITE) {

            GanalVisi.setTextColor(Color.RED);

        }else{

            GanalVisi.setTextColor(Color.WHITE);
        }

    }


    public void irLista(View view) {

        Intent ListSong = new Intent(getApplicationContext(),lista.class);
        startActivity(ListSong);
    }
}
