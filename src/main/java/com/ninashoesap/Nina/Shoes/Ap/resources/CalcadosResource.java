package com.ninashoesap.Nina.Shoes.Ap.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninashoesap.Nina.Shoes.Ap.entities.Calcados;
import com.ninashoesap.Nina.Shoes.Ap.entities.enums.TipoCalcado;

@RestController
@RequestMapping(value = "/calcados")
public class CalcadosResource {

	@GetMapping
	public ResponseEntity<Calcados> findAll(){
		Calcados sapatilha = new Calcados("sapatilha",TipoCalcado.SAPATILHA,1);
		return ResponseEntity.ok().body(sapatilha);
	}
}
