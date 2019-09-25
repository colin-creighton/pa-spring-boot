package uk.ac.belfastmet.dwarfs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

/**
 * Sets up an interface to inherit CrudRepository methods
 * accepting an arraylist of Dwarfs and Longs.
 * @author cre19171872
 *
 */
@Repository
public interface DwarfsRepository extends CrudRepository<Dwarf, Long>{

}
