package com.example.rmateos.probandocosillas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.se.omapi.Session;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Properties;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Cosas extends AppCompatActivity {

    //Declaracion de variables que vamos a usar
    EditText userName;
    EditText userSex;
    Button enviar;
    String correo;
    String contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosas);

        userName = (EditText)findViewById(R.id.nameText);
        userSex = (EditText)findViewById(R.id.SexText);
        enviar = (Button)findViewById(R.id.enviar);

        correo = "rafaelmateostorres@gmail.com";
        contraseña = "Sevillamalo";

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Properties properties = new Properties();

                properties.put("mail.smtp.host","smt.googlemail.com");

            }
        });

    }



    }




