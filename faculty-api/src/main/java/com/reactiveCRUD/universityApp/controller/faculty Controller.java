package com.reactiveCRUD.universityApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("findFibo")
public class facultyController {

	@GetMapping
	public List<Integer> findFibonacii() {
		Integer f1=-1;
		Integer f2=1;
		Integer f3=null;
		List<Integer> num=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			f3=f1+f2;
			num.add(f3);
			f1=f2;
			f2=f3;
		}
		return num;
	}
}
