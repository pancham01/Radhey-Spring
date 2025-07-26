package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.model.Address;
import com.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ioc = new AnnotationConfigApplicationContext("com.spring.model");
		Employee e = ioc.getBean("employee", Employee.class);
		e.setName("Pankaj the Great");
		System.out.println(e);
//		e.getAddress().setCity("Noida");
		
		
		System.out.println("-----------------------------------------");

		Address bean = ioc.getBean(Address.class);
		System.out.println(bean);
	}

}
