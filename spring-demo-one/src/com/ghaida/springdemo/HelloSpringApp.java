package com.ghaida.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
//		Load the Spring configuration file == Create the Spring Conatiner
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
//		Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach myOtherCoach = context.getBean("myOtherCoach",Coach.class);
		Coach myZumbaCoach = context.getBean("myZumbaCoach",Coach.class);
//		Call methods on the bean
		System.out.println("theCoach Retrieved bean Daily workout : "+theCoach.getDailyWorkout());
		System.out.println("myOtherCoach Retrieved bean Daily workout : "+myOtherCoach.getDailyWorkout());
		System.out.println("myZumbaCoach Retrieved bean Daily workout : "+myZumbaCoach.getDailyWorkout());
		
//		Close the context
		context.close();
	}

}
