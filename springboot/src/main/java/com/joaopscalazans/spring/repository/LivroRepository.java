package com.joaopscalazans.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaopscalazans.spring.entity.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
