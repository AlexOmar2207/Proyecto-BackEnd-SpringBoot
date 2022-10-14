package com.console.servicios;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.console.modelo.Persona;

public interface IPersonaServices {
	
	List<Persona> listar();
	Persona registrar(Persona persona);
	Persona actualizar(Persona persona);
	void eliminar(Integer codigo);
	Persona ListarPorId(Integer codigo);
	
	Page<Persona>listPageable(Pageable pageable);
}
