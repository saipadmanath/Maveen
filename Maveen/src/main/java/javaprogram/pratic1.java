package javaprogram;

public class pratic1 
{

	public static void main(String[] args) 
	{
		int []arr =new int[] {10,15,1,50,55,41,100,25,144};
		int largest = arr[0];
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				
				largest=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.println("The give the arrry input is :"+arr[i]);
		}
		System.out.println("From The Array Element Largest Number is:" + largest);
		
	}
}

			
