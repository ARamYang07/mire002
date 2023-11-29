package com.java.dto;

import java.util.Scanner;

import com.java.ifc.Inputable;
import com.java.ifc.Outputable;

public class CircleVO extends Shape
                      implements Inputable,Outputable{
	
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
	public void input() {
		Scanner scann = new Scanner(System.in);
		
		System.out.print("반지름 : ");
		this.radius = scann.nextInt();
		scann.nextLine();
	}

	@Override
	public String output() {
		return "원 넓이";
	}
	
	
}
