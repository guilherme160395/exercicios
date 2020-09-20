package com.mycompany.exercicio1;

import java.util.Arrays;
import java.util.List;

public class Exercicio1 {

    public static void main(String[] args) {
        ListaValores listaValores;
        
        List<Double> valores = Arrays.asList(88.00, 130.00, 54.90, 293.30, 44.80);
        
        listaValores = new ListaValores(valores);
        
        System.out.println(listaValores.gerarRemessas());
    }
    
}
