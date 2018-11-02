package com.example.rmateos.viewholder;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ListActivity {

    private static final String[] items = {"España,Dinamarca,Alemania,Francia,Cataluña"};

    TextView selection;
    TextView texto;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setListAdapter(new IconicAdapter<String>(this, R.layout.row, R.id.Texto, items));

        selection = (TextView) findViewById(R.id.selection);
        texto = findViewById(R.id.Texto);
        image = findViewById(R.id.image);
    }

    public void onListItemClick(ListView parent, View v,
                                int position, long id) {

        selection.setText(items[position]);
    }

    class IconicAdapter<T> extends ArrayAdapter<T> {

        IconicAdapter(Context c, int resourceId, int textId, T[] objects) {

            super(c, resourceId, textId, objects);
        }


        public View getView(int position, View convertView,
                            ViewGroup parent) {

            View row = convertView;
            ViewHolder holder;

            if (row == null) {

                LayoutInflater inflater = getLayoutInflater();

                row = inflater.inflate(R.layout.row, parent, false);

                holder = new ViewHolder(texto,image);

                row.setTag(holder);

            } else {

                holder = (ViewHolder)row.getTag();
            }

            holder.getTexto().setText(items[position]);

            if (items[position].equals("España")) {

                holder.getImage().setImageResource(R.drawable.spain);

            } else if (items[position].equals("Dinamarca")) {
                holder.getImage().setImageResource(R.drawable.denmark);

            } else if (items[position].equals("Francia")) {
                holder.getImage().setImageResource(R.drawable.france);

            } else if (items[position].equals("Cataluña")) {
                holder.getImage().setImageResource(R.drawable.badge);

            } else {
                holder.getImage().setImageResource(R.drawable.germany);
            }

            return (row);
        }
    }
}

