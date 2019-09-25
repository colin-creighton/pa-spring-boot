package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import uk.ac.belfastmet.dwarfs.service.DwarfService;

@Controller
@RequestMapping
public class DwarfsController {
	
	@Autowired
	private DwarfService dwarfService;
	
	/**
	 * homePage()
	 * @return index page
	 */
	@GetMapping()
	public String homePage(Model model) {
		model.addAttribute("pageTitle","Home Of All Dwarfs");
		model.addAttribute("dwarfs",dwarfService.getDBDwarfs());
		return "index";
	}
	
	/**
	 * disneyPage()
	 * @param model adds title and disney dwarfs variables for thymeleaf
	 * @return disney page
	 */
	@GetMapping("/disney")
	public String disneyPage(Model model) {
		model.addAttribute("pageTitle","Disney Dwarfs");
		model.addAttribute("dwarfs",dwarfService.getDBDisneyDwarfs());
		
		return "disney";
	}
	
	/**
	 * tolkienPage()
	 * @param model adds title and tolkien dwarfs variables for thymeleaf
	 * @return tolkien page
	 */
	@GetMapping("/tolkien")
	public String tolkienPage(Model model) {
		DwarfService dwarfService = new DwarfService();
		model.addAttribute("pageTitle","Tolkien Dwarves");
		model.addAttribute("dwarfs",dwarfService.getDBDwarfs());
		
		return "tolkien";
	}
}
