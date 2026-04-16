package org.example;

import java.util.HashMap;
import java.util.Map;

public class Estadistica implements Informes{
    Map<String, Integer > mapaestadistica = new HashMap<>();

    public Estadistica(){
        this.mapaestadistica = new HashMap<>();
    }

    @Override
    public void verpoliticos() {
        System.out.println("identificando a la clase politica");

    }

    @Override
    public void informejuzgados() {

    }

    @Override
    public void verranking() {

    }


}
