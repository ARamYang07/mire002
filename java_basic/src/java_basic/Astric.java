package java_basic;

import java.util.Scanner;

public class Astric {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		System.out.print("���� �Է�:");
		int inputNum = scann.nextInt();
		
		String result="";
		
		for(int i=0;i<inputNum;i++) {
			result=result+'*';
		}

		System.out.println(result);
	}

}
