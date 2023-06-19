package com.alabi.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alabi.app.entity.Student;
import com.alabi.app.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
		
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public Student createStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public List<Student> readStudents() {

		return studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);
	}

}
