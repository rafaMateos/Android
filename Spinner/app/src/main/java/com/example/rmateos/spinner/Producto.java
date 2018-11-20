package com.example.rmateos.spinner;

import android.os.Parcel;
import android.os.Parcelable;

public class Producto implements Parcelable {

    private String nombreProducto;
    private double precio;
    public Producto(String nombreProducto, double precio) {

        this.nombreProducto = nombreProducto;
        this.precio = precio;

    }

    public Producto() {


    }



    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombreProducto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nombreProducto);
        dest.writeDouble(this.precio);
    }

    protected Producto(Parcel in) {
        this.nombreProducto = in.readString();
        this.precio = in.readDouble();
    }

    public static final Parcelable.Creator<Producto> CREATOR = new Parcelable.Creator<Producto>() {
        @Override
        public Producto createFromParcel(Parcel source) {
            return new Producto(source);
        }

        @Override
        public Producto[] newArray(int size) {
            return new Producto[size];
        }
    };
}
