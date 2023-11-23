package java_basic;

import java.util.Scanner;

public class Kawibawibo {

	public static void main(String[] args) {
		String com_kwb = ""; // 가위 0, 바위 1, 보 2
		int com_kwb_num = 0;

		String my_kwb = ""; // 가위 0, 바위 1, 보 2
		int my_kwb_num = 0;

		int menu = 0;
		String juge = "";

		String quit = "";

		while (!quit.toUpperCase().equals("Q")) {
			// 입력
			com_kwb_num = (int) (Math.random() * 3);

			System.out.println("컴퓨터는 결정했습니다.");
			System.out.println("당신의 선택은?");

			Scanner scann = new Scanner(System.in);
			while(true) {
				System.out.println("1.가위 2.바위 3.보");
				menu = scann.nextInt();scann.nextLine();
				
				if (menu < 1 || menu > 3) {
					System.out.println("입력이 올바르지 않습니다.");
				}else {
					break;
				}
			}
			
			my_kwb_num = menu - 1;

			if (com_kwb_num == ((my_kwb_num + 1) % 3)) { // 졌어요...
				juge = "졌습니다.";
			} else {
				if (com_kwb_num == my_kwb_num) { // 비겼어요..
					juge = "비겼어요.";
				} else { // 이겼어요.
					juge = "이겼어요.";
				}
			}

			switch (my_kwb_num) {
			case 0:
				my_kwb = "가위";
				break;
			case 1:
				my_kwb = "바위";
				break;
			case 2:
				my_kwb = "보";
			}

			switch (com_kwb_num) {
			case 0:
				com_kwb = "가위";
				break;
			case 1:
				com_kwb = "바위";
				break;
			case 2:
				com_kwb = "보";
			}

			// 출력
			System.out.println("컴퓨터 : " + com_kwb);
			System.out.println("당신 : " + my_kwb);
			System.out.println(juge);

			System.out.println("더 할거에요?(그만:q)");
			System.out.println("계속하려면 아무키나 누르세요");
			quit = scann.nextLine();
		}

	}

}
