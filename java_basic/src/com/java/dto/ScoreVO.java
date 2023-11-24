package com.java.dto;

import java.util.Scanner;

public class ScoreVO {

	public String name;
	public int math;
	public int kor;
	public int eng;
	public int scien;
	
	public  int total() {
		return kor+math+eng+scien;
	}
	
	public float evg() {
		return ((int)(total()/4f*100+0.5))/100f;
	}
	
	public void input() {
		Scanner scann = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = scann.nextLine();
		
		System.out.print("국어 : ");
		kor=scann.nextInt();scann.nextLine();
		
		System.out.print("영어 : ");
		eng=scann.nextInt();scann.nextLine();
		
		System.out.print("수학 : ");
		math=scann.nextInt();scann.nextLine();
		
		System.out.print("과학 : ");
		scien=scann.nextInt();scann.nextLine();
	}
	
	public static void printLabel() {
		System.out.println("이름\t국어\t영어\t수학\t과학\t총점\t평균");
	}
	public void printScore() {
		
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+scien
							+"\t"+total()+"\t"+evg());
	}
}






