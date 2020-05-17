package com.wmz.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wmz.bean.Student;
import com.wmz.service.IStudentService;

//spring junit4测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MyTest2 {
	
	@Autowired
	private IStudentService service;
		
	@Test
	public void testAdd() {
		
		Student student = new Student("赵六", 23);
		service.addStudent(student);
	}
	
	@Test
	public void remove() {
		Student student = new Student();
		student.setId(2);
		service.removeStudent(student);
	}
		
	@Test
	public void modify() {
		Student student = new Student("李四", 21);
		student.setId(5);
		service.modifyStudent(student);
	}
	
	@Test
	public void FindAllStudentsNames() {
		
		List<String> list = service.findAllStudentsNames();
		
		System.out.println(list);
	}
	
	@Test
	public void FindStudentsNameById() {
		
		String name = service.findStudentNameById(1);
		
		System.out.println(name);
	}
	
	@Test
	public void FindAllStudents() {
		
		List<Student> student = service.findAllStudents();
		
		for (Student student2 : student) {
			System.out.println(student2);
		}
	}
	
	@Test
	public void FindStudentById() {
		
		Student student = service.findStudentById(1);
		
		System.out.println(student);
	}
	
}
