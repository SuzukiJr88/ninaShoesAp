package com.ninashoesap.Nina.Shoes.Ap.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ninashoesap.Nina.Shoes.Ap.entities.Calcados;
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
	
	@PostMapping
	public ResponseEntity<Calcados> insert(@RequestBody Calcados obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Calcados> update(@PathVariable Long id, @RequestBody Calcados obj){
		obj = service.update(id,obj);
		return ResponseEntity.ok().body(obj);
	}
}
