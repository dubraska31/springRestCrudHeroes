package com.example.demo.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.example.demo.models.Student;

@Service
public class StudentService {

	ArrayList<Student> studentsList = new ArrayList<Student>();

	public ArrayList<Student> getStudents() {
		return studentsList;
	}

	public Student getStudentById(int id) {
		for (Student student : studentsList) {
			if (student.getId() == id) {
				return student;
			}
		}
		return null;
	}
	
	public Student createStudent(Student student) {
		studentsList.add(student);
		return student;
	}
	
	public Student updateStudent(int id, Student newStudent) {
		for (Student oldStudent : studentsList) {
			if (oldStudent.getId() == id) {
				int pos = studentsList.indexOf(oldStudent); 
				studentsList.set(pos, newStudent);
				break;
			}
		}
		
		return newStudent;
	}
	
	public void deleteStudent(int id) {
		int pos = -1;
		for (Student oldStudent : studentsList) {
			if (oldStudent.getId() == id) {
				pos = studentsList.indexOf(oldStudent); 
				break;
			}
		}	
		
		studentsList.remove(pos);
	}
}
