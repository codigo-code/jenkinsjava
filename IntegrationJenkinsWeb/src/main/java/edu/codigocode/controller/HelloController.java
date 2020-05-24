package edu.codigocode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "saludo")
	public String saludar() {

		return "Hola mundo";
	}

}
