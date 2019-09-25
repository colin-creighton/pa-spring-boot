package uk.ac.belfastmet.todoapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.todoapp.domain.ToDo;

/**
 * Sets up an interface which inherits from CrudRepository
 * and takes an array of ToDos and Longs
 * 
 * @author cre19171872
 *
 */
@Repository
public interface ToDoAppRepository extends CrudRepository<ToDo, Long>{
	
}
