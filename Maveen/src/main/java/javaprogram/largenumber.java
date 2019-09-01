package javaprogram;

public class largenumber {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 20, 30, 50, 4, 71, 100};
		int largest = arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>largest)
		{
			
			largest=arr[i];
		}
	}

	//System.out.println("The Given Array Element is:");
		//for(int i = 0; i < arr.length;i++)
	//	{
	//		System.out.println(arr[i]);
	///	}
		System.out.println("From The Array Element Largest Number is:" + largest);
	
}
}
	
	