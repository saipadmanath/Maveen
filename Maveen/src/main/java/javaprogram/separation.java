package javaprogram;

import java.util.Scanner;

public class separation {

	public static void main(String[] args) {
		{
			
			String Str="Rajkumar123456@#$%^";
			int alphabet=0, Digits=0,Viowels=0,Space=0,Specalchar=0;
		
			for(int i=1 ;i<Str.length();i++)
			{
				char ch= Str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='o'||ch=='u')
			{
				++Viowels;
			}
				
			else if (ch>='a'&&ch<='z')
			{
				++alphabet;
			}
			else if(ch>='0'&&ch<='9')
			{
				++Digits;
			}
			else if(ch==' ')
			{
				++Space;
			}
			else 
			{
				++Specalchar;
			}
								
			}
			System.out.println("alphabet:"+alphabet);
			System.out.println("Digits:"+Digits);
			System.out.println("Viowels:"+Viowels);
			System.out.println("Space:"+Space);
			System.out.println("Specalchar:"+Specalchar);
		}
		
	}

}
