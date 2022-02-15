package com.java.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Programs {
	public void StringBuffer() {
		
		String gi ="Agni";
		StringBuffer buffer= new StringBuffer();
		buffer.append(gi);
		System.out.println(buffer.reverse());
		
	}
	public void OwnSolution() {
		String gi ="Agni";
		char[] array=gi.toCharArray();
		String reverse="";
		for(int i= array.length-1;i>=0;i--) {
			reverse=reverse+array[i];
		}
		System.out.println(reverse);
	}
	public void collections() {
		String gi= "Agni";
		char[] array = gi.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (Character character : array) {
			list.add(character);	
		}
		Collections.reverse(list);
		ListIterator iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		
	}
	public static void main(String[] args) {
		Programs pr= new Programs();
		pr.StringBuffer();
		pr.OwnSolution();
		pr.collections();
	}

}
