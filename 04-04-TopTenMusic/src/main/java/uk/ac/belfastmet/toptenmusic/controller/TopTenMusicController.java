package uk.ac.belfastmet.toptenmusic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import uk.ac.belfastmet.toptenmusic.service.TopTenMusicService;

@Controller
@RequestMapping()
public class TopTenMusicController {
	
	Logger logger = LoggerFactory.getLogger(TopTenMusicController.class);
	
	@RequestMapping("/")
	public String homePage() {
		logger.info("Index Page Loaded");
		return "index";
	}
	
	@RequestMapping(value="/singles",method=RequestMethod.GET)
	public String disneyPage(Model model) {
		TopTenMusicService topTenService = new TopTenMusicService();
		model.addAttribute("pageTitle","Top Ten Singles");
		model.addAttribute("topTen",topTenService.getTopTenSingles());
		logger.info("Singles Page Loaded");
		return "singles";
	}
	
	@RequestMapping(value="/albums",method=RequestMethod.GET)
	public String tolkienPage(Model model) {
		TopTenMusicService topTenService = new TopTenMusicService();
		model.addAttribute("pageTitle","Top Ten Albums");
		model.addAttribute("topTen",topTenService.getTopTenAlbums());
		logger.info("Albums Page Loaded");
		return "albums";
	}
	

}
