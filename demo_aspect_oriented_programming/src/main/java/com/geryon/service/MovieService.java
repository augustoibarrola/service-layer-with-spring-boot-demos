package com.geryon.service;

import java.util.List;

import com.geryon.model.Movie;

public interface MovieService {
	
	public String addMovie(Movie movie) throws Exception;
	
	public List<Movie> getMovies(String directorName) throws Exception;

}
