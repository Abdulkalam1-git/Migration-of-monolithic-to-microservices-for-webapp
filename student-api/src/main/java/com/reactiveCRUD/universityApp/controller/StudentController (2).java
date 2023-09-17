package com.reactiveCRUD.universityApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactiveCRUD.universityApp.model.Student;
import com.reactiveCRUD.universityApp.service.RegistrationService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("department")
@AllArgsConstructor
@RestController
public class StudentController {
	
	@Autowired
	private RegistrationService registrationService;

	@GetMapping
	public String getText() {
		return "Welcome to REST API";
	}
	
	
	}
