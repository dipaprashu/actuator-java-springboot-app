package com.main.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.it.entity.Student;
import com.main.it.service.StudentService;

@RestController
@RequestMapping("/v1")
public class StudentController {

	@Autowired
	public StudentService studentService;

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();

	}

	@GetMapping("/student/{rollNo}")
	public Student getStudentByRollNumber(@PathVariable("rollNo") int rollNo) {
		return studentService.getByRollNumber(rollNo);

	}
	
	@DeleteMapping("/student/{rollNo}")
	public void deleteStudentByRollNo(@PathVariable("rollNo") int rollNo) {
		studentService.delete(rollNo);
	}
	
	@PostMapping("/student")
	public void saveStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
	}

}
