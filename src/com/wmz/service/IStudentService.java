package com.wmz.service;

import java.util.List;

import com.wmz.bean.Student;

public interface IStudentService {
	
	void addStudent(Student student);
	void modifyStudent(Student student);
	void removeStudent(Student student);
	
	List<String> findAllStudentsNames();
	
	String findStudentNameById(int id);
	
	List<Student> findAllStudents();
	
	Student findStudentById(int id);

}
