package com.nuamx.screenmatch.calculos;

import com.nuamx.screenmatch.modelos.Pelicula;
import com.nuamx.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal+= titulo.getDuracionEnMinutos();
    }
}
