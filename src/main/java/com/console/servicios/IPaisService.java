package com.console.servicios;

import java.util.List;

import com.console.modelo.Pais;

public interface IPaisService {
	List<Pais> listar();
	Pais registrar(Pais pais);
	Pais actualizar(Pais pais);
	void eliminar(Integer codigo);
	Pais ListarPorId(Integer codigo);
}
