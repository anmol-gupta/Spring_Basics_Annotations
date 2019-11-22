package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = { "Unlucky day!!", "Superfabulous day", "Stay at home" };

	private Random myRandom = new Random();

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(data.length);
		String res = data[index];
		return res;
	}

}
