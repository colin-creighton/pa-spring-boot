package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/toystory")
public class ToyStoryController {

		@GetMapping("/woody")
		public String woody() {
			return "Woody was a serial killer trapped in a doll.";
		}
		@GetMapping("/buzz")
		public String buzz() {
			return "<b>Buzz was a narcoleptic carpenter.</b>";
		}
	
}
