package edu.iet.aopDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.iet.aopDemo.pojo.Employee;
import edu.iet.aopDemo.service.EmployeeService;
import edu.iet.aopDemo.service.TempService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac= new ClassPathXmlApplicationContext("application.xml");
    	EmployeeService es= (EmployeeService)ac.getBean("EmpSer");
        TempService ts=ac.getBean("TempSer",TempService.class);
        es.addEmployee(new Employee(1001,"XYZ",5000));
        es.addEmployee(new Employee(1002,"PQR",15000));
        es.addEmployee(new Employee(1001,"ABC",25000));
        
        es.kuchbhi();
        
        System.out.println( es.getEmployee(1002));
        
        es.getAll().forEach(System.out::println);
        
        ts.foo();
    }
}
