package com.example.springbootbasics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@GetMapping("/person")
	public List<Person> getAllPersons(){
		return Arrays.asList(new Person("Sati", "Patil", 26));
	}
}
