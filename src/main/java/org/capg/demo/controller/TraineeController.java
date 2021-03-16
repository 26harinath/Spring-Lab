package org.capg.demo.controller;

import java.util.List;

import org.capg.demo.bean.Trainee;
import org.capg.demo.service.TraineeService;
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
@RequestMapping("/trainee")
public class TraineeController {

	@Autowired
	private TraineeService traineeService;
	@GetMapping
	public List<Trainee> displayAll(){
		return traineeService.displayAll();
	}
	@GetMapping("/{traineeId}")
	public Trainee displayById(@PathVariable int traineeId){
		return traineeService.displayById(traineeId);
	}
	@GetMapping("name/{traineeName}")
	public List<Trainee> displayByName(@PathVariable String traineeName){
		return traineeService.displayByName(traineeName);
	}
	@DeleteMapping("/{traineeId}")
	public List<Trainee> deleteById(@PathVariable int traineeId){
		return traineeService.deleteById(traineeId);
	}
	@PutMapping
	public List<Trainee> update(@RequestBody Trainee trainee) {
		return traineeService.update(trainee);
	} 
	@PostMapping
	public List<Trainee> insert(@RequestBody Trainee trainee){
		return traineeService.insert(trainee);
	}
	
}
