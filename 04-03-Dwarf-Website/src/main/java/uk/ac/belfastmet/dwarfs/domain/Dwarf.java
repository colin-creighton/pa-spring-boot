package uk.ac.belfastmet.dwarfs.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="dwarfpeople")
public class Dwarf {
	
	//instance variables
	private String name;
	private String author;
	private String image;
	
	
	
	/**
	 * Dwarf Constructor that accepts the following parameters:
	 * 
	 * @param name type String
	 * @param author type String
	 * @param image type String
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
	
	//getters and setters
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
	
	

}
