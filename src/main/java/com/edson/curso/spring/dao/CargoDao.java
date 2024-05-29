package com.edson.curso.spring.dao;

import java.util.List;

import com.edson.curso.spring.domain.Cargo;
import com.edson.curso.spring.util.PaginacaoUtil;

public interface CargoDao {

    void save(Cargo cargo );

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
    
    PaginacaoUtil<Cargo> buscaPaginada(int pagina, String direcao);
}
