package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Retrieving the bean from the spring container in case of annotations is same as in case of xml config.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach tennisCoach = context.getBean("tennisCoach",Coach.class);
		System.out.println(tennisCoach.getDailyWorkout());
		context.close();
	}

}
