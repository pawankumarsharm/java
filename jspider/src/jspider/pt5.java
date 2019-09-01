package jspider;

import java.util.Scanner;

public class pt5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
				for(int k=1;k<=i;k++) {
					
				
				 System.out.print("*");
				
				}
			System.out.println();
		}
//	     *
//	    **
//	   ***
//	  ****
//	 *****
	}

}
/*for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n-i;j++)
			{
			if(i+j>n-1)
			System.out.print("*");
			else
			System.out.print(" ");
			}
			System.out.println();
			
*/