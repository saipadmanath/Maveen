package javaprogram;

import java.util.Scanner;

public class Palindaram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 	
		String input = sc.next();
		StringBuilder rev1 = new StringBuilder(input);
		rev1.reverse();
		System.out.println("Input string is:"+ rev1);
						
	String rev2= rev1.toString();
		
		if(input.equals(rev2))
				{
			System.out.println("this is palindaram:"+rev2);
				}
		else
			System.out.println("This is not a palindaram:"+rev2 );
	}
}
