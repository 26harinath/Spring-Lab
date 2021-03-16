package org.capg.demo.dao;

import java.util.List;

import org.capg.demo.bean.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieJpaRepository extends JpaRepository<Movies, String> {
	public List<Movies> findByGenre(String genre);
}
