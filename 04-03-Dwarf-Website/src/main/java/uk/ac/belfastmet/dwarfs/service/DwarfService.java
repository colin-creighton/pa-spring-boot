package uk.ac.belfastmet.dwarfs.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;
import uk.ac.belfastmet.dwarfs.repository.DwarfsRepository;

@Service
public class DwarfService {
	
	Logger logger = LoggerFactory.getLogger(DwarfService.class);
	
	@Autowired
	private DwarfsRepository dwarfRepository;
	
	private ArrayList<Dwarf> disneyDwarfs;
	private ArrayList<Dwarf> tolkienDwarfs;
	
	/**
	 * Hardcoded dwarf entries. superceded by getDBDisneyDwarfs
	 * @return
	 */
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
	
	/**
	 * Hardcoded dwarf entries. superceded by getDBTolkienDwarfs
	 * @return
	 */
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
	
	/**
	 * Get the Disney Dwarfs from the database
	 * 
	 * @return an arraylist of disney dwarfs
	 */
	public ArrayList<Dwarf> getDBDisneyDwarfs()
	{
		Iterable <Dwarf> allDwarfs = dwarfRepository.findAll();
		Iterator <Dwarf> iterator = allDwarfs.iterator();
		ArrayList<Dwarf> disneyDwarfs = new ArrayList<Dwarf>();
		while(iterator.hasNext()) {			
			Dwarf currentDBDwarf = iterator.next();
			logger.info("{}",currentDBDwarf.toString());
			if(currentDBDwarf.getAuthor().equals("Disney")) {
				disneyDwarfs.add(currentDBDwarf);
			}
		}
		return disneyDwarfs;
	}
	
	/**
	 * Get the Disney Dwarfs from the database
	 * 
	 * @return an arraylist of disney dwarfs
	 */
	public ArrayList<Dwarf> getDBTolkienDwarfs()
	{
		Iterable <Dwarf> allDwarfs = dwarfRepository.findAll();
		Iterator <Dwarf> iterator = allDwarfs.iterator();
		ArrayList<Dwarf> tolkienDwarfs = new ArrayList<Dwarf>();
		while(iterator.hasNext()) {			
			Dwarf currentDBDwarf = iterator.next();
			logger.info("{}",currentDBDwarf+" ");
			if(currentDBDwarf.getAuthor().equals("Tokien")) {
				tolkienDwarfs.add(currentDBDwarf);
			}
		}
		return tolkienDwarfs;
	}
}
