package com.cinemacalm.catalogo.calculos;

import com.cinemacalm.catalogo.modelos.Pelicula;
import com.cinemacalm.catalogo.modelos.Serie;
import com.cinemacalm.catalogo.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Pelicula p){
        tiempoTotal += p.getDuracionEnMinutos();
    }

    public void incluye(Titulo T){
        this.tiempoTotal += T.getDuracionEnMinutos();
    }
}
