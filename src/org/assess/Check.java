package org.assess;

import java.util.Scanner;

public class Check {
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//5.1
		System.out.println("Q 5.1 Input : ");
		String s1 = s.nextLine();
		if (s1.contains("@")) {
			System.out.println("Valid Email Id");	
		} else {
			System.out.println("Invalid Email Id");
		}
	    //5.2
    	System.out.print("Q 5.2 Input :");
		String s2 = s.nextLine();
		if (s2.contains("pincode")) {
			System.out.println("valid address");			
	    }
		else {
			System.out.println("invalid address");
		}
		//5.3
		System.out.println("Q 5.3 Input :");
		String s3 = s.next();
		boolean c = s3.contains("@");
		System.out.println("Output : "+c);
			 
		 
	}


}
			


