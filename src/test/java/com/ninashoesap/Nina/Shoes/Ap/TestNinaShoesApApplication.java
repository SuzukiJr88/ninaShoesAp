package com.ninashoesap.Nina.Shoes.Ap;

import org.springframework.boot.SpringApplication;

public class TestNinaShoesApApplication {

	public static void main(String[] args) {
		SpringApplication.from(NinaShoesApApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
