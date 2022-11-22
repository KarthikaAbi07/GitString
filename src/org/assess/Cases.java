package org.assess;

import java.util.Scanner;

public class Cases {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//8.1
		System.out.println("Input : ");
		String s1 = s.nextLine();
		s1 = s1.toUpperCase();
		System.out.println("Output :" + s1);
		
		//8.2
		System.out.print("Input : ");
		String s2 = s.next();
		s2 = s2.toLowerCase();		
		System.out.println("Output :" + s2);
		
		
	}

}
