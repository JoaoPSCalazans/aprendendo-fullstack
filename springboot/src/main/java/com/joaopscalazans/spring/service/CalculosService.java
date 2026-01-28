package com.joaopscalazans.spring.service;

import org.springframework.stereotype.Service;

import com.joaopscalazans.spring.entity.Entrada;
import com.joaopscalazans.spring.entity.Resultado;

@Service
public class CalculosService {

    public Resultado calcular(Entrada entrada) {
        Resultado resultado = new Resultado();
        if (entrada.getLista() != null) {

            int soma =  0;

            for (int i = 0; i < entrada.getLista().size(); i++) {
                soma += entrada.getLista().get(i);
            }
            resultado.setSoma(soma);
            resultado.setMedia((double) soma / entrada.getLista().size());

            exercicioAula01(resultado,entrada);
        }

        return resultado;
        
    }

    /*  Exercício: Alterar a API para que retorne também:
    * -maior numero da lista;
    * -menor numero da lista;
    * -total de numeros na lista.
     */
    private void exercicioAula01(Resultado resultado,Entrada entrada){

        int maiorN = 0;
        int menorN = entrada.getLista().get(1);
        for(int i = 0; i < entrada.getLista().size(); i ++){
            if (entrada.getLista().get(i) > maiorN) {
                maiorN = entrada.getLista().get(i);
            }
            if(entrada.getLista().get(i) < menorN){
                menorN = entrada.getLista().get(i);
            }
        }
        
        resultado.setMaior(maiorN);
        resultado.setMenor(menorN);
        resultado.setTotal(entrada.getLista().size());
    }

}
