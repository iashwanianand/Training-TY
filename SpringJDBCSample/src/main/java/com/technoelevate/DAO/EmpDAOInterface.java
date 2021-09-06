package com.technoelevate.DAO;
import java.util.*;

import com.technoelevate.DTO.EmpDTO;
public interface EmpDAOInterface {
	
	public boolean insertEmp(String userid,String username,String password);
	
	public List<EmpDTO> getEmployee();
	
	public boolean deleteEmployee(String name);
	
	public List<EmpDTO> authentication(String name,String password);
	
	public List<EmpDTO> search(String name);
	
	public boolean update(String name,String password);
}
