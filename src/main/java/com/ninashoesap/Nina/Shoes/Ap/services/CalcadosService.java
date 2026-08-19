package com.ninashoesap.Nina.Shoes.Ap.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninashoesap.Nina.Shoes.Ap.entities.Calcados;
import com.ninashoesap.Nina.Shoes.Ap.repositories.CalcadosRepository;

@Service
public class CalcadosService {

	@Autowired
	private CalcadosRepository repository;
	
	public List<Calcados> findAll(){
		return repository.findAll();
	}
	
	public Calcados findById(Long id) {
		Optional<Calcados> obj = repository.findById(id);
		return obj.get();
	}
	
	public Calcados insert(Calcados obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Calcados update(Long id, Calcados obj) {
		Calcados entity = repository.getReferenceById(id);
		updateData(entity,obj);
		return repository.save(entity);
	}
	
	private void updateData(Calcados entity, Calcados obj) {
		if(obj.getNomeSapato() != null)	entity.setNomeSapato(obj.getNomeSapato());
		if(obj.getTipoCalcado() != null) entity.setTipoCalcado(obj.getTipoCalcado());
		if(obj.getQtd33() != null) entity.setQtd33(obj.getQtd33());
	}
}
