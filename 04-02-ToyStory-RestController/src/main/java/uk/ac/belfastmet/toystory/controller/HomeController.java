package uk.ac.belfastmet.toystory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping()
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}


}
