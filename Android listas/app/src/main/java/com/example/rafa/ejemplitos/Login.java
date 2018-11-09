package com.example.rafa.ejemplitos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.io.InputStream;
import java.util.ArrayList;

public class Login extends AppCompatActivity {

    Button login;
    EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.editText);
    }

    public void Login(View view){

        int size;
        int numero;
        Integer ret;
        boolean loginBoll = false;

        InputStream is =  null;

        try{

             is = getAssets().open("logins.txt");
            size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            String textoo = new String(buffer);

            String [] login = textoo.split(",");


            for(int i = 0; i< login.length || !loginBoll; i++ ){


                if(login[i].equals(username.getText().toString())){

                    Intent ListSong = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(ListSong);
                    loginBoll = true;

                }else{

                    Toast.makeText(this,"LoginFailed",Toast.LENGTH_SHORT).show();

                }

            }



        }catch(Exception e){

            e.printStackTrace();

        }finally {

            //is.close(); //TODO

        }






    }
}
