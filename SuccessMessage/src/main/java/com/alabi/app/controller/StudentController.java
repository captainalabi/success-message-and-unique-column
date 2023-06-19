/*
 * Demonstrates the use of 
 * 1. RedirectAttributes for sending success message
 * after form submission without re-submission on refresh
 * 2. Use of @Column(unique=true) in entity class to prevent double entry of a unique column
 * and subsequent catch of DataIntegrityConstraintViolationException
 * with a custom message to the console
 */

package com.alabi.app.controller;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alabi.app.entity.Student;
import com.alabi.app.service.StudentService;

@RestController
public class StudentController {

	private StudentService studentService;
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping("/student/new")
	public ModelAndView createStudentForm() {
		ModelAndView mav = new ModelAndView("createStudent");
		mav.addObject("student", new Student());
		return mav;
	}
	
	@PostMapping("/students/createStudent")
	public ModelAndView createStudent(@ModelAttribute Student student,
																		RedirectAttributes redirectAttributes) {
		
		ModelAndView mav = new ModelAndView("redirect:/student/new");
		String successMessage = "";
		
		if(Student.isValid(student)) {
			try {
			 studentService.createStudent(student);
			 successMessage = "Student record created successfully";
			}catch(DataIntegrityViolationException e) {
				successMessage = "This student record already exists!";
			}			
	}else {
			 successMessage = "Failed ! Please try again";
					}
		redirectAttributes.addFlashAttribute("successMessage", successMessage);

		return mav;
	}
}
