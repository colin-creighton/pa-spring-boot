package uk.ac.belfastmet.todoapp.service;

import java.util.ArrayList;
import org.slf4j.*;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.todoapp.domain.ToDo;

@Service
public class ToDoAppService {
	
	private ArrayList<ToDo> taskList;
	
	Logger logger = LoggerFactory.getLogger(ToDoAppService.class);
	
	public ArrayList<ToDo> getTasks(){
		this.taskList = new ArrayList<ToDo>();
		
		this.taskList.add(new ToDo("23-09-2019","Deliver award winning presentation", "TedTalk", false, 3,"Colin"));
		this.taskList.add(new ToDo("24-09-2019","Learn how to handstand", "Gymnastics", false, 2,"Albus"));
		this.taskList.add(new ToDo("25-09-2019","Write million pound app", "Code", false, 1,"Kvoth"));
		this.taskList.add(new ToDo("26-09-2019","Wash the dishes", "Chores", false, 1,"Geralt"));
		this.taskList.add(new ToDo("27-09-2019","Vaccuum the cat", "Pets", false, 1,"Pugwash"));
		
		logger.info("Tasks loaded");
		return taskList;
	}

}
