package com.example.rmateos.enviarformulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondDisplay extends AppCompatActivity {

    EditText Emails;
    EditText Asunto;
    EditText msg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_display);

        Emails = (EditText)findViewById(R.id.Emails);
        Asunto = (EditText)findViewById(R.id.Asunto);
        msg = (EditText)findViewById(R.id.texto);
        msg.setText("");

        Button send = (Button)findViewById(R.id.Send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });
    }

    public void sendMail(){

        String emails = Emails.getText().toString();

        //Guardamos los emails en en array y los separamos por comas
        String arrayEmails[] = emails.split(",");
        String asunto = Asunto.getText().toString();
        String mensag = msg.getText().toString();


        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,arrayEmails);
        intent.putExtra(Intent.EXTRA_SUBJECT,asunto);
        intent.putExtra(Intent.EXTRA_TEXT,mensag);

        //rfc822 STANDARD FOR THE FORMAT OF INTERNET MESSAGE
        intent.setType("message/rfc822");
        //intent.addCategory("");

        startActivity(Intent.createChooser(intent,"Elije una"));

        //startActivityForResult(Intent.createChooser(intent,"1"));


    }
}
