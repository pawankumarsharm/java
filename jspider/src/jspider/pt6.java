package jspider;

import java.util.Scanner;

public class pt6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		/*for(int i=n;i>n;i--)
		{we can also used this loop
			for(int j=1;j<n-i;j++)
			{
				System.out.print(" ");
			}
				for(int k=1;k<=i;k++) {*/
					
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
				for(int k=1;k<=n-i+1;k++) {
					
				
				 System.out.print("*");
				}
			System.out.println();
		}
//		*****
//		 ****
//		  ***
//		   **
//		    *
	}

}
/*
 * for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n-i;j++)
			{
			if(i>j)
			System.out.print("*");
			else
			System.out.print(" ");
			}
			System.out.println();
			
 */
