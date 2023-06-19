package com.alabi.app.service;

import java.util.List;

import com.alabi.app.entity.Student;

public interface StudentService {

	Student createStudent(Student student);
	List<Student> readStudents();
	Student updateStudent(Student student);
	void deleteStudentById(Integer id);
}
