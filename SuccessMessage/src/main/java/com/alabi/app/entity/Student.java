package com.alabi.app.entity;

import io.micrometer.common.util.StringUtils;
import jakarta.persistence.*;

@Entity
public class Student {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String depatment;
	@Column(unique = true)
	private String email;		
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepatment() {
		return depatment;
	}
	public void setDepatment(String depatment) {
		this.depatment = depatment;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", depatment=" + depatment + ", email=" + email + "]";
	}
	public static Boolean isValid(Student student) {
		return student != null 
				&& StringUtils.isNotBlank(student.name)
				&& StringUtils.isNotBlank(student.depatment)
				&& StringUtils.isNotBlank(student.email);
	}
}
