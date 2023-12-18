package com.java.io;

import java.io.File;
import java.io.FileWriter;

public class Gugudan {

	public static void main(String[] args) {
		int dan = 2;
		int gop = 9;
		
		String resultStr = "";
		
		for(dan = 2; dan < 10; dan++) {
			resultStr += dan+"단\n";
			for(gop = 1; gop < 10; gop++) {
				resultStr += dan + " * "+gop+" = "+(dan*gop)+"\n";
			}
			resultStr +="\n";
		}
		
		
		//System.out.println(resultStr);
		try {
			File file = new File("gugudan.txt");
			if(!file.exists()) file.createNewFile();
			
			FileWriter writer = new FileWriter(file);
			writer.write(resultStr);
			
			writer.close();
			
			System.out.println("구구단 파일쓰기 성공.");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("구구단 파일쓰기 실패.");
		}

	}

}
