package com.tyss.cg.spring_hibernate1.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tyss.cg.spring_hibernate1.bean.EmployeeTable;
import com.tyss.cg.spring_hibernate1.dao.EmployeeDao;


@Controller
public class EmployeeController {
	
	
	RequestDispatcher requestDispatcher = null;
	
	
	
	@Autowired
	private EmployeeDao employeeDao;
	
	
	
	@RequestMapping("employee")
	public String listEmployee(Model model) {
		List<EmployeeTable> list = new ArrayList<EmployeeTable>();
		list = employeeDao.get();
		
		for (EmployeeTable employeeTable : list) {
			System.out.println(employeeTable.toString());
		}
//		request.setAttribute("list", list);
//		requestDispatcher = request.getRequestDispatcher("/views/employeelist.jsp");
//		requestDispatcher.forward(request, response);
		
		model.addAttribute("list", list);
		return "employee-list";
	}
	
	@RequestMapping("delete_emp/{employee_id}")
	public String deleteUser(@PathVariable("employee_id") int employee_id) {
	//	int employee_id1 = Integer.parseInt(employee_id);
		System.out.println(employee_id);
		if (employeeDao.delete(employee_id)) {
		}
		return "employee-list";
	}
	
	
	@RequestMapping("add_emp")
	public String addUser() {
		
	}
	
	
	
}
