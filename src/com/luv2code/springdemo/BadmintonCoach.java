package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
//	@Autowired
//	public BadmintonCoach(FortuneService fortuneService) {
//		// TODO Auto-generated constructor stub
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice smashes!!";
	}
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}
