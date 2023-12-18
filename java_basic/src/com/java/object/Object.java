package com.java.object;

import com.java.dto.ScoreVO;

public class Object {

	public static void main(String[] args) {
		ScoreVO score1 = new ScoreVO();
		ScoreVO score2 = new ScoreVO();
		
		score1.input();
		score2.input();
		
		System.out.println("score1.hashCode() : "+score1.hashCode());
		System.out.println("score2.hashCode() : "+score2.hashCode());
		
		System.out.println("score1.equals(score2) : "+score1.equals(score2));
		
		System.out.println(score1);
		System.out.println(score2);

	}

}
