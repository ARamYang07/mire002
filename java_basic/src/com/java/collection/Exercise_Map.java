package com.java.collection;

import java.util.Map;
import java.util.TreeMap;

public class Exercise_Map {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new TreeMap<String,Integer>();
		map.put("허준호",123);
		map.put("김대호",456);
//		map.put("c",'A');
//		map.put("d","A");
//		map.put("e",true);
//		map.put("f",789f);
		
		System.out.println(map);

	}

}
