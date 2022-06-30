package com.pro.wings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.pro.wings")
public class AppConfig {

	@Bean
	@Primary
	public Student getStudent()
	{
		Student s = new Student();
		s.setId(10);
		s.setName("Sham");
		return s;
	}
	
	@Bean
	public Address getAddress()
	{
		return new Address(1237,"Pune");
	}
	
	@Bean
	public StdService getStd()
	{
		return new StdService();
	}
	
	@Bean
	public Student getStudent1()
	{
		return new Student();
	}
}
