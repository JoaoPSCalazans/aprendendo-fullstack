package com.joaopscalazans.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaopscalazans.spring.entity.Livro;
import com.joaopscalazans.spring.repository.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public void create(Livro livro){
         livroRepository.create(livro);
    }

    public List<Livro> findAll(){
            List<Livro> lista = livroRepository.findAll();
            return lista;
    }

    public Livro findById(int id){
            Livro livro = livroRepository.findById(id);
            return livro;
    }

    public String update(int id,Livro livro){
            if (livroRepository.update(id, livro)) {
                return "livro atualizado!";
            }else{
                return "Problema ao atualizar o livro";
            }
    }

    public boolean delete(int id){
          return livroRepository.delete(id);

}
}