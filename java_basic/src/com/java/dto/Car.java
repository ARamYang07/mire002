package com.java.dto;

public class Car {

	protected int wheel=4;
	protected int breakk=4;
	protected int acell=4;
	
	public void speedUp() {
		System.out.println("부모 : 속도업");
	};
	public void speedDown() {
		System.out.println("부모 : 속도다운");
	};
}
