package com.java.comparator;

import java.util.Comparator;

import com.java.dto.ScoreVO;

public class ScoreTotalComparator implements Comparator<ScoreVO> {

	@Override
	public int compare(ScoreVO score1, ScoreVO score2) {
		if(score1.getStuNum().equals(score2.getStuNum())){
			return 0;
		}else {
			return score2.total() - score1.total();
		}
	}

}
