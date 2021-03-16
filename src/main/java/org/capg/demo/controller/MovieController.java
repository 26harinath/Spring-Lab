package org.capg.demo.controller;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.capg.demo.bean.Movies;
import org.capg.demo.service.MovieServiceJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {
 
	@Autowired
	private MovieServiceJpa mService;
	
	@GetMapping
	public List<Movies> displayAll(){
		return mService.displayAll();
	}
	@GetMapping("/{name}")
	public Movies findMovieByName(@PathVariable String name) {
		return mService.findMovieByName(name);
	}
	@GetMapping("genre/{genre}")
	public List<Movies> findMovieByGenre(@PathVariable String genre){
		return mService.findMovieByGenre(genre);
	}
	@PostMapping
	public String addMovie(@RequestBody Movies movie){
		return mService.addMovie(movie);
	}
	@DeleteMapping("/{name}")
	public List<Movies> deleteById(@PathVariable String name) {
		return mService.deleteById(name);
	}
	@PutMapping()
	public List<Movies> update(@RequestBody Movies movie){
		return mService.update(movie);
	}
	
}
