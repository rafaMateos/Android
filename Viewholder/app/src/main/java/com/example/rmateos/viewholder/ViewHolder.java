package com.example.rmateos.viewholder;

import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {

    private TextView texto;
    private ImageView image;


    public ViewHolder(){

        texto.setText(" ");
        image.setColorFilter(0);

    }


    public ViewHolder (TextView texto,ImageView image){

        this.texto = texto;
        this.image = image;

    }

    public TextView getTexto(){

        return this.texto;

    }

    public ImageView getImage(){

        return this.image;

    }

    public void setTexto(TextView texto){

        this.texto = texto;

    }

    public void setImage(ImageView image){

        this.image = image;

    }
}
