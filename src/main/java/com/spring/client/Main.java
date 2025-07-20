package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Address;
import com.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e1 = ioc.getBean("emp", Employee.class);
		Employee e2 = ioc.getBean("emp", Employee.class);
		Employee e3 = ioc.getBean("emp", Employee.class);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		
		Address address1 = ioc.getBean("add",Address.class);
		Address address2 = ioc.getBean("add",Address.class);
		Address address3 = ioc.getBean("add",Address.class);
		
		System.out.println(address1);
		System.out.println(address2);
		System.out.println(address3);
		
	}

}
