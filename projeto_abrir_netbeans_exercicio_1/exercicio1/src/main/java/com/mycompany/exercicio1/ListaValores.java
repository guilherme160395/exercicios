package com.mycompany.exercicio1;

import java.util.List;

public class ListaValores {
    private List<Double> valores;
    
    ListaValores(List<Double> valores) {
        //this.valores = valores;
         this.valores = valores;
    }

    public List<Double> getValores() {
        return valores;
    }

    public void setValores(List<Double> valores) {
        this.valores = valores;
    }
    
    public String gerarRemessas() {
        if(valores.isEmpty()) {
            return "Não é possível gerar remessas!";
        } else {
            String texto = "Remessa gerada: ";
            int contador = 1;
            double total = 0;
            for(int indice = 0; indice < valores.size(); indice++) {
                total += valores.get(indice);
                String valorFormatoBrasileiro = String.format("%.2f", valores.get(indice));
                valorFormatoBrasileiro = valorFormatoBrasileiro.replace(".", ",");
                if(indice < valores.size() - 2) {
                    texto += String.valueOf(contador) + " cujo valor é R$ " + valorFormatoBrasileiro + ", ";
                } else if(indice == valores.size() - 2) {
                    texto += String.valueOf(contador) + " cujo valor é R$ " + valorFormatoBrasileiro;
                } else {
                    String stringTotal = String.format("%.2f", total);
                    stringTotal = stringTotal.replace(".", ",");
                    texto += " e " + String.valueOf(contador) + " cujo valor é R$ " + valorFormatoBrasileiro + ". Total = " + stringTotal + ".";
                }
                contador++;
            }
            return texto;
        }
    }
}
