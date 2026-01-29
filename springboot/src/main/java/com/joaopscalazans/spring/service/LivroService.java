package com.joaopscalazans.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaopscalazans.spring.entity.Livro;
import com.joaopscalazans.spring.repository.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public void create(Livro livro){
         livroRepository.save(livro);
    }

    public Iterable<Livro> findAll(){
            Iterable<Livro> livros = livroRepository.findAll();
            return livros;
    }

    public Livro findById(Long id){
            Optional<Livro> livro = livroRepository.findById(id);
            return livro.get();
    }

    public String update(Long id,Livro source){
        Livro target = livroRepository.findById(id).get();
        target.setTitulo(source.getTitulo());
        target.setAno(source.getAno());
        target.setEditora(source.getEditora());
        target.setAutor(source.getAutor());


        livroRepository.save(target);
         return "ok";
    }

    public String delete(Long id){
           livroRepository.deleteById(id);;
           return"ok";

}
}