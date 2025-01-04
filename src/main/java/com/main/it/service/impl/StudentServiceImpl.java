package com.main.it.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.it.entity.Student;
import com.main.it.repository.StudentRepository;
import com.main.it.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		List<Student> listStudent = new ArrayList<>();
		studentRepository.findAll().forEach(student -> listStudent.add(student));
		return listStudent;
	}

	@Override
	public Student getByRollNumber(int rollNo) {
		Optional<Student> optStudent = studentRepository.findById(rollNo);
		if (optStudent.isPresent()) {
			return optStudent.get();
		}
		return null;
	}

	@Override
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void delete(int rollNo) {
		studentRepository.deleteById(rollNo);
	}

}
