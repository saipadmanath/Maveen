package javaprogram;

public class missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			   int a[]  = new int[]{1,2,3,4,6,7};
			   int sum=0;
			   for(int i=0;i<a.length;i++)
			   {
				   sum=sum+a[i];
			   }
			   int t2sum=0;
			   for(int j=0;j<a.length;j++)
			   {
				   t2sum=t2sum+j;
				   
			}
			   System.out.println(sum);
			   System.out.println(t2sum-sum);
	}
	}
	
			   
			   
			  