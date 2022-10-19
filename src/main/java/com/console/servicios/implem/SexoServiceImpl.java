package com.console.servicios.implem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.console.modelo.Sexo;
import com.console.repositorio.ISexoRepository;
import com.console.servicios.ISexoService;


@Service
public class SexoServiceImpl implements ISexoService {

	@Autowired
	ISexoRepository repo;
	
	@Override
	public List<Sexo> listar() {
		return repo.findAll();
	}

	@Override
	public Sexo registrar(Sexo sexo) {
		return repo.save(sexo);
	}

	@Override
	public Sexo actualizar(Sexo sexo) {
		// TODO Auto-generated method stub
		return repo.save(sexo);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Sexo ListarPorId(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

}
