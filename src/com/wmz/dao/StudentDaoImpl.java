package com.wmz.dao;

import java.util.List;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.wmz.bean.Student;
import com.wmz.bean.StudentRowMapper;

public class StudentDaoImpl extends JdbcDaoSupport implements IStudentDao {

	//Jdbc模板对象是多例的， 系统在使用时会新创建一个
	//不能提出来一个对象然后在各个方法中调用jt的方法
	//，如下
	//	private JdbcTemplate jt;
	//	public StudentDaoImpl() {
	//		jt = this.getJdbcTemplate();
	//	}
	//	jt.update(sql, student.getName(), student.getAge());
	
	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		String sql = "insert into student4(name, age) values(?, ?)";
		this.getJdbcTemplate().update(sql, student.getName(), student.getAge());

	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		String sql = "update student4 set name = ?, age = ? where id = ?";
		this.getJdbcTemplate().update(sql, student.getName(), student.getAge(), student.getId());

	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		String sql = "delete from student4 where id = ?";
		this.getJdbcTemplate().update(sql, student.getName()
				, student.getAge(), student.getId());

	}

	@Override
	public List<String> selectAllStudentsNames() {
		// TODO Auto-generated method stub
		String sql = "select name from student4";
		return this.getJdbcTemplate().queryForList(sql, String.class);
	}

	@Override
	public String selectStudentNameById(int id) {
		// TODO Auto-generated method stub
		String sql = "select name from student4 where id = ?";
		return this.getJdbcTemplate().queryForObject(sql, String.class, id);
	}

	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		String sql = "select * from student4";
		return this.getJdbcTemplate().query(sql, new StudentRowMapper());
	}

	@Override
	public Student selectStudentById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from student4 where id = ?";
		return this.getJdbcTemplate().queryForObject(sql, new StudentRowMapper(), id);
	}

}
