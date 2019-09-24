package uk.ac.belfastmet.todoapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.todoapp.domain.ToDo;

@Repository
public interface ToDoAppRepository extends CrudRepository<ToDo, Long>{
	
}
