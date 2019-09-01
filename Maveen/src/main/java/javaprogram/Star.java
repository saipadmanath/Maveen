package javaprogram;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int input=sc.nextInt();
				
		switch(input)
		{
		case 1:
		{
			System.out.println("*");
			break;
		}
		
		case 2:
		{
			System.out.println("**");
			break;
		}
		case 3:
		{
			System.out.println("***");
			break;
		}
		case 4:
		{
			System.out.println("****");
			break;
		}
		case 5:
		{
			System.out.println("*****");
			break;
		}
		default:  System.out.println("Invalid Entry:"+input);

	}

  }
}
