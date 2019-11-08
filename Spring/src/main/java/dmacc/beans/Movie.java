package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Movie {
	
	private String MovieName;
	private String Rating;
	private String MainCharacter;

	public Movie() {
		super();
	}

	@Override
	public String toString() {
		return "Address [MovieName=" + MovieName + ", Rating=" + Rating + ", MainCharacter=" + MainCharacter + "]";
	}

	public Movie(String MovieName, String Rating, String MainCharacter) {
		super();
		this.MovieName = MovieName;
		this.Rating = Rating;
		this.MainCharacter = MainCharacter;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String MovieName) {
		this.MovieName = MovieName;
	}

	public String getRating() {
		return Rating;
	}

	public void setRating(String Rating) {
		this.Rating = Rating;
	}

	public String getMainCharacter() {
		return MainCharacter;
	}

	public void setMainCharacter(String MainCharacter) {
		this.MainCharacter = MainCharacter;
	}

}
