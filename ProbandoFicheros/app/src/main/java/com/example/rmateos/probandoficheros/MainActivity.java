package com.example.rmateos.probandoficheros;

import android.nfc.Tag;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b =(TextView) findViewById(R.id.textView);
    }

    public void leerFicheros(View view){

        int size;
        int numero;
        Integer ret;
        InputStream is =  null;
        try{

            is = getAssets().open("logins.txt");
            size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            ArrayList<String> texto = new ArrayList<>();
            texto.add(buffer.toString());

            for(int i = 0; i<texto.size(); i++){

                b.setText(texto.get(i).toString());

            }


        }catch(Exception e){

            e.printStackTrace();

        }


    }
}
