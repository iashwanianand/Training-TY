package com.technoelevate.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.technoelevate.dto.EmpDTO;
import com.technoelevate.service.EmpService;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	EmpService service;
	
	@GetMapping("/registeremployee")
	public String frontPage() {
		return"addemploee";
	}
	
	@GetMapping("/addemployee")
	public String addEmp(ModelMap map,EmpDTO dto) {
		map.addAttribute("myDtoObject",dto);
		
		EmpService serviceLayer=new EmpService();
		serviceLayer.addEmp(dto);
		
		return "AddEmployee";
	}
	
	@GetMapping("/getemployee")
	public String allEmployee() {
		return"allemployee";
	}
	
	@GetMapping("/getallemployee")
	public String getAllEmployees(ModelMap map,EmpDTO dto) {
		
		map.addAttribute("myEmploeeDetails",service.getEmployee());
		
		return "getallemployee";
	}
	
	@GetMapping("/delete")
	public String deleteEmployeeDetail() {
		return "delete";
	}
	@PostMapping("/deletemployee")
	public String deleteEmployee(ModelMap map,EmpDTO dto) {
		
		map.addAttribute("MyD/toObject",dto);
		map.addAttribute("name",dto.getEmpname());
		
		if(dto.getEmpname()!=null) {
			service.deleteEmployee(dto.getEmpname());
			map.addAttribute("status","Deleted");
		}else {
			map.addAttribute("status","Not Deleted");
		}
		return "deleteemployee";
	}
	
	@GetMapping("/login")
	public String authentication(EmpDTO dto,HttpServletRequest req) {
		HttpSession session=req.getSession();
		session.setAttribute("name",dto.getEmpname());
		return "authenticationfrontpage";
	}
	
	@PostMapping("/logincredential")
	public String authentication(ModelMap map,EmpDTO dto) {
		
		map.addAttribute("MyDtoObject",dto);
		
		if(dto.getEmpname()!=null) {
			
			
			if(service.authentication(dto.getEmpname(), dto.getPasskey())){
				
				map.addAttribute("status","Login successfull");
				map.addAttribute("username",dto.getEmpname());
				
				return "authenticationlogin";
			}else{
				map.addAttribute("status","login Failed");
				return "authenticationfrontpage";
			}
		}
		return "authenticationreturn";
		
	}
	@GetMapping("/logout")
	
	public String logout() {
		
		return "authenticationfrontpage";
	}
	
	@GetMapping("/searchemployee")
	public String searchEmployee() {
		
		return "searchfrontpage";
	}
	
	@PostMapping("/searchemp")
	public String searchEmployeeInDataBase(ModelMap map,EmpDTO dto) {
		
		map.addAttribute("DtoObjcet",dto);
		map.addAttribute("name",dto.getEmpname());
		if(dto.getEmpname()!=null) {
			if(service.search(dto.getEmpname())==true) {
				map.addAttribute("status","Record is their");
			}else {
				map.addAttribute("status","Record not their");
			}
		}
		return "searchrecord";
	}
	
	@GetMapping("/updateemp")
	public String update() {
		
		return "updatefrontpage";
		
	}
	
	@PostMapping("/updateemployee")
	public String updateEmployee(ModelMap map,EmpDTO dto) {
		
		map.addAttribute("dtoOject",dto);
		map.addAttribute("name",dto.getEmpname());
		
		if(dto.getEmpname()!=null) {
			
			if(service.search(dto.getEmpname())==true) {
				
				map.addAttribute("Record","Record is their");
				
				if(service.update(dto.getEmpname(), dto.getPasskey())) {
					
					map.addAttribute("status","Record updated");
					
				}else {
					
					map.addAttribute("status","Record Not updated");
				}
			}else {
				map.addAttribute("Record","Record is not their");
			}
		}
		return "updateemployee";
	}
	
}
