package br.com.alura.screenmath.calculo;

import br.com.alura.screenmath.modelos.Filme;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assitir depois");
        }
    }

}
