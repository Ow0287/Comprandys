package com.example.senasoft.comprandys.modelo;

import android.graphics.Bitmap;

/**
 * Created by Senasoft on 22/07/2017.
 */

public class Producto {
    private String nombreP,cantidadD,precio;
    private Bitmap foto;

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getCantidadD() {
        return cantidadD;
    }

    public void setCantidadD(String cantidadD) {
        this.cantidadD = cantidadD;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Bitmap getFoto() {
        return foto;
    }

    public void setFoto(Bitmap foto) {
        this.foto = foto;
    }

    public Producto(String nombreP, String cantidadD, String precio, Bitmap foto) {

        this.nombreP = nombreP;
        this.cantidadD = cantidadD;
        this.precio = precio;
        this.foto = foto;
    }
}
