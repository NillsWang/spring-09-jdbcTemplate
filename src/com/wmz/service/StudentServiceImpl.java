package com.wmz.service;

import java.util.List;

import com.wmz.bean.Student;
import com.wmz.dao.IStudentDao;

public class StudentServiceImpl implements IStudentService {
	
	//由spring容器注入，所以需要添加set()方法，由容器注入属性
	private IStudentDao dao;
		
	public IStudentDao getDao() {
		return dao;
	}

	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	@Override
	public void addStudent(Student student) {
		dao.insertStudent(student);	
	}

	@Override
	public void modifyStudent(Student student) {
		dao.updateStudent(student);
	}

	@Override
	public void removeStudent(Student student) {
		dao.deleteStudent(student);
	}

	@Override
	public List<String> findAllStudentsNames() {
		return dao.selectAllStudentsNames();
	}

	@Override
	public String findStudentNameById(int id) {
		return dao.selectStudentNameById(id);
	}

	@Override
	public List<Student> findAllStudents() {
		return dao.selectAllStudents();
	}

	@Override
	public Student findStudentById(int id) {
		return dao.selectStudentById(id);
	}

}
