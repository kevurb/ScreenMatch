package com.nuamx.screenmatch.modelos;

public class Serie extends Titulo {
    int temporadas;
    int episodiosPorTemporada;
    int minutoPorEpisodio;


    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporada * minutoPorEpisodio;
    }
    public int getMinutoPorEpisodio() {
        return minutoPorEpisodio;
    }
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public int getTemporadas() {
        return temporadas;
    }

    public void setMinutoPorEpisodio(int minutoPorEpisodio) {
        this.minutoPorEpisodio = minutoPorEpisodio;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
}
