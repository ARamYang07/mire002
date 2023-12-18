package com.java.collection;

import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		Set<Integer> lottoSet = new TreeSet<Integer>();
		
		while(lottoSet.size() < 6) {
			int num = 1+(int)(Math.random()*45);
			
			lottoSet.add(num);
		}
		
		System.out.println(lottoSet);

	}

}






