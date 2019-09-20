package uk.ac.belfastmet.toptenmusic.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.toptenmusic.domain.TopTenMusic;

@Service
public class TopTenMusicService {

	private ArrayList<TopTenMusic> topTenAlbums;
	private ArrayList<TopTenMusic> topTenSingles;

	public ArrayList<TopTenMusic> getTopTenAlbums() {
		this.topTenAlbums = new ArrayList<TopTenMusic>();

		this.topTenAlbums.add(new TopTenMusic("Boogie Woogie", "Freddie Slack", "cover1.jpg"));
		this.topTenAlbums.add(new TopTenMusic("On the Moon-Beam", "Vaughn Monroe", "cover2.jpg"));
		this.topTenAlbums.add(new TopTenMusic("King Cole Trio", "King Cole Trio", "cover3.jpg"));
		

		return topTenAlbums;
	}

	public ArrayList<TopTenMusic> getTopTenSingles() {
		this.topTenSingles = new ArrayList<TopTenMusic>();

		this.topTenSingles.add(new TopTenMusic("Don't Fence Me In", "Bing Crosby", "sing1.jpg"));
		this.topTenSingles.add(new TopTenMusic("Rum and Coca-Cola", "Andrews Sisters", "sing2.jpg"));
		this.topTenSingles.add(new TopTenMusic("Till the End of Time", "Perry Como", "sing3.jpg"));
		
		return topTenSingles;

	}
}
