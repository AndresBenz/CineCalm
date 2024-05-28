package com.cinemacalm.catalogo.modelos;

import com.cinemacalm.catalogo.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion { //extends es para aclararle a la clase que pelicula es una extencion de titulo o (hijo)
    //El imprements es para usar lo que tiene la clase clasificacion, pero en esta clase tengo que implementar un metodo del mismo
    private  String director;

    public String getDirecto() {
        return director;
    }

    public void setDirecto(String directo) {
        this.director = directo;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }
}
