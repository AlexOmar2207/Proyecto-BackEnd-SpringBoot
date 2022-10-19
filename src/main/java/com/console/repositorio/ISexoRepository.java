package com.console.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.console.modelo.Sexo;

public interface ISexoRepository extends JpaRepository<Sexo, Integer>{
	
}
