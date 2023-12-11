//3. Write a Java program to print a right-angled triangle of stars. 
//   The number of rows should be taken as input.

// Output-
//*********

/*  Enter A Number:
 *  5
 *  * 
 *  * * 
 *  * * * 
 *  * * * * 
 *  * * * * * 
 */

import java.util.Scanner;

public class RightTriangle 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number:");
	    int num=sc.nextInt();
	    for(int i=0;i<num;i++)   
	    {   
	    	for(int j=0;j<=i;j++)   
	    	{   
	    		System.out.print("* ");
			}
	    	System.out.println();
		}
		sc.close();
	}
}
