package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//with component annotation spring will automatically register this class to spring container. Here "myTennisCoach"
//is the id used to retrieve this bean from the spring container.
@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	// Setter injection using annotation

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	// Method injection using annotation 

	@Autowired
	@Qualifier("randomFortuneService")
	public void doSomeCrazzy(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do 30 minutes of exercise for increasing stamina.";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}
