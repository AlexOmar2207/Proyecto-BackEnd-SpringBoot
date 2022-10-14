package com.console.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.console.modelo.Pais;

public interface IPaisRepository extends JpaRepository<Pais, Integer>{
	
}
