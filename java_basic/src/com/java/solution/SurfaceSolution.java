package com.java.solution;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangularVO;
import com.java.dto.Shape;
import com.java.dto.TriangleVO;

public class SurfaceSolution {

	private Shape s;
	private int menu;

	public void start() {
		do {
			input();
	
			process();
	
			output();
		}while(true);
	}
	
	
	protected void input() {
		Scanner scann = new Scanner(System.in);
		System.out.println("1.삼각형   2.사각형    3.원");
		System.out.println("도형을 선택하시오.");
		menu = scann.nextInt();
		scann.nextLine();

		switch (menu) {
		case 1: // 삼각형
			s = new TriangleVO();
			break;
		case 2: // 사각형
			s = new RectangularVO();
			break;
		case 3: // 원
			s = new CircleVO();
			break;
		default:
			System.out.println("입력이 올바르지 않습니다.");
		}
		
		s.inputData();
	}

	protected void process() {
		switch (menu) {
		case 1:
		case 2:
		case 3:
			break;
		default:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0); // 강제종료. (비추천)
		}
	}

	protected void output() {
		System.out.println(s.outputMessage()+s.surface());
		
		System.out.println("종료(Q) 혹은 계속하시려면 아무키나 누르세요.");
		String menu = new Scanner(System.in).nextLine();
		if(menu.toUpperCase().equals("Q")) {
			System.exit(0);
		}
	}
}
