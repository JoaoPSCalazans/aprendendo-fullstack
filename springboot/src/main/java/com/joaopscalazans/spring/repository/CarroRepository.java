package com.joaopscalazans.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaopscalazans.spring.entity.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
