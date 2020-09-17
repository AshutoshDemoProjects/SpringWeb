package edu.iet.aopDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.iet.aopDemo.pojo.Employee;
import edu.iet.aopDemo.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService es = ac.getBean("EmpSer",EmployeeService.class);

		es.addEmployee(new Employee(1001, "XYZ", 5000));
		es.addEmployee(new Employee(1002, "PQR", 15000));
		es.addEmployee(new Employee(1001, "ABC", 25000));

		System.out.println(es.getEmployee(1002));

		es.getAll().forEach(System.out::println);
	}
}
