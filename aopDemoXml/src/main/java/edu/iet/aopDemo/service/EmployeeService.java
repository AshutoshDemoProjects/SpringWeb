package edu.iet.aopDemo.service;

import java.util.ArrayList;
import java.util.List;

import edu.iet.aopDemo.pojo.Employee;

public class EmployeeService {
	private List<Employee> elist=new ArrayList<>();
	
	public void addEmployee(Employee emp)
	{
		System.out.println("Method call EmployeeService.addEmployee()");
		elist.add(emp);
	}
	public void kuchbhi()
	{
		System.out.println("kuch bhi method");
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
