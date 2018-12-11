package com.xiong.project.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiong.project.Spring.info.AllConectionType;
import com.xiong.project.Spring.info.Student;

public class SpringTest {

	public static void main(String[] args) throws ClassNotFoundException {


		ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		Student student  = (Student)context.getBean("student");
		System.out.println(student);
		
		
		AllConectionType conection  = (AllConectionType)context.getBean("allContectionType");
		System.out.println(conection);
		
		
		Class<?> forName = Class.forName("com.xiong.Test");
		//System.out.println(forName);
	}

}
