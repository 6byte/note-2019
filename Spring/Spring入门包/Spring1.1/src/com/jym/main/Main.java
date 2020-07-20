package com.jym.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jym.employee.Employee;

public class Main {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("spring-conf.xml");
		 Employee employee = context.getBean(Employee.class);
		 System.out.println(employee.getName());
		System.out.println("成功运行");
	}
}
