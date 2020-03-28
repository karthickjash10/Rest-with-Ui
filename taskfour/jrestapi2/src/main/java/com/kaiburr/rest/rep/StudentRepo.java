package com.kaiburr.rest.rep;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.kaiburr.rest.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	List<Student> findByName(String name);
	
}
