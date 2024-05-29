package com.edson.curso.spring.service;

import java.util.List;

import com.edson.curso.spring.domain.Cargo;
import com.edson.curso.spring.util.PaginacaoUtil;

public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();
	
	boolean cargoTemFuncionarios(Long id);
	
	PaginacaoUtil<Cargo> buscarPorPagina(int pagina, String direcao);
}
