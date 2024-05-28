package com.cinemacalm.catalogo.calculos;

public class FiltroRecomendaciones {

    public void filtra(Clasificacion clasifica){
        if(clasifica.getClasificacion()>=4){
            System.out.println(" Muy bien evaluado ");
        }
        else{
            System.out.println(" Muy mala ");
        }
    }
}
