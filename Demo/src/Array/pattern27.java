package Array;

import java.util.Scanner;

public class pattern27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of stars");
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
		for(int j=0;j<n;j++)
		{
			if(i<=j)
		
			System.out.print(j);
			else
				System.out.print(" ");
			
		}
		System.out.println();
	}
	}
/*	 12345
	  2345
	   345
	    45
	     5   */

}
