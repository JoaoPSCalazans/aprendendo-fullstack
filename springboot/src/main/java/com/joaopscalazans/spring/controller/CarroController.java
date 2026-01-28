package com.joaopscalazans.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaopscalazans.spring.entity.Carro;
import com.joaopscalazans.spring.service.CarroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService carroService;

@PostMapping("/save")
public ResponseEntity<String> save(@RequestBody Carro carro) {
    try {
        String message = this.carroService.save(carro);
        return new ResponseEntity<>(message, HttpStatus.OK);
    } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}

@GetMapping("/findById/{id}")
public ResponseEntity<Carro> findById(@PathVariable int id) {
    try {
        Carro carro = carroService.findById(id);
        return new ResponseEntity<>(carro, HttpStatus.OK);
    } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
   }
}


}
