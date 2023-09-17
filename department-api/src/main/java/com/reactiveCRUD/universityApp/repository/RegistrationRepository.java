package com.reactiveCRUD.universityApp.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.reactiveCRUD.universityApp.model.Student;

import reactor.core.publisher.Flux;

@Repository
public interface RegistrationRepository extends  ReactiveCrudRepository<Student, String>{

	
	@Query("select *from student")
	public Flux<Student> findStudentById(String id);
	
}
