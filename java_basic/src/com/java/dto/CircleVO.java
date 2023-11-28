package com.java.dto;

import java.util.Scanner;

public class CircleVO extends Shape{
	
	private int radius;
	
	public CircleVO() {}

	public CircleVO(int radius) {
		this.radius = radius;
	}
	
	@Override
	public int surface() {
		return (int)(radius * radius * Math.PI);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void inputData() {
		Scanner scann = new Scanner(System.in);
		
		System.out.print("반지름 : ");
		this.radius = scann.nextInt();
		scann.nextLine();
	}

	@Override
	public String outputMessage() {
		return "원 넓이";
	}
	
	
}
