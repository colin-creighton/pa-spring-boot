package uk.ac.belfastmet.dwarfs.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author cre19171872
 *
 */
@Entity
@Table(name = "tbldwarfpeople")
public class Dwarf {

	// instance variables
	private String name;
	private String author;
	private String image;
	private long id;

	/**
	 * Dwarf Constructor that accepts the following parameters:
	 * 
	 * @param name   type String
	 * @param author type String
	 * @param image  type String
	 */
	public Dwarf(String name, String author, String image) {
		super();
		this.name = name;
		this.author = author;
		this.image = image;
	}

	public Dwarf() {
		super();
	}

	// getters and setters

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	/**
	 * Dwarf toString
	 * @returns Name and author of the dwarf
	 */
	@Override
	public String toString() {
		return "Name of Dwarf is " + name + " and the author is " + author;
	}

}
