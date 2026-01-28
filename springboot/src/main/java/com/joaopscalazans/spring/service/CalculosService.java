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
        }

        return resultado;
        
    }

}
