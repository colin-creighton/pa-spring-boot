package uk.ac.belfastmet;

public class Dwarf {
	
	String name = "";
	String author = "";
	
	public Dwarf(String name, String author){
		this.name = name;
		this.author = author;
	}
	
	  public Dwarf() {
	  
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

}
