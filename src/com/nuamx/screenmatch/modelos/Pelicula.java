package com.nuamx.screenmatch.modelos;

import com.nuamx.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificaion() {
        return (int) average();
    }
}
