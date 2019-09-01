
package javaprogram;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		Scanner  raj =new Scanner (System.in);
		int n =raj.nextInt();
		int t1=0,t2=1;
		System.out.println("First "+n+"terms");
		for(int i=1;i<=n;++i)
		{

            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
				
				}

	}

}
