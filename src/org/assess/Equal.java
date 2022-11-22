package org.assess;

import java.util.Scanner;

public class Equal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//example 4.4
		System.out.println("String 1 : ");
		String s1 = s.nextLine();
		
		System.out.println("String 2 : ");
		String s2 = s.next();

		boolean e = s1.equalsIgnoreCase(s2);
		System.out.println(e);

		
	}
	

}
