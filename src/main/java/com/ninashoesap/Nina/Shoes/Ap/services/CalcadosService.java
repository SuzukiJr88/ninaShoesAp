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
}
