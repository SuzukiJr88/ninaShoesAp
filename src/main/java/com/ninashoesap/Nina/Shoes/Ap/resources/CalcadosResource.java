package com.ninashoesap.Nina.Shoes.Ap.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninashoesap.Nina.Shoes.Ap.entities.Calcados;
import com.ninashoesap.Nina.Shoes.Ap.entities.enums.TipoCalcado;
import com.ninashoesap.Nina.Shoes.Ap.services.CalcadosService;

@RestController
@RequestMapping(value = "/calcados")
public class CalcadosResource {

	@Autowired
	private CalcadosService service;
	
	@GetMapping
	public ResponseEntity<List<Calcados>> findAll(){
		List<Calcados> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Calcados> findById(@PathVariable Long id){
		Calcados obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
