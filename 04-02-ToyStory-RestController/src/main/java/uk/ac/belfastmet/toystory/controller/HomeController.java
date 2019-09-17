package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "Home Page";
	}
	@GetMapping("/woody")
	public String woody() {
		return "Woody was a serial killer trapped in a doll.";
	}
	@GetMapping("/buzz")
	public String buzz() {
		return "<b>Buzz was a narcoleptic carpenter.</b>";
	}

}
