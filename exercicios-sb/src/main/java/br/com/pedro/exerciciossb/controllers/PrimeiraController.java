package br.com.pedro.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiraController {

	// @RequestMapping(method = RequestMethod.GET,path = "/ola") // para definir em
	// qual requisição ele deve retornar o conteúdo do método
	
	@GetMapping(path = { "/ola", "/saudacao" })
	public String ola() {
		return "Olá Spring Boot!";
	}
}
