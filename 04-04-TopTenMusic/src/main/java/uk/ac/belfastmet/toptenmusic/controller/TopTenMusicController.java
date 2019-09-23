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
	
	/**
	 * This method sets home page and outputs log message
	 * @return the index page
	 */
	
	@RequestMapping("/")
	public String homePage() {
		logger.info("Index Page Loaded");
		return "index";
	}
	

	
	@RequestMapping(value="/singles",method=RequestMethod.GET)
	/**
	 * This method sets home page and outputs log message
	 * @param model The model of the singles
	 * @return the singles page
	 */
	public String singlesPage(Model model) {
		TopTenMusicService topTenService = new TopTenMusicService();
		model.addAttribute("pageTitle","Top Ten Singles");
		model.addAttribute("topTen",topTenService.getTopTenSingles());
		logger.info("Singles Page Loaded");
		return "singles";
	}
	
	/**
	 * This method sets home page and outputs log message
	 * @param model The model of the albums
	 * @return the albums page
	 */
	
	@RequestMapping(value="/albums",method=RequestMethod.GET)
	public String albumsPage(Model model) {
		TopTenMusicService topTenService = new TopTenMusicService();
		model.addAttribute("pageTitle","Top Ten Albums");
		model.addAttribute("topTen",topTenService.getTopTenAlbums());
		logger.info("Albums Page Loaded");
		return "albums";
	}
	

}
