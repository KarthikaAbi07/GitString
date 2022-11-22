package org.assess;

import java.util.Scanner;

public class PhoneNumberCheck {
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		//Example 1
		System.out.println("Input : ");
		String s1 = s.nextLine();
		if(s1.length()==10 ) {
			System.out.println("Valid");
		}		
		else {
			System.out.println("InValid");
		}
		//Example 2
		System.out.println("Input : ");
		String s2 = s.next();

		if(s2.length()==10 ) {
			System.out.println("Valid");
		}		
		else {
			System.out.println("InValid");
		}
							
	}

}
