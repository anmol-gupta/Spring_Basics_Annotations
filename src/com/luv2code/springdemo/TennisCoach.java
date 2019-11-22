package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//with component annotation spring will automatically register this class to spring container. Here "myTennisCoach"
//is the id used to retrieve this bean from the spring container.
@Component("myTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do 30 minutes of exercise for increasing stamina.";
	}

}
