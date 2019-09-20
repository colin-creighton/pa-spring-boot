package uk.ac.belfastmet.toptenmusic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import uk.ac.belfastmet.toptenmusic.service.TopTenMusicService;

@Controller
@RequestMapping()
public class TopTenMusicController {
	
	@GetMapping()
	public String homePage() {
		return "index";
	}
	
	@RequestMapping(value="/singles",method=RequestMethod.GET)
	public String disneyPage(Model model) {
		TopTenMusicService topTenService = new TopTenMusicService();
		model.addAttribute("pageTitle","Top Ten Singles");
		model.addAttribute("topTen",topTenService.getTopTenSingles());
		
		return "singles";
	}
	
	@RequestMapping(value="/albums",method=RequestMethod.GET)
	public String tolkienPage(Model model) {
		TopTenMusicService topTenService = new TopTenMusicService();
		model.addAttribute("pageTitle","Top Ten Albums");
		model.addAttribute("topTen",topTenService.getTopTenAlbums());
		
		return "albums";
	}
	
	@RequestMapping(value="/error",method=RequestMethod.GET)
	public String errorPage() {
		return "error";
	}

}
