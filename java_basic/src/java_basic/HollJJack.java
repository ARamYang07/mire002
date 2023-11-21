package java_basic;

import java.util.Scanner;

public class HollJJack {

	public static void main(String[] args) {
		int inputInt = 0;
		char juge = ' ';
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 한개를 입력하세요.");
		inputInt = scan.nextInt();
		
		if(inputInt % 2 > 0) {
			juge = '홀';
		}else {
			juge = '짝';
		}
		
		
		System.out.println("입력한 숫자 "+inputInt+"는 "+juge+"수 입니다.");
		
	}
}
