package uk.ac.belfastmet;

import java.util.ArrayList;

public class MainD {

	public static void main(String[] args) {
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		Dwarf sleepy = new Dwarf();
		sleepy.setName("Sleepy");
		sleepy.setAuthor("Disney");
		dwarfs.add(sleepy);
		
		Dwarf grumpy = new Dwarf();
		grumpy.setName("Grumpy");
		grumpy.setAuthor("Disney");
		dwarfs.add(grumpy);
		
		Dwarf doc = new Dwarf();
		doc.setName("Doc");
		doc.setAuthor("Disney");
		dwarfs.add(doc);
		
		Dwarf thorin = new Dwarf();
		thorin.setName("Thorin");
		thorin.setAuthor("Tolkien");
		dwarfs.add(thorin);
		
		Dwarf balin = new Dwarf();
		balin.setName("Balin");
		balin.setAuthor("Tolkien");
		dwarfs.add(balin);
		
		Dwarf gimli = new Dwarf();
		gimli.setName("Gimli");
		gimli.setAuthor("Tolkien");
		dwarfs.add(gimli);
		
		//System.out.println("The dwarfs are: ");
		System.out.println("The Disney dwarfs are: ");
		for(Dwarf dwarf:dwarfs) {
			if(dwarf.getAuthor().equals("Disney"))
				System.out.println(dwarf.getName());						
		}
		
		System.out.println("The Tolkien dwarfs are: ");
		for(Dwarf dwarf:dwarfs) {
			if(dwarf.getAuthor().equals("Tolkien"))
				System.out.println(dwarf.getName());						
		}
			

	}

}
