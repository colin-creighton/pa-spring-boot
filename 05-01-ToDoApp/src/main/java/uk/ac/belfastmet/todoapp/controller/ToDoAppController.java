package uk.ac.belfastmet.todoapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.todoapp.service.ToDoAppService;


@Controller
@RequestMapping
public class ToDoAppController {
	
	Logger logger = LoggerFactory.getLogger(ToDoAppController.class);
	
	/**
	 * This method sets home page and outputs log message
	 * @return the index page
	 */
	
	@RequestMapping(value="", method= RequestMethod.GET)
	public String homePage(Model model) {
		ToDoAppService myToDoService = new ToDoAppService();
		model.addAttribute("pageTitle","My To Do List");
		model.addAttribute("tasks",myToDoService.getTasks());
		logger.info("Index Page Loaded");
		return "index";
	}
	
	

}
