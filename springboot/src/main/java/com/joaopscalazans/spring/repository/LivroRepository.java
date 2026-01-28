package com.joaopscalazans.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.joaopscalazans.spring.entity.Livro;

@Repository
// Simulação de banco de dados
public class LivroRepository {

    private List<Livro> list = new ArrayList<>();

    //Cread
    public boolean create(Livro livro){
        list.add(livro);
        return true;
    }
    //Read
    public List<Livro> findAll(){
            return list;
    }
    public Livro findById(int id){
            for (Livro livro : list) {
                if(livro.getId() == id){
                    return livro;
                }
            }
             return null;
    }
    //Update 
    public boolean update(int id,Livro update){
            Livro livro = findById(id);

            if(livro == null){
                return false;
            }

            livro.setTitulo(update.getTitulo());
            livro.setAutor(update.getAutor());
            livro.setEditora(update.getEditora());
            livro.setAno(update.getAno());

            return true;
    }
    //Delete 
    public boolean delete(int id){
            return list.removeIf(livro -> livro.getId() == id);
    }
}
