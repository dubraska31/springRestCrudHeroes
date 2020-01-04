package com.example.demo.controllers;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Student;
import com.example.demo.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@GetMapping("/students")
	public ArrayList<Student> getStudents() {
		return studentService.getStudents();
	}

	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id) {
		return studentService.getStudentById(id);
	}

	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	@PutMapping("/students/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student newStudent) {
		return studentService.updateStudent(id, newStudent);
	}

	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable int id){
		studentService.deleteStudent(id);
	}
}
