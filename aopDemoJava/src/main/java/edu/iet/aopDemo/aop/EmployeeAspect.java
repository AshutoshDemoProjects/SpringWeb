package edu.iet.aopDemo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
	@After("execution(* get*(..))")
	public void beforAllFunction() {
		System.out.println("Point cut after all methods....");
	}
}
