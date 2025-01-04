package com.main.it.repository;

import org.springframework.data.repository.CrudRepository;

import com.main.it.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
