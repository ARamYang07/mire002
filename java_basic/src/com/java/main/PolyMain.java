package com.java.main;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangularVO;
import com.java.dto.TriangleVO;

public class PolyMain {

	public static void main(String[] args) {
		SurfaceSolution main = new SurfaceSolution();
		
		do {
			main.input();
	
			main.process();
	
			main.output();
		}while(true);
	}


}
