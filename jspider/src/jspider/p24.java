package jspider;

import java.util.Scanner;

public class p24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int k=i;
			for(int j=1;j<=i;j++)
			{
			
				System.out.print(k+" ");
				k=k+n-j;

	        }
            System.out.println();
         }
				/*	1
					2 6
					3 7 10
					4 8 11 13
					5 9 12 14 15 */
		}
	}
