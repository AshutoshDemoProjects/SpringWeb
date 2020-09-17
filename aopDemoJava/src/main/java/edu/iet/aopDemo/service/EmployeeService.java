package edu.iet.aopDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import edu.iet.aopDemo.pojo.Employee;
@Component("EmpSer")
public class EmployeeService {
	private List<Employee> elist=new ArrayList<>();
	
	public void addEmployee(Employee emp)
	{
		System.out.println("Method call EmployeeService.addEmployee()");
		elist.add(emp);
	}
	
	public Employee getEmployee(long id){
		System.out.println("Method call EmployeeService.getEmployee()");
		for(Employee e:elist) {
			if(e.getEmpid()==id)
				return e;
		}
		return null;
	}
	
	public List<Employee> getAll(){
		System.out.println("Method call EmployeeService.getAll()");
		return elist;
	}
}
