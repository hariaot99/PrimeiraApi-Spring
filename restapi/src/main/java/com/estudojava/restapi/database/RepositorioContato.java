package com.estudojava.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.restapi.entidade.Contato;

public interface RepositorioContato extends JpaRepository<Contato, Long>{
    
}
