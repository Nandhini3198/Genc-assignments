package com.example.Mentor_on_demand.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mentor_on_demand.model.Trainings;
import com.example.Mentor_on_demand.repo.TrainingsRepository;





@CrossOrigin(origins = "http://localhost:4201")
@RestController
@RequestMapping("/api")
public class TrainingsController {
	
	@Autowired
	TrainingsRepository trainingrepo;
	
	@GetMapping("/trainings")
	public List<Trainings> getAllCustomers() {
		System.out.println("Get all Customers...");
        
		List<Trainings> trainings = new ArrayList<>();
		
		trainingrepo.findAll().forEach(trainings::add);

		return trainings;
	}
	
	
	@PostMapping(value = "/trainings/create")
	public Trainings postCustomer(@RequestBody Trainings training) {

		Trainings _training = trainingrepo.save(new Trainings(training.getId(),training.getUser_id(),training.getMentor_id(),training.getSkill_id(),training.getStatus(),training.getProgress(),training.getRating(),training.getStart_date(),training.getEnd_date(),training.getStart_time(),training.getEnd_time(),training.getAmount_received()));
		return _training;
	}
	
	@GetMapping("/propose/{id}")
	public ResponseEntity<Trainings> updateTrainings(@PathVariable("id") long id, @RequestBody Trainings training) {
		
		System.out.println("inside propose");
		System.out.println("Update Trainings with id = " + id + "...");

		Optional<Trainings> trainingdata = trainingrepo.findById(id);

		if (trainingdata.isPresent()) {
			Trainings _training = trainingdata.get();
			_training.setStatus("proposed");
			return new ResponseEntity<>(trainingrepo.save(_training), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

@GetMapping("/approve/{id}")
public ResponseEntity<Trainings> updateTrainingStatus(@PathVariable("id") long id, @RequestBody Trainings training) {
	System.out.println("inside approve");
	System.out.println("Update Trainings with ID = " + id + "...");

	Optional<Trainings> trainingdata = trainingrepo.findById(id);

	if (trainingdata.isPresent()) {
		Trainings _training = trainingdata.get();
		_training.setStatus("approved");
		return new ResponseEntity<>(trainingrepo.save(_training), HttpStatus.OK);
	} else {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}	
@GetMapping("/trainingsCompleted")
public List<Trainings> getCompletedTrainings() {
	
    
	List<Trainings> trainings = new ArrayList<>();
	
	trainingrepo.findCompletedTrainings("completed");

	return trainings;
}

@GetMapping(value = "trainings/{id}")
public List<Trainings> updateByAge(@PathVariable long id) {
	System.out.println("in");
	List<Trainings> trainings = new ArrayList<>();
    String name="proposed";
	return trainingrepo.updateUserSetNameForAge(name, id);

}

}
