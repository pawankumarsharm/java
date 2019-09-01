package jspider;

import java.util.Scanner;

public class p25 {

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
			int p=1;
				for(int k=1;k<2*i;k++) {
					if(k%2==0)
				
				 System.out.print("*");
					else
						System.out.print(p++);
				 /*another method
				  for(int k=1;k<=i;k++) {
				  System.out.print(j+" ");
				  if(k<i)
				  System.out.print("*");
				  
				 */
				}
			System.out.println();
		}
					/*		1
						   1*2
						  1*2*3
						 1*2*3*4
						1*2*3*4*5 */
	}

}
