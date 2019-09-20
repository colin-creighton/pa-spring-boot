package uk.ac.belfastmet.toptenmusic.domain;

public class TopTenMusic {

	private String title;
	private String artist;
	private String cover;

	public TopTenMusic() {
		super();
	}

	public TopTenMusic(String title, String artist, String cover) {
		super();
		this.title = title;
		this.artist = artist;
		this.cover = cover;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String toString() {
		return title + " " + artist;
	}
}
