package com.main.it.service;

import java.util.List;

import com.main.it.entity.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
	
	public Student getByRollNumber(int rollNo);
	
	public void saveStudent(Student student);
	
	public void delete(int rollNo);
	

}
