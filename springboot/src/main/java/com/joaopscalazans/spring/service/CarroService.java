package com.joaopscalazans.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaopscalazans.spring.entity.Carro;
import com.joaopscalazans.spring.repository.CarroRepository;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public String save(Carro carro){
        carroRepository.save(carro);
        return"ok";
    }

    public Carro findById(int id){
        return null;
    }

}
