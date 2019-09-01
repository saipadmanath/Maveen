package javaprogram;

	class SimpleCalculator
	{
	    int add(int a, int b)
	    {
	         return a+b;
	    }
	    int  add(int a, int b, int c)  
	    {
	         return a+b+c;
	    }
	}
	public class Runtimepolymorphism
	{
	   public static void main(String args[])
	   {
		   SimpleCalculator obj = new SimpleCalculator();
	       System.out.println(obj.add(10, 20));
	       System.out.println(obj.add(10, 20, 30));
	   }
	}

