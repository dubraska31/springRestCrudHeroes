package com.example.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.models.Student;

@Service
public class StudentService {

	ArrayList<Student> studentsList = new ArrayList<Student>();

	public ArrayList<Student> getStudents() {
		return studentsList;
	}

	public Student getStudentById(@PathVariable int id) {
		for (Student student : studentsList) {
			if (student.getId() == id) {
				return student;
			}
		}
		return null;
	}
}
