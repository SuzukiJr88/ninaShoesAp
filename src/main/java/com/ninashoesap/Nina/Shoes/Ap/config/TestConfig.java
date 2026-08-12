package com.ninashoesap.Nina.Shoes.Ap.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ninashoesap.Nina.Shoes.Ap.entities.Calcados;
import com.ninashoesap.Nina.Shoes.Ap.entities.enums.TipoCalcado;
import com.ninashoesap.Nina.Shoes.Ap.repositories.CalcadosRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private CalcadosRepository calcadosRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Calcados cal1 = new Calcados(null, "Sapato Marrom", TipoCalcado.SAPATO, 10);
		Calcados cal2 = new Calcados(null, "Bota Amarela", TipoCalcado.BOTA, 2);
		Calcados cal3 = new Calcados(null, "Rasteirinha Rosa", TipoCalcado.RASTEIRINHA, 5);
		
		calcadosRepository.saveAll(Arrays.asList(cal1,cal2,cal3));
	}
}
