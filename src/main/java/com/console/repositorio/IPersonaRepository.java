package com.console.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import com.console.modelo.Persona;



public interface IPersonaRepository extends JpaRepository<Persona, Integer>{

	
	
}	
