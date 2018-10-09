package com.example.rmateos.cambiarcolortexto;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CambiarColoresTexto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambiar_colores_texto);

        final Button btnRojo;
        final Button btnVerde;
        final Button Centro;
        final TextView Texto;

        btnRojo = (Button)findViewById(R.id.ColorRojo);
        btnVerde = (Button)findViewById(R.id.ColorVerde);
        Centro = (Button)findViewById(R.id.AlinearCentro);
        Texto = (TextView)findViewById(R.id.TextoIntroducido);

        btnRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Texto.setTextColor(Color.RED);
            }
        });

        btnVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Texto.setTextColor(Color.GREEN);
            }
        });

        Centro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Texto.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            }
        });
    }
}
