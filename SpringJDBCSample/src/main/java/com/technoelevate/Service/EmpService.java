package com.technoelevate.Service;

import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.technoelevate.DAO.EmpDAO;
import com.technoelevate.DTO.EmpDTO;
@Component
public class EmpService implements EmpServiceInterface{

	ApplicationContext context = new ClassPathXmlApplicationContext("com/technoelevate/SpringJDBC/config.xml");
	EmpDAO dao = context.getBean("myDAO",EmpDAO.class);
	public boolean addEmp(EmpDTO dto) {
		
		
		return dao.insertEmp(dto.getEmpid(), dto.getEmpname(), dto.getPasskey());
	}
	
		public List<EmpDTO> getEmployee() {
		
		List<EmpDTO> employeeDetails=dao.getEmployee();
		
		return employeeDetails;
	}

	public boolean deleteEmployee(String name) {
		
		dao.deleteEmployee(name);
		
		return true;
	}

	public boolean authentication(String name,String password) {
		
		if(dao.authentication(name, password)!=null) {
			return true;
		}
		return false;
	}


	public boolean search(String name) {
		if(dao.search(name)!=null) {
			return true;
		}
		return false;
	}


	public boolean update(String name, String password) {
		
		if(dao.update(name, password)==true) {
			return true;
		}else {
			return false;
		}
	}
}
