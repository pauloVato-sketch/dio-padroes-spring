package com.nascimento.padroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * Projeto exemplo de padrões de projeto no Spring
 * Deps:
 * 	- Web
 *  - Data JPA
 *  - H2
 *  - OpenFEIGN
 */
@EnableFeignClients
@SpringBootApplication
public class PadroesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesApplication.class, args);
	}

}
