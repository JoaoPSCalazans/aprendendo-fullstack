package com.joaopscalazans.spring.service;

import org.springframework.stereotype.Service;

import com.joaopscalazans.spring.entity.Carro;

@Service
public class CarroService {

    public String save(Carro carro){
        return "Carro Salvo com sucesso";
    }

    public Carro findById(int id){
        if(id == 1){
            Carro carro = new Carro();
            carro.setNome("carrinho");
            carro.setMarca("bOaa");
            carro.setModelo("abc");
            carro.setAnoFabricacao(2001);
            return carro;
        }
        return null;
    }

}
