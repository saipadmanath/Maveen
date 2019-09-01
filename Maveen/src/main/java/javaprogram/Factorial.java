package javaprogram;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner raj =new Scanner(System.in);
		int  number =raj.nextInt();
		int fact=1;
		for(int i=1;i<number;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("The given number"+number+"factorial:"+fact);
		raj.close();
	}
}

		
		