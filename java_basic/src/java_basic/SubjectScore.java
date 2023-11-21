package java_basic;

import java.util.Scanner;

public class SubjectScore {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		int kor=0;
		int eng=0;
		int math=0;
		int scien=0;
		
		int total=0;
		float evg=0f;
		char grade='F';
		
		System.out.print("국어 점수 : ");
		kor = scann.nextInt();
		
		System.out.print("영어 점수 : ");
		eng = scann.nextInt();
		
		System.out.print("수학 점수 : ");
		math = scann.nextInt();
		
		System.out.print("과학 점수 : ");
		scien = scann.nextInt();
		
		
		total = kor + eng + math + scien;
		evg = total/4f;
		evg = (int)((evg*100+5)/10)/10f;
		
		if(evg < 60) {grade = 'F';}
		if(evg >= 60) {grade = 'D';}
		if(evg >= 70) {grade = 'C';}
		if(evg >= 80) {grade = 'B';}
		if(evg >= 90) {grade = 'A';}
		
		System.out.println("국어\t영어\t수학\t과학\t총점\t평균\t\t등급");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f\t%c",kor,eng,math,scien,total,evg,grade);
	}

}
