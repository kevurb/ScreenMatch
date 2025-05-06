package com.nuamx.screenmatch.modelos;

import com.nuamx.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {

    private String nombre;
    private int numero;
    private Serie serie;
    private int totalVisulizaciones;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }



    @Override
    public int getClasificaion() {
        if (totalVisulizaciones > 100){
            return 4;
        }else {
            return 2;
        }
    }
}
