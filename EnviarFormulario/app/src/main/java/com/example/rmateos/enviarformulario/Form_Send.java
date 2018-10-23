package com.example.rmateos.enviarformulario;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Form_Send extends AppCompatActivity {

    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form__send);

        login = (Button)findViewById(R.id.buttonLogin);


    }
    public void Login(View v){

        Intent intent = new Intent(this, SecondDisplay.class);

        startActivity(intent);



    }


}
