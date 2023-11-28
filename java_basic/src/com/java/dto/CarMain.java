package com.java.dto;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println("바퀴개수 : "+car.wheel);
		
		car = new FireEngine();
		if(car instanceof FireEngine) {
			
			car = new Car();
			
			car.speedUp();
			car.speedDown();
			System.out.println(car.wheel);
			
			System.out.println("---------------------------------");
			
			FireEngine f = new FireEngine();
			car = f;
			
			car.speedUp();
			car.speedDown();
			System.out.println(car.wheel);
			System.out.println(((FireEngine)car).wheel);
			
			
		}else {
			System.out.println("Ambulance 인스턴스가 아닙니다.");
		}
	}

}
