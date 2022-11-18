package com.geryon.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.geryon.model.Director;
import com.geryon.model.Movie;


@Repository(value = "movieDAO")
public class MovieDAOImpl implements MovieDAO {

	/*
	 * TODO Currently, this method does not actually add a movie 
	 * 		to any repository 
	 */
	@Override
	public String addMovie(Movie movie) throws Exception {
		
		return movie.getMovieId();
	}

	@Override
	public List<Movie> getMovies() throws Exception {
		
		List<Movie> movieList = new ArrayList<Movie>();
		
		Movie movie1 = new Movie();
			movie1.setMovieId("M1002");
			movie1.setMovieName("Fantasia");
			movie1.setLanguage("English");
			movie1.setReleasedIn(LocalDate.of(1994, 7, 1));
			movie1.setRevenueInDollars(16800000);
			
		Director director1 = new Director();
			director1.setDirectorId("D102");
			director1.setDirectorName("Patrick Johnson");
			director1.setBornIn(1962);
			
		movie1.setDirector(director1);
			

		Movie movie2 = new Movie();
			movie2.setMovieId("M1004");
			movie2.setMovieName("Terminator");
			movie2.setLanguage("English");
			movie2.setReleasedIn(LocalDate.of(1984, 10, 26));
			movie2.setRevenueInDollars(16800000);
			
		Director director2 = new Director();
			director2.setDirectorId("D103");
			director2.setDirectorName("Tim Miller");
			director2.setBornIn(1965);
			
		movie2.setDirector(director2);
		
		movieList.add(movie1);
		movieList.add(movie2);
			
		return movieList;
	}

}
