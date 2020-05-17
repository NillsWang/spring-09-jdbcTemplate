package com.wmz.test;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.wmz.bean.Student;
import com.wmz.service.IStudentService;

public class MyTest {
	
	
	private IStudentService service;
	
	@Before
	public void before() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		service = (IStudentService) ac.getBean("studentService");
	}
	
	@Test
	public void testAdd() {
		
		Student student = new Student("赵六", 23);
		service.addStudent(student);
	}
	
	@Test
	public void remove() {
		//Student student = new Student();
		//student.setId(2);
		//service.removeStudent(student);
	}

	@Test
	public void modify() {
		Student student = new Student("李四", 21);
		student.setId(5);
		service.modifyStudent(student);
	}
	@Test
	public void select() {
	
		List<Student> findAllStudents = service.findAllStudents();
		for (Student student : findAllStudents) {
			System.out.println(student);
		}
	}
}
