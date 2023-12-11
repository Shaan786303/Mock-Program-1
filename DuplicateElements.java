//Q1. Given an array of integers, write a Java program to find and print all the duplicate elements.

// Output-
//*********

// Duplicate elements in an array: 10 15 7 

public class DuplicateElements 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,10,15,15,7,7,6,3}; 
		System.out.print("Duplicate elements in an array: ");  
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{  
				if(arr[i]==arr[j])
				{
					System.out.print(arr[j]+" ");   
				}
			}
		}
	}
}
