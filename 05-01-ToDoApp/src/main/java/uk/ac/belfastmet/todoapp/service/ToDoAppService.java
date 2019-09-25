package uk.ac.belfastmet.todoapp.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.todoapp.domain.ToDo;
import uk.ac.belfastmet.todoapp.repository.ToDoAppRepository;

@Service
public class ToDoAppService {
	
	@Autowired
	private ToDoAppRepository todoRepository;
	
	private ArrayList<ToDo> taskList;
	
	Logger logger = LoggerFactory.getLogger(ToDoAppService.class);
	
	/**
	 * Get Tasks
	 * 
	 * @return A task list 
	 */
	public ArrayList<ToDo> getTasks(){
		this.taskList = new ArrayList<ToDo>();
		
		this.taskList.add(new ToDo("23-09-2019","Deliver award winning presentation", "TedTalk", false, 3,"Colin"));
		this.taskList.add(new ToDo("24-09-2019","Learn how to handstand", "Gymnastics", true, 2,"Albus"));
		this.taskList.add(new ToDo("25-09-2019","Write million pound app", "Code", false, 1,"Kvoth"));
		this.taskList.add(new ToDo("26-09-2019","Wash the dishes", "Chores", true, 3,"Geralt"));
		this.taskList.add(new ToDo("27-09-2019","Vaccuum the cat", "Pets", false, 1,"Pugwash"));
		
		logger.info("Tasks loaded");
		return taskList;
	}
	
	/*@Override
	public void run(String...args) throws Exception{
		todoRepository.save(new ToDo("23-09-2019","Deliver award winning presentation", "TedTalk", false, 3,"Colin"));
		todoRepository.save(new ToDo("24-09-2019","Learn how to handstand", "Gymnastics", true, 2,"Albus"));
		todoRepository.save(new ToDo("25-09-2019","Write million pound app", "Code", false, 1,"Kvoth"));
		todoRepository.save(new ToDo("26-09-2019","Wash the dishes", "Chores", true, 3,"Geralt"));
		todoRepository.save(new ToDo("27-09-2019","Vaccuum the cat", "Pets", false, 1,"Pugwash"));
	}*/

	/**
	 * Get Number Of Tasks
	 * 
	 * @return A ToDo Iterable
	 */
	public Iterable<ToDo> getDBTasks()
	{
		logger.info("# of tasks: {}", todoRepository.count());
		
		Iterable <ToDo> toDoTasks = todoRepository.findAll();
		Iterator <ToDo> iterator = toDoTasks.iterator();
		while(iterator.hasNext()) {
			logger.info("{}",iterator.next().toString());
		}
		return toDoTasks;
	}
}
