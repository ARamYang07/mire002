package java_basic;

import java.util.Scanner;

public class Quiz3_lotto {

	public static void main(String[] args) {
		
		final int PRICE_PER_LOTTO = 1000; //로또 단가
		
		int[] lotto_num = new int[45];  //로또 번호
		int[][] output_num;  // 추첨번호
		int inMoney;   // 투입금액
		int lottoCnt;   // 로또횟수
		int changeMoney;  //거스름돈
		
		Scanner scann = new Scanner(System.in);
		
		//입력
		System.out.print("금액을 입력 : ");
		inMoney = scann.nextInt();scann.nextLine();
		lottoCnt = inMoney / PRICE_PER_LOTTO;
		changeMoney = inMoney % PRICE_PER_LOTTO;
		output_num = new int[lottoCnt][6];
		
		//처리
		for(int i=1;i<46;i++) {
			lotto_num[i-1]=i;
		}
		for(int count=0;count<lottoCnt;count++) {
			int temp=0;
			for(int i=0;i<45*100;i++) {
				int tempIndex = (int)(Math.random()*45); 
				temp=lotto_num[0];
				lotto_num[0] = lotto_num[tempIndex];
				lotto_num[tempIndex] = temp;
			}
			
			for(int i=0;i<6;i++) {
				output_num[count][i] = lotto_num[i];
			}
		}
		
		
		
		//출력
		for(int i=0;i<output_num.length;i++) {
			for(int j=0;j<output_num[i].length;j++) {
				System.out.print(output_num[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("거스름 돈 : ￦"+changeMoney);

	}

}
