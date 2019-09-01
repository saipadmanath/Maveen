package javaprogram;

public class Duplicate {

	public static void main(String[] args) {
		 // String  S = "Natrajan";
		  //char[] Arr = S.toCharArray();
		
		 int [] Arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
		 System.out.println("Duplicate elements in given array: ");
		 
		  for(int i = 0; i < Arr.length; i++) {  
	            for(int j = i + 1; j < Arr.length; j++) {  
	                if(Arr[i] == Arr[j])  
	                    System.out.println(Arr[j]);
						}
						
					}
				 
				}
	}


