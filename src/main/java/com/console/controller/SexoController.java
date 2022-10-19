package com.console.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.console.modelo.Sexo;
import com.console.servicios.ISexoService;

@RestController
@RequestMapping("/sexo")
public class SexoController {
	
	@Autowired
	ISexoService service;
	
	@GetMapping
	public ResponseEntity<List<Sexo>> listar(){
		List<Sexo> obj = service.listar();
		return new ResponseEntity<List<Sexo>>(obj, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Sexo> registrar(@RequestBody Sexo sexo){
		Sexo obj = service.registrar(sexo);
		return new ResponseEntity<Sexo>(obj, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Sexo> actualizar(@RequestBody Sexo sexo){
		Sexo obj = service.actualizar(sexo);
		return new ResponseEntity<Sexo>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
		Sexo obj = service.ListarPorId(id);
		
		if(obj == null) {
			throw new Exception("No se encontro el ID");
		}
		
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Sexo> listarPorId(@PathVariable("id") Integer codigo) throws Exception{
		Sexo obj = service.ListarPorId(codigo);
		
		if(obj == null) {
			throw new Exception("No se encontro el ID");
		}
		
		return new ResponseEntity<Sexo>(obj, HttpStatus.OK);
	}

}
