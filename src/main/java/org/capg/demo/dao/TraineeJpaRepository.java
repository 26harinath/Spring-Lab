package org.capg.demo.dao;

import java.util.List;

import org.capg.demo.bean.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TraineeJpaRepository extends JpaRepository<Trainee, Integer> {
	public List<Trainee> findByTraineeName(String traineeName);
}
