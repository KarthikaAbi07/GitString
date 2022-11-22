package org.assess;

public class Index {
	public static void main(String[] args) {
		
				  //0123456789012345
		String s = "GreensTechnology"; 
		int i1 = s.lastIndexOf('o');
		System.out.println(i1);

				  //0123456789012345678901	
		String s1= "SeleniumAutomationtool";
		int i2 = s1.indexOf('o');
		System.out.println(i2);
		
		String s2 = "Velmurugan";
		int i3 = s2.indexOf('n');
		System.out.println(i3);
		
		String s3 = " j a v a p r o g r a m";
		System.out.println(s3.lastIndexOf(" "));
		
		String s4 = "9095484678";
		System.out.println(s4.indexOf('8'));
	}

}
