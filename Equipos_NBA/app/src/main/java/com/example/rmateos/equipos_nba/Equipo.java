package com.example.rmateos.equipos_nba;

import android.media.Image;

public class Equipo {

    private String nombreEquipo;
    private int escudo;



    public Equipo(String nombreEquipo, int escudo){

        this.nombreEquipo = nombreEquipo;
        this.escudo = escudo;
    }

    public int getEscudo() {

        return escudo;
    }

    public String getNombreEquipo() {

        return nombreEquipo;
    }

    public void setEscudo(int escudo) {

        this.escudo = escudo;
    }

    public void setNombreEquipo(String nombreEquipo){

        this.nombreEquipo = nombreEquipo;

    }
}
