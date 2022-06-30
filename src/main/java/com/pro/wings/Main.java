package com.pro.wings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Student std1 = ctx.getBean(Student.class);
		System.out.println(std1);
		
		StdService s1 = ctx.getBean(StdService.class);
		s1.getSubject();
		
	}
}
