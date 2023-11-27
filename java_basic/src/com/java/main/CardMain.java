package com.java.main;

import com.java.dto.Card;
import com.java.dto.TriangleVO;

public class CardMain {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		Card c3 = new Card();
		
		
//		c1.height = 9;
//		c1.width = 5;
////		
//		c2.height = 12;
//		c2.width = 8;
////		
//		c3.height = 21;
//		c3.width = 11;
//		
		Card.width = 100;
		Card.height = 200;
		
		System.out.println("c1 카드 너비 : "+c1.width);
		System.out.println("c1 카드 높이 : "+c1.height);
		System.out.println("c2 카드 너비 : "+c2.width);
		System.out.println("c2 카드 높이 : "+c2.height);
		System.out.println("c3 카드 너비 : "+c3.width);
		System.out.println("c3 카드 높이 : "+c3.height);
		System.out.println("Card 카드 너비 : "+Card.width);
		System.out.println("Card 카드 높이 : "+Card.height);

		
	}

}
