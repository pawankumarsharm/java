package jspider;

import java.util.Scanner;

public class p13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
				for(int k=1;k<2*i;k++) {
					
				
				 System.out.print(k);
				}
			System.out.println();
		}

			/*	1
			   123
			  12345
			 1234567
			123456789*/
	}

}
