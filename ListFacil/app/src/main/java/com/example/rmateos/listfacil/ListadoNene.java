package com.example.rmateos.listfacil;

import android.app.ListActivity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListadoNene extends  implements AdapterView.OnItemClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_nene);

        ListView lista;
        lista =findViewById(R.id.list);

        String[] items = {"Hola", "Tq", "Ere un grande","Tequiero demasiao"};

        ArrayAdapter a = new ArrayAdapter<String>(this, R.layout.filas, R.id.nene, items);

        lista.setAdapter(a);
        lista.setOnItemClickListener(this);


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        TextView pepe;
        pepe = (TextView) view.findViewById(R.id.grande);
        String p = pepe.getText().toString();
        Toast toast = Toast.makeText(this,p + "Tequiero",Toast.LENGTH_SHORT);
        toast.show();

    }
}
