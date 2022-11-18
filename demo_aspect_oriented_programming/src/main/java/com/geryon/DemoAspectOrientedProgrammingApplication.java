package com.geryon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.geryon.model.Movie;
import com.geryon.service.MovieService;

@SpringBootApplication
public class DemoAspectOrientedProgrammingApplication implements CommandLineRunner{

	
	@Autowired
	MovieService movieService;
	
	@Autowired
	Environment environment;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoAspectOrientedProgrammingApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		getMovies();
	}

	private void getMovies() {
		try {
			String directorName = "Tim Miller";
			List<Movie> movieList = movieService.getMovies(directorName);
			System.out.println("Movie Name" + "\t\t" + "Director Name");
			System.out.println("***********" + "\t\t" + "***********");
			
			for(Movie movie : movieList) {
				System.out.println(movie.getMovieName() + " \t\t" + movie.getDirector().getDirectorName());
			}
		} catch(Exception exception) {
			System.out.println(environment.getProperty(exception.getMessage()));
		}	
	}

}
