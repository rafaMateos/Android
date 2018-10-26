package com.example.rmateos.equipos_nba;

import android.app.ListActivity;
import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class NBA_Teams extends ListActivity {

    TextView selection;

    private static final ArrayAdapter<Equipo> items = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nba__teams);

        setListAdapter(new IconicAdapter<Equipo>(this, R.layout.row, R.id.label, items));
        selection = (TextView) findViewById(R.id.selection);
    }


    public void onListItemClick(ListView parent, View v,
                                int position, long id) {


    }

    class IconicAdapter<T> extends ArrayAdapter<T> {
        IconicAdapter(Context c, int resourceId, int textId, T[] objects) {
            super(c, resourceId, textId, objects);
        }


        public View getView(int position, View convertView,
                            ViewGroup parent) {

            View row = convertView;

            if (row==null){
                LayoutInflater inflater=getLayoutInflater();
                row=inflater.inflate(R.layout.row, parent, false);
            }

            TextView label = (TextView) row.findViewById(R.id.label);
            label.setText(items[position]);

            ImageView icon=(ImageView)row.findViewById(R.id.icon);

            if (items[position].equals("calendario")) {
                icon.setImageResource(R.drawable.calendar48x48);
            }
            else if (items[position].equals("GPS")){
                icon.setImageResource(R.drawable.compass48x48);
            }
            else if (items[position].equals("alarma")){
                icon.setImageResource(R.drawable.alarm48x48);
            }
            else{
                icon.setImageResource(R.drawable.delete);
            }

            return(row);
        }

        public ArrayAdapter<Equipo> rellenarLista(){

            int m = R.drawable.equipo;
            int m1 = R.drawable.equipo2;


            Equipo equipo1 = new Equipo("Lakers",m);
            Equipo equipo2 = new Equipo("Pepito",m1);


            ArrayAdapter<Equipo> items = null;
            items.add(equipo1);
            items.add(equipo2);

            return items;
        }
    }
}
