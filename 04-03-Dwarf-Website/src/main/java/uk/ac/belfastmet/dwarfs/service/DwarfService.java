package uk.ac.belfastmet.dwarfs.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.belfastmet.dwarfs.domain.Dwarf;
import uk.ac.belfastmet.dwarfs.repository.DwarfsRepository;

@Service
public class DwarfService {
	
	@Autowired
	private DwarfsRepository dwarfRepository;
	
	private ArrayList<Dwarf> disneyDwarfs;
	private ArrayList<Dwarf> tolkienDwarfs;
	
	public ArrayList<Dwarf> getDisneyDwarfs(){
		this.disneyDwarfs = new ArrayList<Dwarf>();	
		
		//add dwarfs here!
		this.disneyDwarfs.add(new Dwarf("Sleepy", "Disney","Sleepy.png"));
		this.disneyDwarfs.add(new Dwarf("Happy", "Disney","Happy.png"));
		this.disneyDwarfs.add(new Dwarf("Bashful", "Disney","Bashful.png"));
		this.disneyDwarfs.add(new Dwarf("Dopey", "Disney","Dopey.png"));
		this.disneyDwarfs.add(new Dwarf("Doc", "Disney","Doc.png"));
		this.disneyDwarfs.add(new Dwarf("Grumpy", "Disney","Grumpy.png"));
		this.disneyDwarfs.add(new Dwarf("Sneezy", "Disney","Sneezy.png"));
		
		return this.disneyDwarfs;
	}
	
	public ArrayList<Dwarf> getTolkienDwarves(){
		this.tolkienDwarfs = new ArrayList<Dwarf>();	
		
		this.tolkienDwarfs.add(new Dwarf("Balin", "Tolkien","Balin.png"));
		this.tolkienDwarfs.add(new Dwarf("Bifur", "Tolkien","Bifur.png"));
		this.tolkienDwarfs.add(new Dwarf("Bofur", "Tolkien","Bofur.png"));
		this.tolkienDwarfs.add(new Dwarf("Dori", "Tolkien","Dori.png"));
		this.tolkienDwarfs.add(new Dwarf("Dwalin", "Tolkien","Dwalin.png"));
		this.tolkienDwarfs.add(new Dwarf("Fili", "Tolkien","Fili.png"));
		this.tolkienDwarfs.add(new Dwarf("Gloin", "Tolkien","Gloin.png"));
		this.tolkienDwarfs.add(new Dwarf("Kili", "Tolkien","Kili.png"));
		this.tolkienDwarfs.add(new Dwarf("Nori", "Tolkien","Nori.png"));
		this.tolkienDwarfs.add(new Dwarf("Oin", "Tolkien","Oin.png"));
		this.tolkienDwarfs.add(new Dwarf("Ori", "Tolkien","Ori.png"));
		this.tolkienDwarfs.add(new Dwarf("Thorin", "Tolkien","Thorin.png"));
		
		return this.tolkienDwarfs;
	}
	
	/**
	 * Get the dwarves from the mysql database
	 * 
	 * @return a dwarf iterable 
	 */
	public Iterable<Dwarf> getDBDwarfs()
	{
		Iterable <Dwarf> allDwarfs = dwarfRepository.findAll();
		return allDwarfs;
	}
	
	/*public Iterable<Dwarf> getDBDisneyDwarfs()
	{
		Iterable <Dwarf> allDwarfs = dwarfRepository.findAll();
		dwarfRepository.
		return allDwarfs;
	}*/
}
