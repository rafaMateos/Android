package com.example.rmateos.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {

    private TextView texto;
    private ImageView image;


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


}
