package com.technoelevate.DAO;
import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.technoelevate.DTO.EmpDTO;

public class EmpDAO implements EmpDAOInterface{
JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public boolean insertEmp(String userid,String username,String password) {
		
		String query = "insert into jdbc.emp values(?,?,?)";
		
		template.update(query, userid,username, password);
		
		return true;
	}
	
	public List<EmpDTO> getEmployee() {
		RowMapper<EmpDTO> rowmap=new RowMapperImplementation();
		String query1="select * from jdbc.emp";
		List<EmpDTO> list=template.query(query1, rowmap);
		return list;
	}

	public boolean deleteEmployee(String name) {
		String query="delete from jdbc.emp where userName=?";
		template.update(query,name);
		return true;
	}

	public List<EmpDTO> authentication(String name,String password) {
		
		String query="select * from jdbc.emp where username='"+name+"' and userpassword='"+password+"'";
		List<EmpDTO> list=template.query(query,new RowMapperImplementation());
		
		return list.size()>0 ? list:null;
	}

	public List<EmpDTO> search(String name) {
		
		String query="select * from jdbc.emp where username='"+name+"'";
		List<EmpDTO> list=template.query(query,new RowMapperImplementation());
		return list.size()>0 ? list:null;
	}

	public boolean update(String name, String password) {
		String query="update  jdbc.emp set userPassword=? where userName='"+name+"'";
		template.update(query,password);
		return true;
	}
}
