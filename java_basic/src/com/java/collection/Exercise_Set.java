package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise_Set {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add(1);
		set.add(2);
		set.add('a');
		set.add("a");
		set.add(false);
		set.add(1.0f);
		set.add(1.0);
		set.add(1l);
		
		System.out.println("Set ªÁ¿Ã¡Ó :"+set.size() );
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
