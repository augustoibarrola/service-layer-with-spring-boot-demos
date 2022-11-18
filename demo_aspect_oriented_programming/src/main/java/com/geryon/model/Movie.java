package com.geryon.model;

import java.time.LocalDate;

public class Movie {
	
	private String movieId;
	private String movieName;
	private String language;
	private LocalDate releasedIn;
	private Integer revenueInDollars;
	private Director director;
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public LocalDate getReleasedIn() {
		return releasedIn;
	}
	public void setReleasedIn(LocalDate releasedIn) {
		this.releasedIn = releasedIn;
	}
	public Integer getRevenueInDollars() {
		return revenueInDollars;
	}
	public void setRevenueInDollars(Integer revenueInDollars) {
		this.revenueInDollars = revenueInDollars;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	

}
