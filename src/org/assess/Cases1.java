package org.assess;

public class Cases1 {
public static void main(String[] args) {
	//9.1
	String s = "Welcome to class java";
	boolean st = s.startsWith("Welcome");
	System.out.println("Qus 9.1 : " +st);
	
	//9.2
	String s1 = "Hai i am nisha";
	boolean st1 = s1.startsWith("Welcome");
	System.out.println("Qus 9.2 : "+st1);
	
	//9.3
	String s2 = "Welcome to java class";
	boolean st2 = s2.endsWith("class");
	System.out.println("Qus 9.3 : "+st2);
	
	//9.4
	String s3 = "Welcome to java class";
	boolean st3 = s3.startsWith("java");
	System.out.println("Qus 9.4 : "+st3);
	
	//9.5
	String s4 = "Welcome to java class";
	boolean st4 = s4.isEmpty();
	System.out.println("Qus 9.5 : "+st4);
	
	//9.6
	String s5 = " ";
	boolean st5 = s5.isEmpty();
	System.out.println("Qus 9.6 : "+st5);
	
	//13
	String s6="Welcome to java class";
	String sub = s6.substring(0,7);
	System.out.println("Sub String(Qus 13) : "+sub);
	
	
}
}
