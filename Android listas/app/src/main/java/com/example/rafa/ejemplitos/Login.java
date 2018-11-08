package com.example.rafa.ejemplitos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.InputStream;

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

        try{

            InputStream is = getAssets().open("logins.txt");
            size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            String textoo = new String(buffer);

            if(username.getText().toString().equals(textoo)){


                Intent ListSong = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ListSong);

            }else{

                Toast.makeText(null,"LoginFailed",Toast.LENGTH_SHORT).show();

            }


        }catch(Exception e){

            e.printStackTrace();

        }finally {


        }




    }
}
