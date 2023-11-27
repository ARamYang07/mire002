package com.java.dto;

public class TriangleVO {

	public int height=10;
	public int baseLine=100;
	
	
	public TriangleVO() {
		 this.height = 0;
		 this.baseLine = 0;
	}

	
	public TriangleVO(int height, int baseLine) {
		this.height = height;
		this.baseLine = baseLine;
	}
	
	public int surface() {
		return (int)(height*baseLine*0.5f);
	}
	
}




