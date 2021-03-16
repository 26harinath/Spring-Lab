package org.capg.demo.service;

import java.util.List;

import org.capg.demo.bean.Trainee;
import org.capg.demo.dao.TraineeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("traineeService")
public class TraineeService {

	@Autowired
	private TraineeJpaRepository traineeRepo;
	
	public List<Trainee> displayAll(){
		return traineeRepo.findAll();
	}
	
	public Trainee displayById(int traineeId){
		return traineeRepo.findById(traineeId).get();
	}
	public List<Trainee> displayByName(String traineeName){
		System.out.println("==================================="+traineeName);
		return traineeRepo.findByTraineeName(traineeName);
	}
	public List<Trainee> deleteById(int traineeId){
		traineeRepo.deleteById(traineeId);
		return traineeRepo.findAll();
	}
	public List<Trainee> update(Trainee trainee) {
		traineeRepo.saveAndFlush(trainee);
		return  traineeRepo.findAll();
	}
	public List<Trainee> insert(Trainee trainee){
		traineeRepo.saveAndFlush(trainee);
		return traineeRepo.findAll();
	}
	
}
