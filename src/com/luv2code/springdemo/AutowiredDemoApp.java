package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BadmintonCoach badmintonCoach = (BadmintonCoach) context.getBean("badmintonCoach", Coach.class);
		System.out.println(badmintonCoach.getDailyWorkout());
		System.out.println(badmintonCoach.getDailyFortune());
		System.out.println("************");
		TennisCoach tennisCoach = (TennisCoach) context.getBean("tennisCoach", Coach.class);
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
//		System.out.println(tennisCoach.doSomeCrazzy());
		context.close();
	}
}
