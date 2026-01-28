package com.joaopscalazans.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaopscalazans.spring.entity.Entrada;
import com.joaopscalazans.spring.entity.Resultado;
import com.joaopscalazans.spring.service.CalculosService;

@RestController
@RequestMapping("/calculos")
public class CalculosController {

    @Autowired
    private CalculosService calculosService;

    @GetMapping("/calcular")
    public ResponseEntity<Resultado> calcular(@RequestBody Entrada entrada){
        try {
            Resultado resultado = this.calculosService.calcular(entrada);
            return new ResponseEntity<Resultado>( resultado, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
