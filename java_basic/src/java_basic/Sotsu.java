package java_basic;

import java.util.Scanner;

public class Sotsu {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int temp = scann.nextInt();
		boolean isSotsu = true;
		
		for(int i=2;i<temp;i++) {
			if(temp%i == 0) {
				isSotsu = false;
			}
		}
		
		
		if(isSotsu) {
			System.out.println("�ڼ��Դϴ�.");
		}else {
			System.out.println("�ڼ��� �ƴմϴ�.");
		}

	}

}
