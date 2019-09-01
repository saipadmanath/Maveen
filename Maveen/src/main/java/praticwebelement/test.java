package praticwebelement;

public class test {

	public static void main(String[] args) {
	int []arr= new  int [] {1,2,3,5,4,1,5,2,1,4,7,8,4,5,5};
	int largest = arr[0];
	int second =arr[0];
	for(int i=1;i<arr.length;i++)
		
	{
		if(arr[i]>largest)
		{
			second = largest;
			largest = arr[i];
		}
		
		else if (arr[i] >second)
		{
			second = arr[i];
			
		}
			
	}
	System.out.println("The largest number is:"+second);
}
}
	