package com.ghaida.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// Create object
		Coach theCoach = new BaseballCoach();
		
		Coach theCoach2 = new TrackCoach();
		
		System.out.println("Baseball Coach : "+theCoach.getDailyWorkout());
		System.out.println("Track Coach : "+theCoach2.getDailyWorkout());
	}

}
