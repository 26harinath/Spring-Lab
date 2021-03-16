package org.capg.demo.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.capg.demo.bean.Movies;
import org.capg.demo.dao.MovieJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceJpa {

	@Autowired
	private MovieJpaRepository mRepo;
	
	public List<Movies> displayAll(){
		return mRepo.findAll();
	}
	public Movies findMovieByName(String name) {
		return mRepo.findById(name).get();
	}
	public List<Movies> findMovieByGenre(String genre){
		return mRepo.findByGenre(genre);
	}
	public String addMovie(Movies movie){
		String regex ="^[a-zA-Z0-9]+$"; 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher  = pattern.matcher(movie.getName());
		if(matcher.matches() && movie.getRating()>=1 && movie.getRating()<=5 && movie.getName()!=null && movie.getRating()!=0) {
			mRepo.saveAndFlush(movie);
			return "Movie Added Sucesfully";
		}
		else {
			return "Enter Correct Movie Details";
		}
	}
	public List<Movies> deleteById(String name) {
		mRepo.deleteById(name);
		return mRepo.findAll();
	}
	public List<Movies> update(Movies movie){
		mRepo.saveAndFlush(movie);
		return mRepo.findAll();
	}
}
