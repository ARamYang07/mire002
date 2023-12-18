package com.java.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.java.comparator.ScoreTotalComparator;
import com.java.dto.ScoreVO;

public class Exercise_Set {

	public static void main(String[] args) {
		
		Set<ScoreVO> set = new TreeSet<ScoreVO>();
		Set<ScoreVO> treeSetByComparator 
				= new TreeSet<ScoreVO>(new ScoreTotalComparator());
		
		for(int i=0;i<3;i++) {
			ScoreVO score1 = new ScoreVO();
			score1.input();
			
			set.add(score1);
			treeSetByComparator.add(score1);
		}
		
		Iterator<ScoreVO> it = set.iterator();
		while(it.hasNext()) {
			it.next().printScore();
		}
		System.out.println("----------------------------------");
		
		it = treeSetByComparator.iterator();
		while(it.hasNext()) {
			it.next().printScore();
		}
		
	
	}

}
