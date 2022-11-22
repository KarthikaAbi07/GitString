package org.assess;

public class IdentityCash {
	public static void main(String[] args) {
		
		String s1 = "Nisha";
		String s2 = "Nisha";
		
		System.out.println("11.1 LITERAL\n=============");
		System.out.println("Addr of s1 : "+System.identityHashCode(s1));
		System.out.println("Addr of s2 : "+System.identityHashCode(s2));
		
		//11.2 NON-LITERAL
		String s3 = new String("Nisha");
		String s4 = new String("Nisha");
		
		System.out.println("\n\n11.2 NON-LITERAL\n=============");
		System.out.println("Addr of s3 : "+System.identityHashCode(s3));
		System.out.println("Addr of s4 : "+System.identityHashCode(s4));

		//11.3 NON-LITERAL
		String s5 = new String("Nisha");
		String s6 = new String("Rengan");
		String s7 = new String("NishaRengan");
		
		System.out.println("\n\n11.3 NON-LITERAL\n=============");
		System.out.println("Addr of s5 : "+System.identityHashCode(s5));
		System.out.println("Addr of s6 : "+System.identityHashCode(s6));
		System.out.println("Addr of s7 : "+System.identityHashCode(s7));

		//11.4 LITERAL
		String s8 = "Nisha";
		String s9 = "Rengan";
		String s0 = "NishaRengan";
		
		System.out.println("\n\n11.4 LITERAL\n=============");
		System.out.println("Addr of s8 : "+System.identityHashCode(s8));
		System.out.println("Addr of s9 : "+System.identityHashCode(s9));
		System.out.println("Addr of s0 : "+System.identityHashCode(s0));

	}

}
