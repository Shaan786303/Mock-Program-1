//Q2. Write a Java function to check if two strings are anagrams of each other.

// Output-
//********

// The given strings are: Bread and Beard
// Both strings are anagram


import java.util.Arrays;

public class AnagramString
{
	static boolean checkAnagram(String str1, String str2) 
	{
		// converting characters to lowercase
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		// to check both strings are anagram or not
		
		if(str1.length()==str2.length()) // checking length
		{ 
			// converting the strings to character arrays
			
			char[] array1 = str1.toCharArray();
			char[] array2 = str2.toCharArray();
			
			// sorting both arrays
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			// checking the characters are same or not
			
			for(int i=0;i<array1.length;i++) 
			{
				if (array1[i]!=array2[i]) 
				{
					return false;
				} 
			}
		} 
		return true;
	}
	
	public static void main(String[] args) 
	{
		// initializing two strings
		
		String str1 = "Bread";
		String str2 = "Beard";
		System.out.println("The given strings are: " + str1 +" and " + str2);
		
		// calling the checkAnagram
		
		if(checkAnagram(str1, str2)) 
		{
			System.out.println("Both strings are anagram");
		} 
		else 
		{
			System.out.println("Both strings are not anagram.");
		}
	}
}
