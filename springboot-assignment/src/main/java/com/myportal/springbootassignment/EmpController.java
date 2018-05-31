package com.myportal.springbootassignment;

import java.util.Arrays;
import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@RequestMapping(value = "/getEmployeeList", method = RequestMethod.GET)
		public List<GetEmployeeList> getAllEmployeeList()	{
		return Arrays.asList(
				new GetEmployeeList(1, "Jhon", "Admin"));
	}
	@RequestMapping(value="/postEmployeeList", method = RequestMethod.POST)
	 	public GetEmployeeList submit(@RequestBody GetEmployeeList request) {
		
		GetEmployeeList employeeList= new GetEmployeeList();
		
		employeeList.setEmpId(request.getEmpId()+1);
		employeeList.setEmpName(request.getEmpName().concat("1"));
		employeeList.setEmpDesignation(request.getEmpDesignation().concat("1"));
		
		return employeeList;
		}



}

