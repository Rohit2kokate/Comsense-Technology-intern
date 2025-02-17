package com.intern.map;

import java.util.HashMap;
import java.util.Map;
//import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
//import java.util.Set;

public class hashMap {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> maps=new HashMap<>();
		/*for(int i=0;i<5;i++) {
			String s;
			
			System.out.println("Enter the number");
			s=sc.nextLine();
			System.out.println("Enter the number");
			int key=sc.nextInt();
			maps.put(key, s);
			sc.nextLine();
		}
//		System.out.println(map);
//		
//		int size=map.size();
//		for(int i=0;i<size;i++) {
//			System.out.println(map.get(i));
//		}
//		System.out.println(map);
		//Set<Map.Entry<Integer, String>> m=maps.entrySet();
		for(Entry<Integer, String> i:maps.entrySet()) {
			System.out.println(i.getKey()+" "+i.getValue());
		}
		for(Entry<Integer,String> s:maps.entrySet()) {
			s.setValue(s.getValue().toUpperCase());	
		}
		System.out.println(maps);*/
		HashMap<Character, Integer> m=new HashMap<>();
		String s;
		s=sc.next();
		int size=s.length();
		for(int i=0;i<size;i++) {
			char c=s.charAt(i);
			m.put(c, m.getOrDefault(c, 0)+1);
		}
		System.out.println(m);
	}
}
