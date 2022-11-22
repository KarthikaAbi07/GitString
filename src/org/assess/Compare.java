package org.assess;

import java.util.Scanner;

public class Compare {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("String 1 :");
		String s1 = s.nextLine();
		
		System.out.println("String 2 :");
		String s2 = s.next();
		int i = s1.compareTo(s2);
		System.out.println(i);
		
		
	}

}
