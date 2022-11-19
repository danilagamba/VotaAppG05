package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ppalControlador {

	@GetMapping("/index")
	public String inicio() {
		return "/index";
	}
	
}
