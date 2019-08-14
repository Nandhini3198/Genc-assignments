package com.example.Mentor_on_demand.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.Mentor_on_demand.model.Trainings;

public interface TrainingsRepository extends CrudRepository<Trainings, Long> {
	
	
	@Query("Select c From Trainings c where c.status = :status")
	Trainings findCompletedTrainings(@Param("status") String status);
	
	@Modifying
	@Transactional
	@Query("update Trainings c set c.status = :status where c.id = :id")
	List<Trainings> updateUserSetNameForAge(@Param("status") String status,  @Param("id") long id);
	
}
