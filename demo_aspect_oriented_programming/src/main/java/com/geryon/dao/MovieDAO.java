package com.geryon.dao;

import java.util.List;

import com.geryon.model.Movie;

public interface MovieDAO {
	
	public String addMovie(Movie movie) throws Exception;
	
	public List<Movie> getMovies() throws Exception;

}
