package com.geryon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geryon.dao.MovieDAO;
import com.geryon.model.Movie;

@Service(value = "movieService")
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDAO movieDAO;
	
	@Override
	public String addMovie(Movie movie) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getMovies(String directorName) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
