package com.console.servicios;

import java.util.List;

import com.console.modelo.Sexo;


public interface ISexoService {
	List<Sexo> listar();
	Sexo registrar(Sexo sexo);
	Sexo actualizar(Sexo sexo);
	void eliminar(Integer id);
	Sexo ListarPorId(Integer id);
}
