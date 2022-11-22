package org.assess;

public class SubString {
	public static void main(String[] args) {
		String s = "GreensTechnology";
				   //0123456789012345678901
		String s1 = "SeleniumAutomationTool";
		String s2 = "velmurugan";
		String s3 = "j a v a p r o g r a m";
		String s4 = "9095484678";
		
		String sub = s.substring(9,10);
		System.out.println("String 1 : " +sub);
		
		String sub1 = s1.substring(13,14);
		System.out.println("String 2 : " +sub1);
		
		String sub2 = s2.substring(4,5);
		System.out.println("String 3 : " +sub2);
		
		System.out.println("String 4 : " +s3.substring(8,9));
		
		System.out.println("String 5 : " +s4.substring(8,9));
	}

}
