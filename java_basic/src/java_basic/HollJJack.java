package java_basic;

import java.util.Scanner;

public class HollJJack {

	public static void main(String[] args) {
		int inputInt = 0;
		char juge = ' ';
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Ѱ��� �Է��ϼ���.");
		inputInt = scan.nextInt();
		
		if(inputInt % 2 > 0) {
			juge = 'Ȧ';
		}else {
			juge = '¦';
		}
		
		
		System.out.println("�Է��� ���� "+inputInt+"�� "+juge+"�� �Դϴ�.");
		
	}
}
