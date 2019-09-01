package javaprogram;

public class Swaping {

	public static void main(String[] args) {
		String A= "RAj";
		String B= "kumar";
		
		System.out.println("Before Swaping "+A);
		
		A=A+B;
		B=A.substring(0,A.length()-B.length());
		A=A.substring(B.length());
		System.out.println("After Swaping:A = "+A );	
		

	}

}
