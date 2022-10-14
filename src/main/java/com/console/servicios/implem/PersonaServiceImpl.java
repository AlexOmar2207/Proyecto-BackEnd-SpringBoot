package com.console.servicios.implem;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.console.modelo.Persona;
import com.console.repositorio.IPersonaRepository;
import com.console.servicios.IPersonaServices;

@Service
public class PersonaServiceImpl implements IPersonaServices{

	@Autowired
	IPersonaRepository repo;
	
	@Override
	public List<Persona> listar() {
		return repo.findAll();
	}

	@Override
	public Persona registrar(Persona persona) {
		return repo.save(persona);
	}

	@Override
	public Persona actualizar(Persona persona) {
		return repo.save(persona);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
	}

	@Override
	public Persona ListarPorId(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}

	@Override
	public Page<Persona> listPageable(Pageable pageable) {
		return repo.findAll(pageable);
	}


	
	
	

}
