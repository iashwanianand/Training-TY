package com.technoelevate.Service;

import java.util.*;

import com.technoelevate.DTO.EmpDTO;

public interface EmpServiceInterface {
	
	public boolean addEmp(EmpDTO dto);
	
	public List<EmpDTO> getEmployee();
	
	public boolean deleteEmployee(String name);
	
	public boolean authentication(String name,String password);
	
	public boolean search(String name);
	
	public boolean update(String name,String password);
}
