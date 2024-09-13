package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class SpringBootFinalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFinalApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

	/*
	 *	Student estudiante1 = new Student ("Diego","gómez","Dg@gmail.com");
	*	studentRepository.save(estudiante1);
	 	
	 *	Student estudiante2 = new Student ("Mario","Vargas","mvargas@gmail.com");
	 *	studentRepository.save(estudiante2);
	 
	 *	Student estudiante3 = new Student ("Jesús","Ramírez","Jesúsram@gmail.com");
	 *	studentRepository.save(estudiante3);
	 */
	}

}
