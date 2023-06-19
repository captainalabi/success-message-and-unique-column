package com.alabi.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alabi.app.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
