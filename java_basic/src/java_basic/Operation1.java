package java_basic;

import java.util.Scanner;

public class Operation1 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		int firstInt=0;
		int secondInt=0;
		
		float sum=0f;
		float minus=0f;
		float multi=0f;
		float div=0f;
		
		int mock=0;
		int namuji=0;
		
		System.out.print("첫번째 정수 입력 : ");
		firstInt = scann.nextInt();
		System.out.print("두번째 정수 입력 : ");
		secondInt= scann.nextInt();
		
		
		sum = firstInt + secondInt;
		minus = firstInt - secondInt;
		multi = firstInt * secondInt;
		div = firstInt / (float)secondInt;
		
		mock = secondInt / firstInt;
		namuji = secondInt % firstInt;
		
		
		System.out.println("첫번째 정수 : "+firstInt);
		System.out.println("두번째 정수 : "+secondInt);
		System.out.println("더하기 : "+sum);
		System.out.println("빼기 : "+minus);
		System.out.println("곱하기 : "+multi);
		System.out.println("나누기 : "+div);
		System.out.println();
		System.out.println("몫 : "+mock);
		System.out.println("나머지 : "+namuji);
		

	}

}
