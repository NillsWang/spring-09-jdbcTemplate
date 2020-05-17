package com.wmz.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


//行映射器
public class StudentRowMapper implements RowMapper<Student> {

	//rs:不是select查询的所有结果集，而是这个结果集中当前遍历的这一行记录
	//	当查出总的结果后框架会自动遍历这个结果集，每一次遍历的一行数据，都会被放倒
	//	这个方法的rs参数中，也就是说，这里的rs代表的是一行数据，并非所有查询结果。
	//	换个角度来说，只要能执行这个方法，则rs就不会为空。
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		return student;
	}

}
