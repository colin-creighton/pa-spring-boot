package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shrekmovie")
public class ShrekController {

	@GetMapping("/")
	public String shrek() {
		return "Shrek was wanted for crimes against animals.";
	}
	
	@GetMapping("/donkey")
	public String donkey() {
		return "Donkey was a fugitive of Interpol for 5 years.";
	}
}
