package org.assess;

public class Replace {
	public static void main(String[] args) {
		//7.1
		String s = "Welcome to java class";
		String r = s.replace("java", "sql");
		System.out.println("Q 7.1 :" +r);
		
		//7.2
		String s1 = "Greens Adayar";
		String r1 = s1.replace("Adayar", "Omr");
		System.out.println("Q 7.2 :" +r1);
		
		//7.3
		String s2 = "Welcome to java class";
		String r3 = s2.replace(" ", "#");
		System.out.println("Q 7.3 :" +r3);
		
		//7.4
		String s3 = "Nishakerala24@gmail.com";
		String r4 = s3.replace("gmail", "yahoo");
		System.out.println("Q 7.4 :" +r4);

		//7.5
		String s4 = "5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
		String r5 = s4.replace(",pincode-626101", " ");
		System.out.println("Q 7.5 :" +r5);
	}

}
