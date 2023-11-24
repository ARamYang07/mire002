package java_basic;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		String[] label = {"순번","이름", "국어","영어","수학","과학","총점","평균"};
		
		Scanner scann = new Scanner(System.in);
		final int STUDENT_NUM;
		
		System.out.print("학생 수 : ");
		STUDENT_NUM = scann.nextInt();scann.nextLine();
		
		String[] name= new String[STUDENT_NUM];		
		int[] kor = new int[STUDENT_NUM];
		int[] eng = new int[STUDENT_NUM];
		int[] math = new int[STUDENT_NUM];
		int[] scien = new int[STUDENT_NUM];
		int[] total = new int[STUDENT_NUM];
		float[] evg = new float[STUDENT_NUM];
		
		//입력
		for(int i=0;i<STUDENT_NUM;i++ ) {
			System.out.println("학생 "+(i+1)+" 정보 입력");
			System.out.print("이름 : ");
			name[i] = scann.nextLine();
			System.out.print("국어 : ");
			kor[i] = scann.nextInt();scann.nextLine();
			System.out.print("영어 : ");
			eng[i] = scann.nextInt();scann.nextLine();
			System.out.print("수학 : ");
			math[i] = scann.nextInt();scann.nextLine();
			System.out.print("과학 : ");
			scien[i] = scann.nextInt();scann.nextLine();
		}
		
		
		//처리
		for(int stuNum = 0;stuNum < STUDENT_NUM;stuNum++) {
			total[stuNum] = kor[stuNum]+eng[stuNum]+math[stuNum]+scien[stuNum];
			evg[stuNum] = (int)((total[stuNum]/4f)*100+0.5f)/100f;
		}
		
		
		//출력
		System.out.println("정보입력을 마쳤습니다.");
		for(int i=0;i<label.length;i++) {
			System.out.print(label[i]+"\t");
		}
		
		System.out.println();
		
		for(int stuNum = 0;stuNum < STUDENT_NUM;stuNum++) {
			System.out.println(stuNum+"\t"+name[stuNum]+"\t"
						       +kor[stuNum]+"\t"+eng[stuNum]+"\t"
						       +math[stuNum]+"\t"+scien[stuNum]+"\t"
						       +total[stuNum]+"\t"+evg[stuNum]+"\t");
		}
		
	}

}
