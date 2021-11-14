package com.yassine.dao;

import java.util.List;

import com.yassine.models.Student;

public interface StudentDAO {

	List<Student>getAllStudents();
	void saveStudent(Student student);
	Student getStudentById(int id);
	int update(Student student);
	int delete(int id);
	
	
}
