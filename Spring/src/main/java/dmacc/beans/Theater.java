package dmacc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Theater {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "theater_name")
	private String TheaterName;
	@Column(name = "opening_times")
	private String OpeningTimes;
	@Column(name = "snack_list")
	private String SnackList;

	@Autowired
	private Movie movie;

	public Theater() {
		super();
	}

	public Theater(String TheaterName) {
		super();
		this.TheaterName = TheaterName;
	}

	public Theater(String TheaterName, String OpeningTimes, String SnackList) {
		super();
		this.TheaterName = TheaterName;
		this.OpeningTimes = OpeningTimes;
		this.SnackList = SnackList;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", TheaterName=" + TheaterName + ", OpeningTimes=" + OpeningTimes + ", SnackList="
				+ SnackList + ", movie=" +movie+ "]";
	}

	public Theater(long id, String TheaterName, String OpeningTimes, String SnackList) {
		super();
		this.id = id;
		this.TheaterName = TheaterName;
		this.OpeningTimes = OpeningTimes;
		this.SnackList = SnackList;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTheaterName() {
		return TheaterName;
	}

	public void setTheaterName(String theaterName) {
		TheaterName = theaterName;
	}

	public String getOpeningTimes() {
		return OpeningTimes;
	}

	public void setOpeningTimes(String openingTimes) {
		OpeningTimes = openingTimes;
	}

	public String getSnackList() {
		return SnackList;
	}

	public void setSnackList(String snackList) {
		SnackList = snackList;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Theater(long id, String theaterName, String openingTimes, String snackList, Movie movie) {
		super();
		this.id = id;
		TheaterName = theaterName;
		OpeningTimes = openingTimes;
		SnackList = snackList;
		this.movie = movie;
	}



}
