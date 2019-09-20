package uk.ac.belfastmet.toptenmusic.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.toptenmusic.controller.TopTenMusicController;
import uk.ac.belfastmet.toptenmusic.domain.TopTenMusic;

@Service
public class TopTenMusicService {

	private ArrayList<TopTenMusic> topTenAlbums;
	private ArrayList<TopTenMusic> topTenSingles;
	
	Logger logger = LoggerFactory.getLogger(TopTenMusicService.class);

	public ArrayList<TopTenMusic> getTopTenAlbums() {
		this.topTenAlbums = new ArrayList<TopTenMusic>();

		this.topTenAlbums.add(new TopTenMusic("Boogie Woogie", "Freddie Slack", "cover1.jpg"));
		this.topTenAlbums.add(new TopTenMusic("On the Moon-Beam", "Vaughn Monroe", "cover2.jpg"));
		this.topTenAlbums.add(new TopTenMusic("King Cole Trio", "King Cole Trio", "cover3.jpg"));
		
		logger.info("Album service loaded");
		return topTenAlbums;
	}

	public ArrayList<TopTenMusic> getTopTenSingles() {
		this.topTenSingles = new ArrayList<TopTenMusic>();

		this.topTenSingles.add(new TopTenMusic("Don't Fence Me In", "Bing Crosby", "sing1.jpg"));
		this.topTenSingles.add(new TopTenMusic("Rum and Coca-Cola", "Andrews Sisters", "sing2.jpg"));
		this.topTenSingles.add(new TopTenMusic("Till the End of Time", "Perry Como", "sing3.jpg"));
		
		logger.info("Single service loaded");
		return topTenSingles;

	}
}
